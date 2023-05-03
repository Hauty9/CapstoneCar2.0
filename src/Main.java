import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Creating new scanner
		Scanner sc = new Scanner(System.in);

		//Creating new ArrayList
		ArrayList<Car> info = new ArrayList<Car>();
		String model;
		String title;
		String features;
		String rating;
		
		
		System.out.println("                                                      ");
		System.out.println("            Welcome To Hautman's Hotrods              ");
		System.out.println("                                                      ");
		System.out.println("******************************************************");
		System.out.println("*           What Would You Like To Do?               *");
		System.out.println("*                                                    *");
		System.out.println("*           Either                                   *");
		System.out.println("*                                                    *");
		System.out.println("*           Add - Add More Cars to List              *");
		System.out.println("*                                                    *");
		System.out.println("*           Print - Print Car List                   *");
		System.out.println("*                                                    *");
		System.out.println("*           Sort - Save Car List To File Sorted      *");
		System.out.println("*                                                    *");
		System.out.println("*           Delete - Delete Car List                 *");
		System.out.println("*                                                    *");
		System.out.println("*           Quit - Stop                              *");
		System.out.println("******************************************************");
		
		String choice = sc.next();
		
		switch (choice){
			//If user entered in Add this case will run
			case "Add":
				while (true) {
					System.out.println("Please Enter Car Model or q to Quit");
					model = sc.next();
					if (model.equals("q"))
						break;
			        

					
					System.out.println("Please Enter Car Title");
					title = sc.next();
				    

					System.out.println("Please Enter Car Features");
					features = sc.next();
				   

					System.out.println("Please Enter Car Rating From 1-5 Star Scale");
					rating = sc.next();
					
					info.add(new Car(model, title, features, rating));
					
					
				}
				try {
					//Creating File Location
				File file = new File("/Users/bhautman/Desktop/Rasmussen/Computer Science Bachelor Capstone 2:8:23-3:18:23/Mod 5/unsorted.txt");
				
				FileWriter writer = new FileWriter(file, true);
				
				
				for(Car str: info) {
					
					  writer.write(str + System.lineSeparator());
					}
					writer.close();
				}
					//Catch exception
					catch (IOException e) {
						 
			            // Display message when exception occurs
			            System.out.println("exception occurred" + e);
			        }
				
			Main.main(args);
				break;
			//If user selects Print, print case will start	
			case "Print":
				//Call Read_File Class
				Print_File.main(args);
				break;
				
			//If user selects Sort, sort case will start	
			case "Sort":
				//Start Sort Class
				Sort_File.main(args);
				break;
				
			//If user selects Delete, Delete case will start	
			case "Delete":
				//Start Delete Class
				Delete.main(args);
				break;
				
			//If user selects Quit the program will stop	
			case "Quit":
				System.out.println("Thank you For The Information, Goodbye");
				break;
				
			default:
					System.out.println("Invalid Input.  Please Try Again");
					Main.main(args);
			}
			sc.close();
	
	}	
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Print_File {

	public static void main(String[] args) throws IOException {
		//Path to file
		File file = new File("/Users/bhautman/Desktop/Rasmussen/Computer Science Bachelor Capstone 2:8:23-3:18:23/Mod 5/unsorted.txt");
        
		//Creating object
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		
		//Condition is true unitl a character in a string
		while ((st= br.readLine()) !=null)
			
			System.out.println(st);
			
			
		br.close();
		//Starting main class over
		Main.main(args);
	}

}

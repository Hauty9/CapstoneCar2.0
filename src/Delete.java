import java.io.File;
import java.io.IOException;

public class Delete {

	public static void main(String[] args) throws IOException {
		//Defining file that needs to be deleted
		 File myObj = new File("/Users/bhautman/Desktop/Rasmussen/Computer Science Bachelor Capstone 2:8:23-3:18:23/Mod 5/unsorted.txt"); 
		 
		    if (myObj.delete()) { 
		    	//If object was deleted this will print out
		      System.out.println("Deleted the file: " + myObj.getName());
		      
		    } else {
		    	//If object was not successful at deleting, this message will print out
		      System.out.println("Failed to delete the file.");
		    } 
		    //Starting main class over
		    Main.main(args);
	}
	
}



package file;

import java.io.File;
import java.io.IOException;

public class Create_File {
	public static void createFile(String path) {
		try {
		      File myObj = new File(path);
		      
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}

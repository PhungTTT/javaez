package file;

import java.io.File;

public class Delete_File {
	public static void deleteFile(String path) {
		 File myObj = new File(path); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else {
		      System.out.println("Failed to delete the file.");
		    } 
	}
}

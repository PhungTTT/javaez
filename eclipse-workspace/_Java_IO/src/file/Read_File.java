package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {
	public static void readFile(String path) {
		 try {
		      File myObj = new File(path);
		      //Doc file
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println(data);
		      }
		      myReader.close();
		      //Xem thong tin cua file
		      System.out.println("\nThong tin file: ");
			    if (myObj.exists()) {
			      System.out.println("File name: " + myObj.getName());
			      System.out.println("Absolute path: " + myObj.getAbsolutePath());
			      System.out.println("Writeable: " + myObj.canWrite());
			      System.out.println("Readable " + myObj.canRead());
			      System.out.println("File size:  " + myObj.length()+" byte");
			    } else {
			      System.out.println("The file does not exist.");
				    }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}

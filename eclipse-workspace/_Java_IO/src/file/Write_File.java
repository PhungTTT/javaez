package file;

import java.io.FileWriter;
import java.io.IOException;

public class Write_File {
	public static void writeFile(String path) {
		try {
		      FileWriter myWriter = new FileWriter(path);
		      myWriter.write("\"Cam on em da theo toi den day, cam on em da cho toi co hoi "
		      		  	+ "tro lai voi tuoi 20 cua toi boi \nkhi noi chuyen voi em, thuc "
		      		  	+ "tinh toi da duoc song lai tron ven nhung van de cua tuoi tre. \n"
		      		  	+ "Em moi co 20 tuoi tren vai.\n"
		      		  	+ "Tinh thuong se cho em thay duoc tinh trang dat nuoc, nhan loai, "
		      		  	+ "tinh thuong se day em hanh dong. \n"
		      		  	+ "Hanh ly cua em da day du. Hien ngang trong tu do, em hay len duong.\"");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
}

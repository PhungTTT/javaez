package file;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String path = "src/file/newFile.txt";
		int choise;
		Scanner sc = new Scanner(System.in);
			do {
				System.out.println("1.Create    2.Write    3.Read    4.Delete   0.Exit");
				System.out.println("Your choise?");
				choise = sc.nextInt();
				switch (choise) {
				case 1: {
					Create_File.createFile(path);
					break;
				}
				case 2: {
					Write_File.writeFile(path);
					break;
						}
				case 3: {
					Read_File.readFile(path);
					break;
				}
				case 4: {
					Delete_File.deleteFile(path);
					break;
				}
				case 0: {
					break;
				}
				default:
					System.out.println("Vui long chon lai!");
				}
		}while(choise!=0);
	}
}

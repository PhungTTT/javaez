package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		/*
		 * LocalDate
		 */
		//Hien thi date hien tai
		LocalDate dateNow = LocalDate.now();
		System.out.println(dateNow);
		
		/*
		 * LocalTime
		 */
		//Hien thi time hien tai
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);
		
		/*
		 * LocalDateTime
		 */
		//Hien thi date + time hien tai
		LocalDateTime dateTimeNow = LocalDateTime.now();
		System.out.println(dateTimeNow);
		/*
		 * DateTimeFormatter: Dinh dang date time
		 * yyyy-MM-dd
		 * dd/MM/yyyy
		 * dd-MMM-yyyy
		 * E, MMM dd yyyy
		 * HH:mm:ss
		 * HH:mm
		 * ...
		 * HH:mm dd/MM/yyyy
		 */
		 LocalDateTime myDateObj = LocalDateTime.now();
		 String formattedDate = myDateObj.format(DateTimeFormatter.ofPattern("HH:mm:ss dd/MM/yyyy"));
		 System.out.println(formattedDate);
	}
}

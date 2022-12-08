package Cau2_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import Cau2_model.Bus;
import Cau2_model.Car;
import Cau2_model.Manufactor;
import Cau2_model.Truck;
import Cau2_model.Vehicle;

public class Test {
	public static void main(String[] args) {
		Vehicle v1 = new Car("Civic", 2010,28000,new Manufactor("Honda","Japan"),4,200, 13);
		Vehicle v2 = new Bus("Hiace", 2011,35000,new Manufactor("Toyota", "Japan"), 12);
		Vehicle v3 = new Truck("MIGHTY", 2010,18000,new Manufactor("Huyndai", "Korea"), 2.5);
		Vehicle v4= new Truck("A", 2010,18000,new Manufactor("VinFast", "VietNam"), 2.5);
		Vehicle v5 = new Car("B", 2010,28000,new Manufactor("Mazda","Japan"),4,200, 13);
		Vehicle v6= new Truck("C", 2010,18000,new Manufactor("TOYOTA", "Japan"), 2.5);
		Vehicle v7 = new Bus("D", 2011,35000,new Manufactor("MERCEDES-BENZ", "Germany"), 12);
		Vehicle v8 = new Truck("K", 2010,18000,new Manufactor("LEXUS", "Japan"), 2.5);
		Vehicle v9 = new Truck("H", 2010,18000,new Manufactor("FORD", "USA"), 2.5);
		Vehicle v10 = new Car("E", 2010,28000,new Manufactor("FERRARI", "Italy"),4,200, 13);
		
		//Test promotionalPrice Method
		System.out.println("Gia KM:");
		System.out.println(v1.promotionalPrice());
		System.out.println(v2.promotionalPrice());
		System.out.println(v3.promotionalPrice());
	//Ds 
		ArrayList<Vehicle> listVehicle = new ArrayList<Vehicle>();
		listVehicle.add(v1);listVehicle.add(v2);listVehicle.add(v3);listVehicle.add(v4);listVehicle.add(v5);
		listVehicle.add(v6);listVehicle.add(v7);listVehicle.add(v8);listVehicle.add(v9);listVehicle.add(v10);
		
		System.out.println("-----Danh sach ban dau-----");
		for(int i = 0; i< listVehicle.size(); i++) {
			System.out.println(listVehicle.get(i));
		}
		
		//Sx:
		listVehicle.sort(new Comparator<Vehicle>() {

			@Override
			public int compare(Vehicle o1, Vehicle o2) {
				return o1.getManufactor().getCompanyName().compareTo(o2.getManufactor().getCompanyName());
			}
		});
		System.out.println("-----Danh Sach Sau khi sap xep theo ten hang xe:-----");
		for(int i = 0; i< listVehicle.size(); i++) {
			System.out.println(listVehicle.get(i));
		}
	}
}

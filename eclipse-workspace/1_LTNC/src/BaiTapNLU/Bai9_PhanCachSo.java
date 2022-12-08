package BaiTapNLU;

import java.util.Scanner;

public class Bai9_PhanCachSo {
 public static String numberFormat(long num) {
  String temp, res = "";
  temp = "" + num; //chuyen thanh chuoi
  int a = temp.length(); //a la do dai chuoi
  int count = 0;
  for (int i = a - 1; i >= 0; i--) {
   res = temp.charAt(i) + res;
   count++;
   if (count == 3) {
    if (i > 0)
     res = "," + res;
    count = 0;
   }

  }
  return res;
 }

 public static void main(String[] args) {
  System.out.println("Hay nhap so: ");
  Scanner input = new Scanner(System.in);
  long num = input.nextLong();
  System.out.println("Ket qua: ");
  System.out.println(numberFormat(num));
 }
}
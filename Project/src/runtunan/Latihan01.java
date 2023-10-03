package runtunan;

import java.util.Scanner;

public class Latihan01 {
	  public static void main(String args[]){
	            
	    Scanner input = new Scanner(System.in);
	       
	    System.out.println("##  Konversi Suhu  ##");
	    System.out.println("==================================");
	    System.out.println();
	     
	    double celc, fahr, kelv, ream;
	     
	    System.out.print("Input Suhu Celsius: ");
	    celc = input.nextDouble();
	     
	    fahr = (9.0/5.0 * celc) + 32;
	    kelv = celc + 273.15;
	    ream = celc * (4.0/5.0) ;
	     
	    System.out.println(celc+" derajat Celcius = "+fahr+" derajat Fahrenheit");
	    System.out.println(celc+" derajat Celcius = "+kelv+" derajat Kelvin");
	    System.out.println(celc+" derajat Celcius = "+ream+" derajat Reamur");
	     
	  }
}

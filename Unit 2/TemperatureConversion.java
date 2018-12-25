/**
 *This is a program that converts various temperatures
 *Hady Salama
 *9/12/17
 */
 import java.util.Scanner;
 public class TemperatureConversion
 {
 	public static void main(String[]args)
 	{
 		Scanner reader = new Scanner(System.in);
 		double fahrenheit;
 	    double celsius;
 	    
 	    System.out.print("Enter the degrees in Fahrenheit: ");
 	    fahrenheit = reader.nextDouble();
 	    
 	    celsius = (fahrenheit-32.0)*5.0/9.0;
 	    
 	    System.out.println("The equivalent degrees in Celsius is: " + celsius + " degrees");
 	    
 	    System.out.print("Enter the degrees in Celsius: ");
 	    celsius = reader.nextDouble();
 	    
 	    fahrenheit = celsius*(9.0/5.0)+32;
 	    double kelvin = celsius + 273;
 	    System.out.println("The equivalent degrees in Fahrenheit is: " + fahrenheit + " degrees and the temparature in Kelvin is: " + kelvin + " degrees.");
 	     
 	}
 	
 }
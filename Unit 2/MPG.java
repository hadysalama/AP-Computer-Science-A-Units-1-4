/*
 *This is a program that calculates the miles per gallon for a trip based on the odometer.
 *Rachel Milenius and Hady Salama
 *9/15/17
 */
 
 import java.util.Scanner;
 public class MPG
 {
 	public static void main(String[]args)
 	{
 		Scanner reader = new Scanner(System.in);
 		System.out.println("Please enter the gallons used during the trip: ");
 	    double gallons = reader.nextDouble();
 		System.out.println("Please enter the starting odometer of the trip: ");
 		double startingOdometer = reader.nextDouble();
 		System.out.println("Please enter the ending odometer of the trip: ");
 		double endingOdemeter = reader.nextDouble();
 		double dist = endingOdemeter - startingOdometer;
 		double milesPerGallon = dist/gallons;
 		System.out.println("Your mileage is: " + milesPerGallon + " miles per gallon");
 	}
 }
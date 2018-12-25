/*
 *This is a program that calculates the miles per gallon for a trip based on the odometer.
 *Rachel Milenius and Hady Salama
 *9/15/17
 */
 
  import java.util.Scanner;
 public class ChangeCounter
 {
 	public static void main(String[]args)
 	{
 		Scanner reader = new Scanner(System.in);
 	 	System.out.println("Please enter the number of quarters you have.");
 	 	int quarters = reader.nextInt();
 	 	System.out.println("Please enter the number of dimes you have.");
 	 	int dimes = reader.nextInt();
 	 	System.out.println("Please enter the number of nickels you have.");
 	 	int nickels = reader.nextInt(); 
 	 	System.out.println("Please enter the number of pennies you have.");
 	 	int pennies = reader.nextInt();
 	    double sum = (quarters * .25) + (dimes * .1) + (nickels * .05) + (pennies * .01);
 	    double total = Math.round(sum*100.0)/100.0;
 	    System.out.println("You have: $" + total);
 	    
 	}
 }
 	 	
 	 	
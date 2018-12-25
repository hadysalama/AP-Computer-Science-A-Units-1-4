/**
 *This is a program that calculates a numerical average based on 3 user inputs.
 *Hady Salama and Rachel Milenius
 *9/12/17
 */
 
 import java.util.Scanner;
 public class CalculateAverage
 {
 	public static void main(String[]args)
 	{
 		System.out.println("Please enter 3 numbers on the next 3 lines:");
 		Scanner reader = new Scanner(System.in);
 		double num1 = reader.nextDouble();
 		double num2 = reader.nextDouble();
 		double num3 = reader.nextDouble();
 		double avg = (num1 + num2 + num3)/3;
 		System.out.println("Your numerical average is: " + avg);	
 	}
 }
 		
 		
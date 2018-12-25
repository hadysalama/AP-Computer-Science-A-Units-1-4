/*Pollution Index
 *Hady Salama
 *10/25/2017
 *This is program that calculates pollution conditions
 */
 import java.util.Scanner;
 public class L4PollutionIndex
 {
 	public static void main(String args[])
 	{	
 		final double POLLUTION_CUTOFF = 3.5;
 		System.out.println("Please input the Pollution Index:");
 		Scanner reader = new Scanner(System.in);
 		Double PI = reader.nextDouble();
 		if (PI < POLLUTION_CUTOFF) 
 			{
 				System.out.println("Today's conditions are safe"); //true
 			}
 		else
 			{
 				System.out.println("Today's conditions are hazardous."); //false
 			}
 	}
 }
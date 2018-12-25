/*Order Checker
 *Hady Salama
 *10/30/2017
 */
 
 import java.util.Scanner;
 public class orderChecker
 {
 	public static void main(String args[])
 	{
 		final double boltPrice = .05;
 		final double nutPrice = .03;
 		final double washerPrice = .01;
 		
 		System.out.println("Please enter the amounts of bolts, nuts, and washers you have, respectively below: ");
 		
 		Scanner reader = new Scanner(System.in);
 		int bolts = reader.nextInt();
 		int nuts = reader.nextInt();
 		int washers = reader.nextInt();
 		
 		if ((nuts >= bolts) && (washers >= (bolts * 2)))
 		{
 			System.out.println("Check the order: Order is OK.");
 				
 		}
 		else if (nuts < bolts )
 		{
 			System.out.println("Too few nuts");
 		}
 		else if (washers <= (bolts * 2))
 		{
 			System.out.println("Too few washers");
 		}
 			
 		System.out.println("Your total cost is: " + ((bolts * 5) + (nuts *3) + washers) + " cents."); 
 	}
 }
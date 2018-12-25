/*Average Cost
 *Hady Salama
 *10/25/2017
 */
 import java.util.Scanner;
 public class L4AverageCost
 {
 	public static void main(String args[])
 	{	
 		double averageCost;
 		Scanner reader = new Scanner(System.in);
 		System.out.println("Please input the Number of Items:");
 		Double numItems = reader.nextDouble();
 		System.out.println("Please input the Total Cost");
 		Double totalCost = reader.nextDouble();
 		if (numItems >= 0) 
 			{
 				averageCost = totalCost/numItems;
 				System.out.println("Your average cost is: " + averageCost); //true
 			}
 		else
 			{
 				System.out.println("No items were purchased."); //false
 			}
 	}
 }
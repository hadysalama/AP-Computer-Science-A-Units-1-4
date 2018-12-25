/*Average Cost IO
 *Hady Salama
 *10/26/2017
 */
 
 import java.io.*;
 import javax.swing.*;
 public class L4AverageCostGUI
 {
 	public static void main(String args[])
 	{	
 		double averageCost;
 		
 		String totalCost = JOptionPane.showInputDialog("What was the total cost of your purchase? ");
 		String numItems = JOptionPane.showInputDialog("How many items did you purchase? ");
 		double totalCost2 = Double.parseDouble(totalCost);
 		double numItems2 = Double.parseDouble(totalCost);
 		
 		if (numItems2 > 0) 
 			{
 				averageCost = (totalCost2 / numItems2);
 				JOptionPane.showMessageDialog(null, "Your average cost is: " + averageCost); //true
 			}
 		else
 			{
 				JOptionPane.showMessageDialog(null, "No items were purchased."); //false
 			}
 	}
 }
/*2017 Single Tax Bracket
 *Hady Salama
 *10/26/2017
 */
 
 import java.io.*;
 import javax.swing.*;
 public class L4TaxBracket
 {	
 	public static void main(String args[])
 	{
 		String salary = JOptionPane.showInputDialog("What is your yearly income? ");
 		double myEarnings = Double.parseDouble(salary);	
 		if (myEarnings <= 9325)
 		{
 			JOptionPane.showMessageDialog(null,"You are in the 10% tax bracket.");
 		}
 		else if (myEarnings >= 9325 && myEarnings <= 37650)
 		{
 			JOptionPane.showMessageDialog(null,"You are in the 15% tax bracket.");	
 		}
 		else if (myEarnings >= 37951 && myEarnings <= 91900)
 		{
 			JOptionPane.showMessageDialog(null,"You are in the 25% tax bracket.");	
 		}
 		else if (myEarnings >= 91901 && myEarnings <= 191650)
 		{
 			JOptionPane.showMessageDialog(null,"You are in the 28% tax bracket.");	
 		}
 		else if (myEarnings >= 191651 && myEarnings <= 416700)
 		{
 			JOptionPane.showMessageDialog(null,"You are in the 33% tax bracket.");	
 		}
 		else if (myEarnings >= 416701 && myEarnings <= 418400)
 		{
 			JOptionPane.showMessageDialog(null,"You are in the 35% tax bracket.");	
 		}
 		else 
 			JOptionPane.showMessageDialog(null,"You are in the 39.6% tax bracket.");
 	}	
 }
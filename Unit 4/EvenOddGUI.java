/*Even or Odd with GUI
 *Hady Salama
 *10/26/2017
 */
 
 import java.io.*;
 import javax.swing.*;
 public class EvenOddGUI
 {
 	public static void main(String args[])
 	{
 		String num1 = JOptionPane.showInputDialog("Please input an integer. ");
 		int num2 = Integer.parseInt(num1);
 		if (num2 % 2 == 0) 
 		{
 			JOptionPane.showMessageDialog(null, "Your number is even. ");
 		}
 		else 
 		{
 			JOptionPane.showMessageDialog(null, "Your number is odd. ");
 		} 
 		
 	}
 	
 }
 		
 
 /*Conditional Graphics Lab 
 *Hady Salama and Megan Fox
 *11/1/17
 */
import java.awt.*;
import java.applet.*;
import java.io.*;
import javax.swing.*;

public class ConditionalGraphicsGUI extends Applet
{

	public void paint(Graphics g)
	{
		//roof
		String strChoice1 = JOptionPane.showInputDialog("Choose your roof shape from list below:\n 1. Triangular Roof\n 2. Rectangular Roof");
 		public int choice1 = Integer.parseInt(strChoice1);
 		DrawRoof roof1 = new Polygon;
 		roof1.addPoint();
 		roof1.addPoint();
 		g.drawPolygon(roof1);
 		public void roof1() {
 			
 			}
 		
 	 	//body
 		String strChoice2 = JOptionPane.showInputDialog("Choose your body shape from list below:\n 1. Triangular Body\n 2. Square Body\n");
 		public int choice2 = Integer.parseInt(strChoice2);
 		
 		//windows
 		String strChoice3 = JOptionPane.showInputDialog("Choose your window shapes from list below:\n 1. Square Windows\n 2. Triangular Windows\n 3. Circular Windows\n");
		public int choice3 = Integer.parseInt(strChoice3);
 			
	}
}
 
 public class DrawRoof
 {
 	int roofChoice;
 	
 	public Roof(choice1) {
 		roofChoice = choice1;
 	}

	public int setRoof(roofChoice){

 	 	if (roofChoice == 1)
 		{
 		    	g.drawLine(225,275,725,275);
 				g.drawLine(225,275,475,150);
 				g.drawLine(475,150,725,275);
 			
 			
 		}
 		else if (roofChoice == 2)
 		{
 			public void roof2() {
 				g.drawRect(225,200,500,75);
 			}
 		
 		}
 		else 
 		{
 			JOptionPane.showMessageDialog(null, "You did not enter a correct choice number. Please terminate the program and start over.");
 		}
 	  }
 	  roof = g.drawLine();
 	}
 }
 	class DrawBody 
 	{
 		public void paint(Graphics g)
 		{
 			if (choice2 == 1)
 			{
 				g.drawLine(300,625,650,625);
 				g.drawLine(300,625,475,275);
 				g.drawLine(475,275,650,625);
 			}
 			else if (choice2 == 2)
 			{
 				g.drawRect(300,275,350,350);
 			}
 			else 
 			{
 				JOptionPane.showMessageDialog(null,"You did not enter a correct choice number. Please terminate the program and start over.");
 			}
 		}
 	}
 
 	class DrawWindows
 	{
 		public void paint(Graphics g)
 		{
 		if (choice3 == 1)
 		{
 			g.drawRect(450,375,50,50);
 				g.drawRect(400,475,50,50);
 				g.drawRect(500,475,50,50);
 			}
 			else if (choice3 == 2)
 			{
 				g.drawLine(450,425,500,425);
 				g.drawLine(450,425,475,375);
 				g.drawLine(475,375,500,425);
 			
 				g.drawLine(400,525,450,525);
 				g.drawLine(400,525,425,475);
 				g.drawLine(425,475,450,525);
 			
 				g.drawLine(500,525,550,525);
 				g.drawLine(500,525,525,475);
 				g.drawLine(525,475,550,525);
 			}
 			else if (choice3 == 3)
 			{
 				g.drawOval(450,375,50,50);
 				g.drawOval(400,475,50,50);
 				g.drawOval(500,475,50,50);
 			}
 			else 
 			{
 				JOptionPane.showMessageDialog(null,"You did not enter a correct choice number. Please terminate the program and start over.");
 			}
 		}
 	}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 	//		String[] buttons = {" 1. Addition"," 2. Subtraction "," 3. Multiplication ", " 4.Division "};
 	//		JOptionPane.showOptionDialog(buttons, "Make your arithmetic selection from the choices below: ");	
/*Conditional Graphics Lab 
 *Hady Salama and Megan Fox
 *11/1/17
 */
import java.awt.*;
import java.applet.*;
import java.util.Scanner;

public class ConditionalGraphics extends Applet
{

	public void paint(Graphics g)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("Choose your roof shape from list below:\n");
			System.out.println(" 1. Triangular Roof");
 			System.out.println(" 2. Rectangular Roof");
 		int choice1 = reader.nextInt();
 		if (choice1 == 1)
 		{
 			g.drawLine(225,275,725,275);
 			g.drawLine(225,275,475,150);
 			g.drawLine(475,150,725,275);
 		}
 		else if (choice1 == 2)
 		{
 			g.drawRect(225,200,500,75);
 		}
 		else 
 		{
 			System.out.println("You did not enter a correct choice number. Please terminate the program and start over.");
 		}
 		System.out.println("Choose your body shape from list below:\n");
			System.out.println(" 1. Triangular Body");
 			System.out.println(" 2. Square Body");
 		int choice2 = reader.nextInt();
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
 			System.out.println("You did not enter a correct choice number. Please terminate the program and start over.");
 		}
 		System.out.println("Choose your window shapes from list below:\n");
			System.out.println(" 1. Square Windows");
 			System.out.println(" 2. Triangular Windows");
 			System.out.println(" 3. Circular Windows");
 		int choice3 = reader.nextInt();
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
 			System.out.println("You did not enter a correct choice number. Please terminate the program and start over.");
 		}
 		
 		
	}
}
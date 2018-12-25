/*
 *Basic Lines Project
 *Hady Salama
 *9/22/17
 *Graphics I made.
 */
 
 import java.awt.*;
 import java.applet.*;
 
 public class graphicsProgram extends Applet 
 {
 	public void paint(Graphics g)
 	{
 		setBackground(Color.YELLOW);
 		g.setColor(Color.RED);
 		g.drawArc(200,300,700 ,200,0,-180);
 		g.setColor(Color.WHITE);
 		g.fillOval(305,105,50,50);
 		g.setColor(Color.BLACK);
 		g.fillOval(325,125,10,10);
 		g.setColor(Color.WHITE);
 		g.fillOval(705,105,50,50);
 		g.setColor(Color.BLACK);
 		g.fillOval(725,125,10,10);
 	
 	}
 }
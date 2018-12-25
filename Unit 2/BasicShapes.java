/*
 *Basic Shapes Project
 *Hady Salama
 *9/19/17
 */
 
 import java.awt.*;
 import java.applet.*;
 
 public class BasicShapes extends Applet 
 {
 	public void paint(Graphics g)
 	{
 	   g.drawRect(50,50,100,100);  //square
 	   g.fillRect(250,50,100,100); //filled square
 	   g.drawOval(400,50,100,100); //circle
 	   g.fillOval(600,50,100,100); //filled circle
 	   g.drawRect(50,200,300,150);
 	   g.fillRect(400,200,300,150);
 	   g.drawOval(50,400,300,150);
 	   g.fillOval(400,400,300,150); 
 	}
    
}
/*GraphicsLab01st
 *Hady Salama 
 *10/16/17
 *Cube Inside the Sphere.
 */
import java.awt.*;
import java.applet.*;


public class CubeSphere extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
		g.drawLine(275,190,475,190); //1
		g.drawLine(275,190,275,390); //2
		g.drawLine(275,390,475,390); //3
		g.drawLine(475,390,475,190); //4
		g.drawLine(200,115,400,115); //1
		g.drawLine(200,115,200,315); //2 
		g.drawLine(200,315,400,315); //3
		g.drawLine(400,315,400,115); //4
		g.drawLine(275,190,200,115);
		g.drawLine(275,390,200,315);
		g.drawLine(475,390,400,315);
		g.drawLine(475,190,400,115);
		
		
		
		
		
			
		// DRAW SPHERE
       	g.drawOval(250, 175, 175, 175);
		g.drawOval(250, 250, 175, 25);
		g.drawOval(250, 225, 175, 75);
		g.drawOval(250,200,175,125);
		g.drawOval(325,175, 25, 175);
		g.drawOval(300,175,75,175);
		g.drawOval(275,175,125,175);
	
		
	}
}
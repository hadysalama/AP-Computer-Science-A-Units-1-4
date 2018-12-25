/*GraphicsLab01st
 *Hady Salama 
 *10/16/17
 *This is the student, starting version of Graphics Lab 01.
 */
import java.awt.*;
import java.applet.*;


public class GraphicsLab01st extends Applet
{

	public void paint(Graphics g)
	{
		// DRAW CUBE
			g.drawRect(188,150,150,150);
			g.drawRect(100,50,150,150);
			g.drawLine(188,150,100,50);
			g.drawLine(338,150,250,50);
			g.drawLine(188,300,100,200);
			g.drawLine(338,300,250,200);
			
		// DRAW SPHERE
       		g.drawOval(375,50,200,200);
       		g.drawOval(375,75,200,150);
       		g.drawOval(375,100,200,100);
       		g.drawOval(400,50,150,200);
       		g.drawOval(425,50,100,200);
       		g.drawOval(450,50,50,200);
       		
		// DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
			g.drawOval(800, 50, 200, 200);
	     	g.drawLine(995,125,833,225);
	    	g.drawLine(833, 225, 835, 75);
	    	g.drawLine(835, 75, 995, 125);
	    	g.drawOval(834, 92, 95, 95);

		// DRAW APCS
			g.fillRect(100,500,75,125);
			g.setColor(Color.WHITE);
			g.fillRect(125,525,25,25);
			g.fillRect(125,575,25,50);
			g.setColor(Color.BLACK);
			g.fillRect(200,500,75,125);
			g.setColor(Color.WHITE);
			g.fillRect(225,525,25,25);
			g.fillRect(225,575,50,50);
			g.setColor(Color.BLACK);
			g.fillRect(300,500,75,125);
			g.setColor(Color.WHITE);
			g.fillRect(325,525,50,75);
			g.setColor(Color.BLACK);
			g.fillRect(400,500,75,125);
			g.setColor(Color.WHITE);
			g.fillRect(425,525,50,25);
			g.fillRect(400,575,50,25);

		// DRAW PACMEN FLOWER
			g.setColor(Color.BLACK);
			g.fillArc(540,375,75,75,45,270);
			g.fillArc(490,325,75,75,135,270);
			g.fillArc(490,425,75,75,315,270);
			g.fillArc(440,375,75,75,215,270);
	

	}

}

//http://users.wpi.edu/~bcourteau/Applets/awtgraphics.java



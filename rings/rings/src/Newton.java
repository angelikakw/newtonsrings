import java.applet.Applet;
import java.awt.Graphics;
  
public class Newton extends Applet 
{
	double wavelength = 0.7;
	double radiusOfCurvature = 2000;
	int n = 1;
			
	public void paint(Graphics graphics) 
	{	
		for(int k = 1; k < 25; k++ )
		{
	
			if(k == 1)
			{
				int radiusOfRing = (int) Math.sqrt( ( (k - 0.5) * radiusOfCurvature * wavelength ) / n ); 
				graphics.fillOval(100-radiusOfRing/2, 100-radiusOfRing/2, radiusOfRing, radiusOfRing);
			}
			else
			{
				int radiusOfRing = (int) Math.sqrt( ( (k - 0.5) * radiusOfCurvature * wavelength ) / n ); 
				graphics.drawOval(100-radiusOfRing/2, 100-radiusOfRing/2, radiusOfRing, radiusOfRing);
			}

		}
		graphics.drawString("Prazki Newtona dla fali o dlugosci " + wavelength + " um, soczewki o promieniu krzywizny " + radiusOfCurvature + " um oraz n = " + n, 10, 10);
	}
}
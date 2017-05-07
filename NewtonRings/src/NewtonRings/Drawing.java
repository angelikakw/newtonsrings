package NewtonRings;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Drawing extends JPanel{

	double[] possibleNs = {1.0, 1.000293, 1.333, 1.36, 1.47};
	private int choosenN = 0;
	double wavelength = 0.38;
	double radiusOfCurvature = 2000;
	int numberOfCirles = 10;
	
	void setChoosenN(int n) {
		choosenN = n;
	}
	
	public void paint(Graphics graphics) 
	{
		double n = possibleNs[choosenN];
		super.paint(graphics);
		for(int k = 1; k <= numberOfCirles; k++ )
		{
			if(k == 1) {
				int radiusOfRing = (int) Math.sqrt( ( (k - 0.5) * radiusOfCurvature * wavelength ) / n); 
				graphics.fillOval(300-radiusOfRing/2, 300-radiusOfRing/2, radiusOfRing, radiusOfRing);
			} else {
				int radiusOfRing = (int) Math.sqrt( ( (k - 0.5) * radiusOfCurvature * wavelength ) / n ); 
				graphics.drawOval(300-radiusOfRing/2, 300-radiusOfRing/2, radiusOfRing, radiusOfRing);
			}
		}
		graphics.drawString("Prazki Newtona dla fali o dlugosci " + wavelength + " um, soczewki o promieniu krzywizny " + radiusOfCurvature + " um oraz n = " + n, 10, 10);
	}
}

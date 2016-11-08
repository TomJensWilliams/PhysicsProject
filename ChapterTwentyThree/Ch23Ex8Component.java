package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex8Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double sigma, x, R;
	public Ch23Ex8Component(double sigmaInput, double xInput, double RInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		sigma = sigmaInput;
		x = xInput;
		R = RInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.drawLine(200, 300, 300, 300, Color.BLACK, g2);
		drawer.drawAndFillCircle(250, 250, 100, Color.BLACK, orange, g2);
		drawer.drawAndFillCircle(262, 262, 75, Color.BLACK, Color.RED, g2);
		drawer.drawAndFillCircle(275, 275, 50, Color.BLACK, orange, g2);
		drawer.drawAndFillCircle(395, 295, 10, Color.BLACK, Color.BLACK, g2);
		drawer.drawArrowAngle(300, 300, 25, 225, 10, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(300, 300, 50, 315, 10, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(295, 305, 15, 135, 10, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(262, 338, 15, (180 + 135), 10, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(350, 250, 50, 110, 10, 20, Color.BLACK, g2);
		drawer.drawLine(300, 300, 400, 300, Color.BLACK, g2);
		g2.setColor(Color.BLACK);
		g2.drawString("r", 285, 300);
		g2.drawString("R", 300, 290);
		g2.drawString("dq", 350, 250);
		g2.drawString("dr", 270, 325);
		g2.drawString("x", 375, 310);
		g2.drawString("P", 395, 295);
		String paragraphSingleString = "A disk of radius R has a uniform surface charge density sigma.\n"
				+ "Calculate the electric field at a point P that lies along the central\n" 
				+ "perpendicular axis of the disk and a distance x from the center of the disk.\n"
				+ "sigma = " + sigma + "C/m^2\nx = " + x + "m\nR = " + R + "m\n";
		LinkedList<String> paragraph = tools.splitNewLines(paragraphSingleString);
		drawer.printParagraph(paragraph, 50, 50, Color.BLACK, g2);
	}
}
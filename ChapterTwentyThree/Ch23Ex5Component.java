package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex5Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double qOne, qTwo, a, b, y, phi, theta;
	public Ch23Ex5Component(double qOneInput, double qTwoInput, double aInput, double bInput, double yInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		qOne = qOneInput;
		qTwo = qTwoInput;
		a = aInput;
		b = bInput;
		y = yInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.drawArrowAngle(250, 50, 400, 90, 200, 90, Color.BLACK, g2);
		drawer.drawLinePoints(250, 150, 175, 450, Color.BLACK, g2);
		drawer.drawLinePoints(250, 150, 375, 450, Color.BLACK, g2);
		drawer.drawArrowAngle(250, 150, 50, 0, 20, 180, Color.BLACK, g2);
		drawer.drawArrowAngle(250, 150, 50, 67, 20, 20, Color.RED, g2);
		drawer.drawArrowAngle(250, 150, 50, 290, 20, 20, Color.RED, g2);
		drawer.drawArrowAngle(250, 150, 50, 320, 20, 20, Color.RED, g2);
		drawer.classicDrawAndFillCircle(150, 425, 50, Color.BLACK, orange, g2);
		drawer.classicDrawAndFillCircle(350, 425, 50, Color.BLACK, Color.CYAN, g2);
		drawer.classicDrawAndFillCircle(244, 144, 12, Color.BLACK, Color.BLACK, g2);
		String paragraphSingleString = "Charges q1 and q2 are located on the x-axis,\nat distances a and b, respectively, from the orgin as shown here.\n"
				+ "Find the components of the net electric field at the point P, which is on the y-axis.\n"
				+ "Evaluate the electric field at point P in the special case the |q1| = |q2| and a = b.\n"
				+ "Find the electric field due to the electric dipole when point P is a distance y >> a from the orgin.\n" 
				+ "q1 = " + qOne + "C\nq2 = " + qTwo + "C\na = " + a + "m\nb = " + b + "m\ny = " + y + "m\n";
		LinkedList<String> paragraph = tools.splitNewLines(paragraphSingleString);
		drawer.printParagraph(paragraph, 375, 100, Color.BLACK, g2);
		g2.drawString("q1                                             q2", 172, 453);
		g2.drawString("a               b", 220, 448);
		g2.drawString("P", 238, 148);
		g2.drawString("y", 240, 325);
	}
}

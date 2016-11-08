package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex3Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double qOne, qTwo, d;
	public Ch23Ex3Component(double qOneInput, double qTwoInput, double dInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		qOne = qOneInput;
		qTwo = qTwoInput;
		d = dInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.classicDrawAndFillRectangle(75, 75, 200, 100, Color.BLACK, null, g2);
		drawer.drawIShape(175, 75, 175, 125, 200, Color.BLACK, g2);
		drawer.drawArrowAngle(175, 75, 50, 180, 20, 40, Color.BLUE, g2);
		drawer.drawArrowAngle(175, 75, 50, 0, 20, 40, Color.BLUE, g2);
		drawer.classicDrawAndFillCircle(50, 50, 50, Color.BLACK, orange, g2);
		drawer.classicDrawAndFillCircle(150, 50, 50, Color.BLACK, Color.CYAN, g2);
		drawer.classicDrawAndFillCircle(250, 50, 50, Color.BLACK, orange, g2);
		g2.setColor(Color.BLACK);
		String paragraph = "Three point charges lie along the x-axis as shown here.\nThe net force acting on q3 is zero, what is the x-coordinate of q3."
				+ "\nq1 = " + qOne +"C\nq2 = " + qTwo +"C\n" + "d = " + d + "m\n";
		LinkedList<String> outputParagraph = tools.splitNewLines(paragraph);
		drawer.printParagraph(outputParagraph, 325, 75, Color.BLACK, g2);
		g2.drawString("q1", 250, 50);
		g2.drawString("q2", 50, 50);
		g2.drawString("q3", 150, 50);
		g2.drawString("x",  125, 125);
		g2.drawString("d - x",  225, 125);
		g2.drawString("d",  175, 175);
	}
}

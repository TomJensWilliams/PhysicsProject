package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex2Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double qOne, qTwo, qThree, a;
	public Ch23Ex2Component(double qOneInput, double qTwoInput, double qThreeInput, double aInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		qOne = qOneInput;
		qTwo = qTwoInput;
		qThree = qThreeInput;
		a = aInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.classicDrawAndFillTriangle(75, 75, 75, 175, 175, 75, Color.BLACK, null, g2);
		drawer.drawArrowAngle(175, 75, 53, 315, 15, 45, Color.BLUE, g2);
		drawer.drawArrowAngle(175, 75, 53, 180, 15, 45, Color.BLUE, g2);
		drawer.classicDrawAndFillCircle(50, 150, 50, Color.BLACK, orange, g2);
		drawer.classicDrawAndFillCircle(50, 50, 50, Color.BLACK, Color.CYAN, g2);
		drawer.classicDrawAndFillCircle(150, 50, 50, Color.BLACK, orange, g2);
		g2.drawString("q1", 30, 175);
		g2.drawString("q2", 30, 75);
		g2.drawString("q3", 175, 115);
		g2.drawString("a", 60, 125);
		String paragraph = "Consider the three points located at the corners of the right triangle shown here.\nq1 = " + qOne +"C\n"
				+ "q2 = " + qTwo +"C\nq3 = " + qThree +"C\na = " + a + "m\nWhat is the resultant force exerted on q3?(i-hat input first, then j-hat input)\n";
		LinkedList<String> outputParagraph = tools.splitNewLines(paragraph);
		drawer.printParagraph(outputParagraph, 250, 50, Color.BLACK, g2);
	}
}

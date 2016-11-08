package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex4Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double L, theta, mass;
	public Ch23Ex4Component(double LInput, double thetaInput, double massInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		L = LInput;
		theta = thetaInput;
		mass = massInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.drawArrowAngle(200, 225, 200, 309, 0, 0, Color.BLACK, g2);
		drawer.drawArrowAngle(400, 225, 200, 231, 0, 0, Color.BLACK, g2);
		drawer.drawArrowAngle(200, 225, 50, 309, 20, 20, Color.BLUE, g2);
		drawer.drawArrowAngle(400, 225, 50, 231, 20, 20, Color.BLUE, g2);
		drawer.drawArrowAngle(300, 75, 200, 90, 0, 0, Color.BLACK, g2);
		drawer.classicDrawAndFillRectangle(50, 50, 500, 50, Color.BLACK, Color.GRAY, g2);
		drawer.drawLinePoints(200, 225, 300, 225, Color.BLACK, g2);
		for(int i = 0; i < 4; i++){
			drawer.drawArrowAngle(200, 225, 50, i * 90, 20, 20, Color.BLUE, g2);
			drawer.drawArrowAngle(400, 225, 50, i * 90, 20, 20, Color.BLUE, g2);
		}
		drawer.classicDrawAndFillCircle(175, 200, 50, Color.BLACK, orange, g2);
		drawer.classicDrawAndFillCircle(375, 200, 50, Color.BLACK, orange, g2);
		g2.setColor(Color.BLACK);
		g2.drawString("  theta       theta", 245, 175);
		g2.drawString("L                              L", 235, 160);
		g2.drawString("q                                                q", 197, 227);
		g2.drawString("   a", 250, 225);
		String paragraph = "Two identical small charged spheres, each having a mass " + mass + "kg,\nhang in equalibrium as shown here. "
				+ "The length of each string is " + L + "m,\nand the angle theta is " + theta + " degrees.\n"
				+ "Find the magnitude of the charge on each sphere.\n";
		LinkedList<String> outputParagraph = tools.splitNewLines(paragraph);
		drawer.printParagraph(outputParagraph, 500, 200, Color.BLACK, g2);
	}
}
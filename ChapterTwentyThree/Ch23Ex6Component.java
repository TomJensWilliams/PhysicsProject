package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex6Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double Q, l, a;
	public Ch23Ex6Component(double QInput, double lInput, double aInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		Q = QInput;
		l = lInput;
		a = aInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.drawArrowAngle(650, 250, 500, 180, 20, 20, orange, g2);
		drawer.drawArrowAngle(650, 250, 400, 180, 150, 90, Color.BLACK, g2);
		drawer.classicDrawAndFillCircle(244, 244, 12, Color.BLACK, Color.BLACK, g2);
		drawer.classicDrawAndFillRectangle(300, 225, 400, 50, Color.BLACK, orange, g2);
		drawer.classicDrawAndFillRectangle(400, 225, 50, 50, Color.BLACK, Color.GRAY, g2);
		drawer.drawLinePoints(400, 225, 400, 175, Color.BLACK, g2);
		drawer.drawLinePoints(450, 225, 450, 175, Color.BLACK, g2);
		drawer.drawLinePoints(300, 275, 300, 325, Color.BLACK, g2);
		drawer.drawLinePoints(700, 275, 700, 325, Color.BLACK, g2);
		drawer.drawArrowAngle(500, 200, 50, 180, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(320, 200, 70, 180, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(330, 200, 70, 0, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(275, 300, 25, 180, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(275, 300, 25, 0, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(505, 300, 195, 0, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(495, 300, 195, 180, 20, 20, Color.BLACK, g2);
		g2.setColor(Color.BLACK);
		g2.drawString("E", 150, 245);
		g2.drawString("P", 230, 280);
		g2.drawString("a", 270, 300);
		g2.drawString("x", 323, 204);
		g2.drawString("dx", 418, 205);
		g2.drawString("l", 498, 305);
		String paragraphSingleString = "A rod of length l has a uniform positive charge per unit length lambda and a total charge Q.\n"
				+ "Calculate the electric field at point P that is located along the long axis of the rod and\na distance a from one end.\n"
				+ "Q = " + Q + "C\nl = " + l + "m\na = " + a + "m\n";
		LinkedList<String> paragraph = tools.splitNewLines(paragraphSingleString);
		drawer.printParagraph(paragraph, 300, 350, Color.BLACK, g2);
	}
}
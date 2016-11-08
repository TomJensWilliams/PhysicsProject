package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex7Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double Q, a, x;
	public Ch23Ex7Component(double QInput, double aInput, double xInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		Q = QInput;
		a = aInput;
		x = xInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color backGround = new Color(238, 238, 238);
		Color orange = new Color(250, 128, 0);
		drawer.drawLinePoints(200, 300, 300, 300, Color.BLACK, g2);
		drawer.classicDrawAndFillCircle(250, 250, 100, Color.BLACK, orange, g2);
		drawer.classicDrawAndFillCircle(255, 255, 90, Color.BLACK, backGround, g2);
		drawer.classicsDrawAndFillSquare(298, 250, 5, Color.BLACK, Color.GRAY, g2);
		drawer.drawLinePoints(255, 300, 500, 300, Color.BLACK, g2);
		drawer.classicDrawAndFillTriangle(300, 300, 300, 255, 400, 300, Color.BLACK, null, g2);
		drawer.classicDrawAndFillTriangle(300, 300, 300, 345, 400, 300, Color.BLACK, null, g2);
		drawer.drawArrowAngle(400, 300, 75, 0, 10, 20, orange, g2);
		drawer.drawArrowAngle(400, 300, 50, 33, 10, 20, orange, g2);
		drawer.drawArrowAngle(400, 300, 50, 326, 10, 20, orange, g2);
		g2.setColor(Color.BLACK);
		g2.drawString("dq", 293, 245);
		g2.drawString("a               r", 290, 280);
		g2.drawString("x       theta       theta", 320, 300);
		g2.drawString(" P", 395, 295);
		drawer.classicDrawAndFillCircle(395, 295, 10, Color.BLACK, Color.BLACK, g2);
		String paragraphSingleString = "A ring of radius a carries a uniformly distributed positive total charge Q.\n"
				+ "Calculate the electric field due to the ring at a point P lying a distance x\n"
				+ "from its center along the central axis perpendicular to the plane of the ring.\n"
				+ "Q = " + Q + "C\na = " + a + "m\nx = " + x + "m\n";
		LinkedList<String> paragraph = tools.splitNewLines(paragraphSingleString);
		drawer.printParagraph(paragraph, 350, 100, Color.BLACK, g2);
	}
}

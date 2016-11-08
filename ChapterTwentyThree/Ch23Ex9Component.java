package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex9Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double q, E, d, m;
	public Ch23Ex9Component(double qInput, double EInput, double dInput, double mInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		q = qInput;
		E = EInput;
		d = dInput;
		m = mInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.drawAndFillRectangle(50, 50, 50, 200, Color.BLACK, orange, g2);
		drawer.drawAndFillRectangle(250, 50, 50, 200, Color.BLACK, Color.CYAN, g2);
		for(int arrowNumber = 1; arrowNumber < 6; arrowNumber++)
			drawer.drawArrowAngle(100, 50 + ((arrowNumber - 1) * 50), 150, 0, 20, 20, orange, g2);
		drawer.drawLine(100, 50, 100, 300, Color.BLACK, g2);
		drawer.drawArrowAngle(180, 275, 70, 0, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(170, 275, 70, 180, 20, 20, Color.BLACK, g2);
		drawer.drawLine(250, 50, 250, 300, Color.BLACK, g2);
		drawer.drawArrowAngle(122, 125, 95, 0, 20, 20, Color.BLACK, g2);
		drawer.drawAndFillCircle(110, 112, 25, Color.BLACK, orange, g2);
		drawer.drawAndFillCircle(215, 112, 25, Color.BLACK, orange, g2);
		g2.setColor(Color.BLACK);
		g2.drawString("E", 175, 45);
		g2.drawString("d", 171, 280);
		g2.drawString("v = 0                   v != 0", 102, 100);
		g2.drawString("    q                         q", 102, 125);
		g2.drawString("(A)                     (B)", 102, 150);
		String paragraphSingleString = "A uniform electric field E is directed along the x-axis between parallel plates of\n"
				+ "charge seperated by a distance d as shown here. A positive point charge q of\n"
				+ "mass m is released from rest at point (A) next to the positive plate and accelerates\n"
				+ "to the point (B) next to the negative plate.\n"
				+ "Find the speed of the particle at (B) by modeling it as a particle under constant acceleration.\n"
				+ "Find the speed of the particle at (B) by modeling it as a nonisolated system.\n"
				+ "q = " + q + "C\nE = " + E + "N/C\nd = " + d + "m\nm = " + m + "kg\n";
		LinkedList<String> paragraph = tools.splitNewLines(paragraphSingleString);
		drawer.printParagraph(paragraph, 350, 50, Color.BLACK, g2);
	}
}
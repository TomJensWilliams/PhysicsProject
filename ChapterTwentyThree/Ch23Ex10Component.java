package mainpackage.ChapterTwentyThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex10Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	double vi, E, l;
	public Ch23Ex10Component(double viInput, double EInput, double lInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		vi = viInput;
		E = EInput;
		l = lInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.drawAndFillRectangle(100, 50, 400, 50, Color.BLACK, orange, g2);
		drawer.drawAndFillRectangle(100, 350, 400, 50, Color.BLACK, Color.CYAN, g2);
		drawer.drawLine(100, 50, 100, 25, Color.BLACK, g2);
		drawer.drawLine(500, 50, 500, 25, Color.BLACK, g2);
		drawer.drawLine(100, 50, 500, 50, Color.BLACK, g2);
		drawer.drawLine(100, 50, 100, 100, Color.BLACK, g2);
		drawer.drawLine(100, 350, 500, 350, Color.BLACK, g2);
		drawer.drawLine(100, 350, 100, 400, Color.BLACK, g2);
		drawer.drawArrowAngle(305, 40, 195, 0, 20, 20, Color.BLACK, g2);
		drawer.drawArrowAngle(295, 40, 195, 180, 20, 20, Color.BLACK, g2);
		for(int arrowNumber = 1; arrowNumber < 10; arrowNumber++)
			drawer.drawArrowAngle(50 * (1 + arrowNumber), 350, 250, 270, 20, 20, orange, g2);
		////
		int[] endOfLastVector = drawer.drawVector(50, 175, 75, 0, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 2, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 3, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 4, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 5, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 6, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 7, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 8, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 9, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 10, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 11, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 12, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 13, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 16, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 19, Color.BLACK, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 21, null, g2);
		endOfLastVector = drawer.drawVector(endOfLastVector[0], endOfLastVector[1], 25, 24, Color.BLACK, g2);
		//
		drawer.drawVector(550, 275, 40, 218, Color.BLACK, g2);
		////
		drawer.drawArrowAngle(50, 175, 50, 0, 20, 20, orange, g2);
		drawer.drawAndFillCircle(25, 150, 50, Color.BLACK, Color.CYAN, g2);
		drawer.drawArrowAngle(550, 275, 50, 30, 20, 20, orange, g2);
		drawer.drawAndFillCircle(525, 250, 50, Color.BLACK, Color.CYAN, g2);
		g2.setColor(Color.BLACK);
		String paragraphSingleString = "An electron enters the region of a uniform electric field as shown,\n"
				+ "with vi = " + vi + "m/s and E = " + E + "N/C.\n"
				+ "The horizontal length of the plates is l = " + l + "m.\n"
				+ "Find the acceleration of the electron while it is in the electric field.\n"
				+ "Assuming the electron enters the field at time t = 0, find the time at which it leaves the field.\n"
				+ "Assuming the vertical position of the electron as it enters the field is yi = 0,\nwhat is its vertical position when it leaves the field?\n";
		LinkedList<String> paragraph = tools.splitNewLines(paragraphSingleString);
		drawer.printParagraph(paragraph, 100, 450, Color.BLACK, g2);
		g2.drawString("l", 299, 45);
		g2.drawString("E", 90, 250);
		g2.drawString("vi", 75, 160);
		g2.drawString("v", 580, 280);
	}
}
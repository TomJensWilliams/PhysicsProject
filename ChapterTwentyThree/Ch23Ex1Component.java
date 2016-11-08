package mainpackage.ChapterTwentyThree;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.LinkedList;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("serial")
public class Ch23Ex1Component extends JComponent {
	Tools tools;
	DrawFunctions drawer;
	boolean firstIsProton, secondIsProton;
	double distance;
	
	public Ch23Ex1Component(double distanceInput, boolean firstIsProtonInput, boolean secondIsProtonInput){
		tools = new Tools();
		drawer = new DrawFunctions();
		firstIsProton = firstIsProtonInput;
		secondIsProton = secondIsProtonInput;
		distance = distanceInput;
	}

	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		Color orange = new Color(250, 128, 0);
		drawer.drawLinePoints(75, 75, 275, 75, Color.BLACK, g2);
		if(firstIsProton){
			drawer.classicDrawAndFillCircle(50, 50, 50, Color.BLACK, orange, g2);
		} else {
			drawer.classicDrawAndFillCircle(50, 50, 50, Color.BLACK, Color.CYAN, g2);
		}
		if(secondIsProton){
			drawer.classicDrawAndFillCircle(250, 50, 50, Color.BLACK, orange, g2);
		} else {
			drawer.classicDrawAndFillCircle(250, 50, 50, Color.BLACK, Color.CYAN, g2);
		}
		g2.drawString("d", 175, 75);
		g2.drawString("q1", 50, 50);
		g2.drawString("q2", 250, 50);
		String paragraphSingleString = "The ";
		if(firstIsProton == secondIsProton){
			paragraphSingleString += "first ";
		}
		if(firstIsProton){
			paragraphSingleString += "proton ";
		} else {
			paragraphSingleString += "electron ";
		}
		paragraphSingleString += "is " + distance + " away from the ";
		if(firstIsProton == secondIsProton){
			paragraphSingleString += "second ";
		}
		if(secondIsProton){
			paragraphSingleString += "proton.\n";
		} else {
			paragraphSingleString += "electron.\n";
		}
		paragraphSingleString += "What is the electric force and the gravitational force between these two particles?\n";
		LinkedList<String> paragraph = tools.splitNewLines(paragraphSingleString);
		drawer.printParagraph(paragraph, 325, 50, Color.BLACK, g2);
	}
}
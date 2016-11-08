package mainpackage;

import java.util.Scanner;

import javax.swing.JFrame;

import mainpackage.ChapterTwentyThree.*;
import mainpackage.ChapterTwentyFour.*;
import mainpackage.ChapterTwentySeven.*;
import mainpackage.ChapterTwentyFive.*;
import mainpackage.ChapterTwentySix.*;

@SuppressWarnings("unused")
public class Main {
	public static void main(String[] args) {
		Ch27Ex3Component jComponent = new Ch27Ex3Component();
		Tools toolKit = new Tools();
		toolKit.printComponent(jComponent, "TEST", 1200, 1200);
	}
}
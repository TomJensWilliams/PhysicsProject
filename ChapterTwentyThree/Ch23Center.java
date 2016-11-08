package mainpackage.ChapterTwentyThree;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;
import static java.lang.Math.toRadians;
import static mainpackage.Tools.G;
import static mainpackage.Tools.g;
import static mainpackage.Tools.ke;
import static mainpackage.Tools.eo;
import static mainpackage.Tools.qp;
import static mainpackage.Tools.mp;
import static mainpackage.Tools.qe;
import static mainpackage.Tools.me;

import java.util.Scanner;

import javax.swing.JTextField;

import mainpackage.DrawFunctions;
import mainpackage.Tools;

@SuppressWarnings("unused")
public class Ch23Center {
	Scanner input;
	Tools toolKit;
	double accuracy;
	public Ch23Center(){
		input = new Scanner(System.in);
		toolKit = new Tools();
		accuracy = 0.95;
	}
	public Ch23Center(double inputAccuracy){
		input = new Scanner(System.in);
		toolKit = new Tools();
		accuracy = inputAccuracy;
	}
	public void ch23ex1(boolean isRandomInput){
		boolean[] isProton = new boolean[2];
		double distance;
		double[] printOutput;
		if(isRandomInput){
			isProton[0] = toolKit.randBool();
			isProton[1] = toolKit.randBool();
			distance = toolKit.randInt(40, 60) * pow(10, -12);
			printOutput = ch23ex1sub(isProton, distance);
		} else {
			isProton[0] = false;
			isProton[1] = true;
			distance = 5.3E-11;
			printOutput = ch23ex1sub(isProton, distance);
		}
		Ch23Ex1Component jComponentInput = new Ch23Ex1Component(distance, isProton[0], isProton[1]);
		toolKit.printComponent(jComponentInput, "Chapter 23 Example 1", 800, 800);
		System.out.println(printOutput[0] + "\n" + printOutput[1]);
		toolKit.keepAskingTillRight("", printOutput[0], accuracy);
		System.out.println("Part One Correct");
		System.out.println(printOutput[0] + "\n" + printOutput[1]);
		toolKit.keepAskingTillRight("", printOutput[1], accuracy);
		System.out.println("Part Two Correct");
		System.out.println(printOutput[0] + "\n" + printOutput[1]);
	}
	public double[] ch23ex1sub(boolean[] booleanArrayInput, double distanceInput){
		double[] output = { ke, G };
		if(booleanArrayInput[0]){
			output[0] *= qp;
			output[1] *= mp;
		} else {
			output[0] *= qe;
			output[1] *= me;
		}
		if(booleanArrayInput[1]){
			output[0] *= qp;
			output[1] *= mp;
		} else {
			output[0] *= qe;
			output[1] *= me;
		}
		output[0] = output[0] / (distanceInput * distanceInput);
		output[1] = output[1] / (distanceInput * distanceInput);
		return output;
	}
	public void ch23ex2(boolean isRandomInput){
		double q1, q2, q3, a;
		double[] printOutput;
		if(isRandomInput){
			q1 = toolKit.randInt(3, 7) * pow(10, -6);
			q2 = toolKit.randInt(-4, -1) * pow(10, -6);
			q3 = toolKit.randInt(3, 7) * pow(10, -6);
			a = toolKit.randInt(5, 30) * pow(10, -2);
			printOutput = ch23ex2sub(q1, q2, q3, a);
		} else {
			q1 = 5E-6;
			q2 = -2E-6;
			q3 = 5E-6;
			a = 0.1;
			printOutput = ch23ex2sub(q1, q2, q3, a);
		}
		Ch23Ex2Component jComponentInput = new Ch23Ex2Component(q1, q2, q3, a);
		toolKit.printComponent(jComponentInput, "Chapter 23 Example 2", 800, 800);
		System.out.println(printOutput[0] + "\n" + printOutput[1]);
		toolKit.keepAskingTillRight("", printOutput[0], accuracy);
		System.out.println("Part One Correct");
		toolKit.keepAskingTillRight("", printOutput[1], accuracy);
		System.out.println("Part Two Correct");
		System.out.println(printOutput[0] + "\n" + printOutput[1]);
	}
	public double[] ch23ex2sub(double q1Input, double q2Input, double q3Input, double aInput){
		double[] output = new double[2];
		double F13 = (ke * q1Input * q3Input) / (2 * aInput * aInput),
				F23 = (ke * q2Input * q3Input) / (aInput * aInput);
		output[0] = (F13 * cos(toRadians(45))) + (F23 * cos(toRadians(0)));
		output[1] = (F13 * sin(toRadians(45))) + (F23 * sin(toRadians(0)));
		return output;
	}
	public void ch23ex3(boolean isRandomInput){
		double q1, q2, d, x;
		if(isRandomInput){
			q1 = toolKit.randInt(10, 20) * pow(10, -6);
			q2 = toolKit.randInt(2, 8) * pow(10, -6);
			d = toolKit.randInt(1, 4);
			x = ch23ex3sub(q1, q2, d);
		} else {
			q1 = 15E-6;
			q2 = 6E-6;
			d = 2;
			x = ch23ex3sub(q1, q2, d);
		}
		Ch23Ex3Component jComponentInput = new Ch23Ex3Component(q1, q2, d);
		toolKit.printComponent(jComponentInput, "Chapter 23 Example 3", 800, 800);
		System.out.println(x);
	}
	public double ch23ex3sub(double q1Input, double q2Input, double dInput){
		double a = q1Input - q2Input,
				b = 2 * dInput * q2Input,
				c = dInput * dInput * q2Input;
		double output = (b * b) - (4 * a * c);
		output = sqrt(output);
		output += -b;
		output = output / (2 * a);
		return output;
	}
	// PRE-PICTURE
	public void ch23ex4(boolean isRandomInput){
		double m, theta, L;
		double output;
		if(isRandomInput){
			m = toolKit.randInt(1, 5) * pow(10, -2);
			theta = toolKit.randInt(3, 9);
			L = toolKit.randInt(10, 20) * 0.01;
			output = ch23ex4sub(m, theta, L);
		} else {
			m = 3E-2;
			theta = 5;
			L = 0.15;
			output = ch23ex4sub(m, theta, L);
		}
		System.out.println(output);
	}
	public double ch23ex4sub(double mInput, double thetaInput, double LInput){
		double output = sqrt((mInput * g * tan(toRadians(thetaInput)) * pow(2 * LInput * sin(toRadians(thetaInput)), 2)) / ke);
		return output;
	}
	// PRE-PICTURE
	public void ch23ex5(boolean isRandomInput){
		double q1, q2, a, b, y, Ex, Ey;
		double[] output;
		q1 = qp * toolKit.randInt(2, 4);
		q2 = qe * toolKit.randInt(2, 4);
		a = toolKit.randInt(1, 3);
		b = toolKit.randInt(4, 6);
		y = toolKit.randInt(7, 9);
		output = ch23ex5sub(q1, q2, a, b, y);
		System.out.println(output[0] + "\t" + output[1]);
	}
	public double[] ch23ex5sub(double q1Input, double q2Input, double aInput, double bInput, double yInput){
		double[] output = new double[2], topsForOutput = {ke * q1Input, ke * q2Input};
		output[0] = ((ke * q1Input * aInput) / pow(pow(aInput, 2) + pow(yInput, 2), 3/2)) + ((ke * q2Input * -1 * bInput) / pow(pow(bInput, 2) + pow(yInput, 2), 3/2));
		output[1] = ((ke * q1Input * yInput) / pow(pow(aInput, 2) + pow(yInput, 2), 3/2)) + ((ke * q2Input * yInput) / pow(pow(bInput, 2) + pow(yInput, 2), 3/2));
		return output;
	}
	// PRE-PICTURE
	public void ch23ex6(boolean isRandomInput){
		double a = toolKit.randInt(1, 5),
				l = toolKit.randInt(10, 15),
				Q = qp * toolKit.randInt(15, 25);
		double output = ch23ex6sub(a, l, Q);
	}
	public double ch23ex6sub(double aInput, double lInput, double QInput){
		double output = (ke * QInput) / (aInput * (lInput + aInput));
		return output;
	}
	// SOME INITITAL WORK DONE
	public void ch23ex7(boolean isRandomInput){
		double a = 0,
				x = 0,
				Q = 0;
		double E = (toolKit.coulombsConstant() * x * Q) / pow(pow(a, 2) + pow(x, 2), 3/2);
	}
	// SOME INITITAL WORK DONE
	public void ch23ex8(boolean isRandomInput){
		double sigma = 0,
				x = 0,
				R = 0;
		double Ex = (2 * PI * toolKit.coulombsConstant() * sigma) * (1 - (x / sqrt(pow(R, 2) + pow(x, 2))));
	}
	// SOME INITITAL WORK DONE
	public void ch23ex9(boolean isRandomInput){
		double q = 0,
				E = 0,
				d = 0,
				m = 0;
		double vf = sqrt((2 * q * E * d) / (m));
	}
	// PRE-OFFICIAL
	public void ch23ex10(boolean isRandomInput){
		double E, l, vx;
		double[] solutions;
		if(isRandomInput){
			E = toolKit.randInt(150, 250);
			l = toolKit.randInt(5, 20) * pow(10, -2);
			vx = toolKit.randInt(10, 50) * pow(10, 5);
			solutions = ch23ex10sub(E, l, vx);
		} else {
			E = 200;
			l = 0.1;
			vx = 3 * pow(10, 6);
			solutions = ch23ex10sub(E, l, vx);
		}
		System.out.println(solutions[0] + "" + solutions[1] + "" + solutions[2]);
	}
	public double[] ch23ex10sub(double EInput, double lInput, double vxInput){
		double[] solutions = new double[3];
		solutions[0] = -(toolKit.chargeOfAnElectron() * EInput) / toolKit.massOfAnElectron();
		solutions[1] = lInput / vxInput;
		double yf = 0.5 * solutions[0] * pow(solutions[1], 2);
		return solutions;
	}
	public void ch23pr3(boolean isRandomInput) {
		
	}
	public void ch23pr5(boolean isRandomInput) {
		
	}
	public void ch23pr13(boolean isRandomInput) {
		
	}
	public void ch23pr16(boolean isRandomInput) {
		
	}
	public void ch23pr18(boolean isRandomInput) {
		
	}
	public void ch23pr20(boolean isRandomInput) {
		
	}
	public void ch23pr22(boolean isRandomInput) {
		
	}
	public void ch23pr23(boolean isRandomInput) {
		
	}
	public void ch23pr26(boolean isRandomInput) {
		
	}
	public void ch23pr28(boolean isRandomInput) {
		
	}
	public void ch23pr29(boolean isRandomInput) {
		
	}
	public void ch23pr33(boolean isRandomInput) {
		
	}
	public void ch23pr34(boolean isRandomInput) {
		
	}
	public void ch23pr35(boolean isRandomInput) {
		
	}
	public void ch23pr37(boolean isRandomInput) {
		
	}
	public void ch23pr40(boolean isRandomInput) {
		
	}
	public void ch23pr41(boolean isRandomInput) {
		
	}
	public void ch23pr45(boolean isRandomInput) {
		
	}
	public void ch23pr47(boolean isRandomInput) {
		
	}
	public void ch23pr60(boolean isRandomInput) {
		
	}
	public void ch23pr62(boolean isRandomInput) {
		
	}
	public void ch23pr64(boolean isRandomInput) {
		
	}
}
package mainpackage;

import static java.lang.Math.abs;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Tools {
	
	Random random ;
	Scanner reader;
	
	public Tools(){
		random = new Random();
		reader = new Scanner(System.in);
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// Constants ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public final static double g = 9.8;
	public final static double G = 6.674E-11;
	public final static double ke = 8.9875517873681764E9;
	public final static double eo = 8.85418782E-12;
	public final static double qp = 1.6021765E-19;
	public final static double mp =  1.67262E-27;
	public final static double qe = -1.6021765E-19;
	public final static double me = 9.1094E-31;
	public final static double mn = 1.67493E-27;
	public final static double N = 6.0221409E23;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// Functions ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public double randInt(int min, int max){
	    return random.nextInt((max - min) + 1) + min;
	}
	public boolean randBool(){
		return random.nextBoolean();
	}
	public double promptForDouble(String output){
		System.out.println(output);
		return reader.nextDouble();
	}
	public boolean isCloseEnough(double guessInput, double answerInput, double acceptableErrorInput){
		double diffrenceBetweenAnswers = abs(answerInput - guessInput),
				acceptableDiffrencePercentage = 1 - acceptableErrorInput;
		double acceptableDiffrence = abs(answerInput * acceptableDiffrencePercentage);
		if(diffrenceBetweenAnswers <= acceptableDiffrence){
			return true;
		} else {
			System.out.println("The diffrence between the answers is:" + diffrenceBetweenAnswers);
			System.out.println("The acceptable diffrence is:" + acceptableDiffrence);
			return false;
		}
	}
	public void keepAskingTillRight(String stringInput, double answerInput, double acceptableErrorInput){
		System.out.println(stringInput);
		boolean notDone = true;
		while(notDone){
			double inputAnswer = reader.nextDouble();
			notDone = !isCloseEnough(inputAnswer, answerInput, acceptableErrorInput);
		}
	}
	public double coulombsLaw(double qOne, double qTwo, double radius){
		return ((ke * qOne * qTwo) / (radius * radius));
	}
	public LinkedList<String> splitNewLines(String input){
		LinkedList<String> output = new LinkedList<String>();
		while(input.indexOf("\n") != -1){
			output.add(input.substring(0, input.indexOf("\n")));
			input = input.substring(input.indexOf("\n") + 1);
		}
		return output;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/// JFrame ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void printComponent(JComponent jComponentInput, String titleInput, int xInput, int yInput){
		JFrame frame = new JFrame();
		frame.setSize(xInput, yInput);
		frame.setTitle(titleInput);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(jComponentInput);
		// frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(false);
		frame.setVisible(true);
	}
}
	
package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyser_Main {
	public static void main(String[] args) throws MoodAnalysisException {
		
//		System.out.println("Enter Your Message.");
//		Scanner sc = new Scanner(System.in);
//		String message = null;
		MoodAnalyser mood = new MoodAnalyser("");
		System.out.println(mood.analyse_Mood());
	}

}

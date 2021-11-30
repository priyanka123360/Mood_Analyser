package com.bridgelabz;

import java.util.Scanner;

public class MoodAnalyser_Main {
	public static void main(String[] args) {
		
//		System.out.println("Enter Your Message.");
//		Scanner sc = new Scanner(System.in);
//		String message = null;
		MoodAnalyser mood = new MoodAnalyser(null);
		System.out.println(mood.analyse_Mood());
	}

}

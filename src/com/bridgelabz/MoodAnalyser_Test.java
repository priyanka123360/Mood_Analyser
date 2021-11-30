package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyser_Test {
	public String message = "I am in Happy Mood";
	public static MoodAnalyser mood;

	@BeforeClass
	public static void init() {

		mood = MoodAnalyser.getInstance();
	}

	@Test
	public void given_message_should_return_SAD() {

		String testMessage = mood.analyse_Mood(message);
		assertEquals("SAD", testMessage);
	}

	@Test
	public void given_message_should_return_HAPPY() {

		String testMessage = mood.analyse_Mood(message);
		assertEquals("HAPPY", testMessage);
	}
}

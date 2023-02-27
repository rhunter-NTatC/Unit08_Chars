package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import labs.Lab01;

class Lab01_Tests {

public static InOutMimic inOut;
	
	@BeforeAll
	static void beforeAll() {
		inOut = new InOutMimic();
	}
	
	@Test
	@DisplayName("Test Problem #1")
	void test1() {
		String problemNumber = "#1 scanString()";
		String[][] tests = {{"Enter a word: ", "hello there"},
							{"Blargh", "12345"}
							};
		int numTests = tests.length;
		int i = 0;
		String answer = "";
		
		try {
			for (; i < tests.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				inOut.provideInput(tests[i][1]);
				answer = Lab01.scanString(tests[i][0]);
				assertTrue(inOut.getOutputStream().contains(tests[i][0]));
				assertTrue(answer.equals(tests[i][1]));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Possibly didn't return the parameter: " + tests[i][0]
					+ "\n   Expected return should be: " + tests[i][1] 
					+ "\n   Your return: " + answer
					+ "\n   Your output: \n" + inOut.getOutputStream()
					+ "\n\n\n\n");
			fail();
		}
			
		
	}

	
	@Test
	@DisplayName("Test Problem #2")
	void test2() {
		String problemNumber = "#2 isVowel()";
		char[] letters = new char[95];
		boolean[] expectedReturn = new boolean[letters.length];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char) (i + 32);
			switch (i + 32) {
				case 65: case 69: case 73: case 79: case 85:
				case 97: case 101: case 105: case 111: case 117:
					expectedReturn[i] = true;
			}
			
		}
		
		int numTests = letters.length;
		int i = 0;
		boolean answer = false;
		
		try {
			for (; i < letters.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				answer = Lab01.isVowel(letters[i]);
				assertTrue(answer == expectedReturn[i]);
				assertTrue(inOut.getOutputStream().equals(""));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + letters[i]
					+ "\n   Expected return should be: " + expectedReturn[i]
					+ "\n   Your return: " + answer);
			if (!inOut.getOutputStream().equals("")) {
				System.out.println("\n   There should be no print statements in this method."
						+ "\n   Your output: \n" + inOut.getOutputStream());
			}
			System.out.println("\n\n\n\n");
			fail();
		}
			
		
	}
	
	
	@Test
	@DisplayName("Test Problem #3")
	void test3() {
		String problemNumber = "#3 numVowels()";
		String[] words = {"hi", "aeiouy", "blueberry", "AEIOUY", "GIANT"};
		int[] expectedReturn = {1, 5, 3, 5, 2};
		
		int numTests = words.length;
		int i = 0;
		int answer = 0;
		
		try {
			for (; i < words.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				answer = Lab01.numVowels(words[i]);
				assertTrue(answer == expectedReturn[i]);
				assertTrue(inOut.getOutputStream().equals(""));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + words[i]
					+ "\n   Expected return should be: " + expectedReturn[i]
					+ "\n   Your return: " + answer);
			if (!inOut.getOutputStream().equals("")) {
				System.out.println("   There should be no print statements in this method."
						+ "\n   Your output: \n" + inOut.getOutputStream());
			}
			System.out.println("\n\n\n\n");
			fail();
		}
			
		
	}
	
	
	
	@Test
	@DisplayName("Test Problem #4")
	void test4() {
		String problemNumber = "#4 compareVowels()";
		String[][] words = {{"hi", "bye"}, 
				  			{"welcome", "goodbye"}, 
				  			{"cherries", "yellow"}, 
				  			{"GREEN", "aeioius"}};
		int[] expectedReturn = {0, 0, 1, 2};
		
		int numTests = words.length;
		int i = 0;
		int answer = 0;
		
		try {
			for (; i < words.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				answer = Lab01.compareVowels(words[i][0], words[i][1]);
				assertTrue(answer == expectedReturn[i]);
				assertTrue(inOut.getOutputStream().equals(""));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + words[i][0] + " " + words[i][1]
					+ "\n   Expected return should be: " + expectedReturn[i]
					+ "\n   Your return: " + answer);
			if (!inOut.getOutputStream().equals("")) {
				System.out.println("   There should be no print statements in this method."
						+ "\n   Your output: \n" + inOut.getOutputStream());
			}
			System.out.println("\n\n\n\n");
			fail();
		}
			
	}
		
		
	@Test
	@DisplayName("Test Problem #5")
	void test5() {
		String problemNumber = "#5 rot13()";
		String[][] words = {{"it's a me mario", "vg'f n zr znevb"},
							{"hello world", "uryyb jbeyq"}, 
				  			{"i can't even", "v pna'g rira"}, 
				  			{"abcdefghijklmnopqrstuvwxyz", "nopqrstuvwxyzabcdefghijklm"}
				  			};
		
		int numTests = words.length;
		int i = 0;
		String answer = "";
		
		try {
			for (; i < words.length; i++) {
				inOut.resetOutputStream();
				inOut.overridePrintStatements();
				answer = Lab01.rot13(words[i][0]);
				assertTrue(answer.equals(words[i][1]));
				assertTrue(inOut.getOutputStream().equals(""));
			}
		
			inOut.resetSystem();
			System.out.println("Test " + problemNumber + ": Passed all " + numTests + " tests\n\n\n\n");
			
		}
		catch (AssertionError e){
			inOut.resetSystem();
			System.out.println("Error " + problemNumber + ": "
					+ "\n   Failed test " + (i+1) + " of " + numTests
					+ "\n   Input: " + words[i][0]
					+ "\n   Expected return should be: " + words[i][1]
					+ "\n   Your return: " + answer);
			if (!inOut.getOutputStream().equals("")) {
				System.out.println("   There should be no print statements in this method."
						+ "\n   Your output: \n" + inOut.getOutputStream());
			}
			System.out.println("\n\n\n\n");
			fail();
		}
	}
		
	
	
	
	
}
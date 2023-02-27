package labs;

public class Lab01 {

	
	
	public static String scanString(String instructions) {
		
		
		
		return "";
	}
	
	
	public static boolean isVowel(char letter) {
		
		
		return false;
	}
	
	
	public static int numVowels(String str) {
		
		
		return 0;
	}
	
	
	public static int compareVowels(String str1, String str2) {
		
		
		return 0;
	}
	
	
	public static String rot13(String str) {
		
		
		return "";
	}
	

	
	//DO NOT MESS WITH THIS!!!
	//DO NOT MESS WITH THIS!!!
	//DO NOT MESS WITH THIS!!!
	//DO NOT MESS WITH THIS!!!
	//DO NOT MESS WITH THIS!!!
	public static void main(String[] args) {
		
		
		//for #1
		String name = scanString("Enter your name: ");
		System.out.println("Hi " + name + "!");
		
		//for #2
		char c = scanString("Enter a letter: ").charAt(0);	
		if (isVowel(c)) {
			System.out.println(c + " is a vowel.");
		}
		else {
			System.out.println(c + " is not a vowel.");
		}
		
		
		//for #3
		int count = numVowels(scanString("Enter a word: "));
		System.out.println("That has " + count + " vowels.");
		
		
		
		
		//for #4
		String word1 = scanString("Enter a word: ");
		String word2 = scanString("Enter another word: ");
		int results = compareVowels(word1, word2);
		if (results == 1) {
			System.out.println(word1 + " has more vowles than " + word2 + ".");
		}
		else if (results == 2) {
			System.out.println(word2 + " has more vowles than " + word1 + ".");
		}
		else {
			System.out.println(word1 + " and " + word2 + " have the same number of vowels.");
		}
		
		
		
		//for #5
		String cypher = rot13(scanString("Enter a message: ").toLowerCase());
		System.out.println("Coded Message:");
		System.out.println(cypher);
				
		

	}
	
	
}

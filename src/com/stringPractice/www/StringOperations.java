package com.stringPractice.www;

public class StringOperations {
	
	public static void capitalizeFirstLetterOfEachWordInAString(String inputString) {
		System.out.println("Original string before capitalizing first letter: "+inputString);
		//store each character to a char array
		char[] charArrayOfString=inputString.toCharArray();
		//for loop to capitalize first letter
		for(int i=0;i<charArrayOfString.length;i++) {
			//capitalize first letter of first word
			charArrayOfString[0]=Character.toUpperCase(charArrayOfString[0]);
			//loop to check if there is space between two letters
			if(charArrayOfString[i]==' ') {
				charArrayOfString[i+1]=Character.toUpperCase(charArrayOfString[i+1]);
				
			}
			
		}
		//converting the character array to string
		inputString=String.valueOf(charArrayOfString);
		System.out.println("After capitalizing the first letter: "+inputString);
		
	}
	
	public static void printEachElementOfString(String inputString) {
		System.out.println(inputString);
		System.out.println();
		int lengthOfString=inputString.length();
		System.out.println("Length of string: "+lengthOfString);
		for (int i=0;i<lengthOfString;i++) {
			char a= inputString.charAt(i);
			System.out.print(a+", ");
		}
		
	}
	
	public static void checkIfSubstringPresentInAString(String inputString, String subString) {
		if(inputString.contains(subString)) {
			System.out.println("if loop entered");
			System.out.println("String: "+inputString+" contains substring: "+subString);
			System.out.println("last step of if loop");
		}
		else {
			System.out.println("String: "+inputString+" doesnot contain substring: "+subString);
		}
		
	}
	
	public static void countVowelsAndConsonantsInSentence(String inputString) {
		int counterVowel=0;
		int counterConsonant=0;
		for(int i=0;i<inputString.length();i++) {
			
			char ch=inputString.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				counterVowel=counterVowel+1;
				
			}
			else if(ch>'a'&&ch<='z') {
				counterConsonant=counterConsonant+1;
				
			}
			
		}
		System.out.println("Number of vowels : "+counterVowel);
		System.out.println("Number of consonants : "+counterConsonant);
	}

	
	
}

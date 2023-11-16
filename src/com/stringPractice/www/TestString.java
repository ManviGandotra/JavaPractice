package com.stringPractice.www;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAString r=new ReverseAString();
		/*
		r.reverseAString("Reverse this string");
		r.lengthOfString("What is the length of this string");
		
		ReverseArray r1=new ReverseArray();
		String[] s= {"hello", "hi","hola","namaste"};
		r1.arrayLength(s);
		r1.reverseAnArray(s);
		*/
		
		r.checkIfAStringISPalindrome("Hello America");
		r.checkIfAStringISPalindrome("Hello olleh");
		
		StringOperations sopObj=new StringOperations();
		sopObj.capitalizeFirstLetterOfEachWordInAString("capitalize the first letter of this statement");
		sopObj.printEachElementOfString("Print each element of this string");
		sopObj.checkIfSubstringPresentInAString("This is a string and it contains a substring","This is a string");
		sopObj.checkIfSubstringPresentInAString("This is a string", "This is a substring");
		sopObj.countVowelsAndConsonantsInSentence("how many vowels and consonants this string has");

	}

}

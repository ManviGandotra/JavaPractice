package com.stringPractice.www;

public class ReverseAString {
	
	public static String reverseAString(String s) {
		StringBuilder rString=null;
		StringBuilder sb=new StringBuilder();
		System.out.println("Original String: "+sb.append(s));
		rString =sb.reverse();
		System.out.println("Reversed string: "+rString);
		String reversedString=rString.toString();
		return reversedString;
		
	}
	
	public static void lengthOfString(String s) {
		int length=s.length();
		System.out.println("Length of the String- "+s+": "+length);
	}
	
	public static void checkIfAStringISPalindrome(String originalString) {
		String reverseString = reverseAString(originalString);
		if(originalString.equalsIgnoreCase(reverseString)) {
			System.out.println(originalString+" is palindrome");
		}
		else {
			System.out.println(originalString+" is not palindrome");
		}
		
	}
	
	

}

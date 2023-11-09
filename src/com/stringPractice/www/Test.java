package com.stringPractice.www;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAString r=new ReverseAString();
		r.reverseAString("Reverse this string");
		r.lengthOfString("What is the length of this string");
		
		ReverseArray r1=new ReverseArray();
		String[] s= {"hello", "hi","hola","namaste"};
		r1.arrayLength(s);
		r1.reverseAnArray(s);

	}

}

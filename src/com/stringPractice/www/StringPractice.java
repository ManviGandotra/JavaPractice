package com.stringPractice.www;

import java.sql.Array;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String s1=new String("Hello World1");
		System.out.println(s1);
		String s2="Hello World2";
		System.out.println(s2);
		char[] ch= {'a','b','c','d'};
		String s3= new String(ch);
		System.out.println(s3);
		*/
		
		String className=StringPractice.class.getName();
		System.out.println(className);
		StringPractice.getStringLength(className);
		StringPractice.reverseString(className);
		StringPractice.stringMethodsPractice("This is string practice");

	}
	
	public static int getStringLength(String s) {
		int length=s.length();
		return length;
	}
	
	public static void reverseString(String test) {
		String simpleName=null;
		String[] rString=test.split("\\.");
		System.out.println(rString.length);	
		for(int i=0;i<rString.length;i++) {
			//System.out.println(rString[i]);
			if(i==rString.length-1) {
				simpleName=rString[i];
				System.out.println(simpleName);
			}
		}
		String sName=simpleName;
		String tString=null;
		StringBuilder s1= new StringBuilder();
		System.out.println(s1.append(simpleName));
		System.out.println(s1.reverse());
		
		
	}
	
	public static void stringMethodsPractice(String str) {
	
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.equals("hello"));
		System.out.println(str.equals("This is string practice"));
		System.out.println(str.equalsIgnoreCase("this is String Practice"));
		System.out.println(str.replace('i', 'e'));
	}

}

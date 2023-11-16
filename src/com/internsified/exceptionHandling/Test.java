package com.internsified.exceptionHandling;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandlingPractice epObj=new ExceptionHandlingPractice();
		int[] iArray=new int[] {1,5,2,8,3,9,1};
		epObj.arithmeticOperation(30, 0);
		epObj.arithmeticOperation(30, 10);
		epObj.arrayIndexException(iArray);

	}

}

package com.internsified.exceptionHandling;

public class ExceptionHandlingPractice {
	
	public void arithmeticOperation(int i, int j) {
		try {
		int k=i/j;
		System.out.println(k);
		}
		catch(ArithmeticException e) {
			System.out.println("It's an Arithmetic Exception");
		}
	}
	
	public void arrayIndexException(int[] inputArray) {
		int arrayLength=inputArray.length;
	
		try {
			for(int i=0;i<=arrayLength;i++) {
				System.out.println(inputArray[i]+ " ");
			}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Its an ArrayIndexOutOfBoundsException");
			}
		
	}

}

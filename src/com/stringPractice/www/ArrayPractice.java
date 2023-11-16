package com.stringPractice.www;

public class ArrayPractice {
	
	public void sortAnArray(int[] arrayInput) {
		
		int arraySize=arrayInput.length;
		int temp=0;
		System.out.println("Original array : ");
		
		for(int i=0;i<arraySize;i++) {
			System.out.println(arrayInput[i]+" ");
		}
		
		for (int i=0;i<arraySize-1;i++) {
			for(int j=i+1;j<arraySize;j++) {
				if(arrayInput[i]>arrayInput[j]) {
					temp=arrayInput[i];
					arrayInput[i]=arrayInput[j];
					arrayInput[j]=temp;
					
			}
			}
	
		}
		System.out.println("Sorted array : ");
		for(int i=0;i<arraySize;i++) {
			System.out.println(arrayInput[i]+" ");
		}
	}
}

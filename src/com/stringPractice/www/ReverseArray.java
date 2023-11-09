package com.stringPractice.www;

public class ReverseArray {
	
	public void reverseAnArray(String[] st) {

		int lengthOfArray=st.length;
		System.out.println("Original array");
		
		for (int i=0;i<lengthOfArray;i++) {
			System.out.print(st[i]+" ");
			
		}
		System.out.println();
		System.out.println("Reversed array");
		for (int i=lengthOfArray-1;i>=0;i--) {
			System.out.print(st[i]+ " ");
		}
	}
	
	public void arrayLength(String[] st) {
		int lengthOfArray=st.length;
		System.out.println("Length of array is "+lengthOfArray);
	}

}

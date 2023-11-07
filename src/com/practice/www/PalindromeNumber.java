package com.practice.www;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber pn=new PalindromeNumber();
		pn.verifyPalindromeNumber(271);
		pn.verifyPalindromeNumber(8448);
		pn.verifyPalindromeNumber(201);
		pn.verifyPalindromeNumber(909);

	}
	
	public void verifyPalindromeNumber(int i) {
		int temp;
		int sum=0;
		int r;
		
		temp=i;
		
		while(i>0) {
			r=i/10;
			sum=(sum*10)+r;
			i=i/10;
			
		}
		if(temp==sum) {
			System.out.println(sum +" is palindrome number");
		}
		else {
			System.out.println(sum +" is not palindrome number");
		}
		
		
	}

}

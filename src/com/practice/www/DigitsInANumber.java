package com.practice.www;

public class DigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitsInANumber dn=new DigitsInANumber();
		dn.countDigitsInANumber(7865);
		dn.countDigitsInANumber(200019);
		dn.countDigitsInANumber(0);
		dn.countDigitsInANumber(90912);
		dn.countDigitsInANumber(-34);

	}
	
	public void countDigitsInANumber(int num) {
		int count=0;
		int temp=num;
		num=Math.abs(num);  //converts negative integer to positive integer
		while(num>0) {
			//System.out.println("while");
			count=count+1;
			num=num/10;
		}
		System.out.println("Digits in number "+temp+" are "+count);
		
	}

}

package com.practice.www;

public class ReverseTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseTheNumber rn=new ReverseTheNumber();
		rn.reverseNumber(321);
		rn.reverseNumber(781);
		rn.reverseNumber(9008);
		rn.reverseNumber(211);

	}
	
	public void reverseNumber(int num) {
		int sum=0;
		int r;
		int temp=num;
		
		while(num>0) {
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;		
				;
		}
		System.out.println("Reverse of "+temp+" is "+sum);
	}
}

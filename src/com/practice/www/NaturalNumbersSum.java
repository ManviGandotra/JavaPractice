package com.practice.www;

public class NaturalNumbersSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfNaturalNumbers(661);
		sumOfRangeOfNaturalNumbers(20, 39);

	}
	
	public static void sumOfNaturalNumbers(int n) {
		int sum;
		sum=n*(n+1);
		sum=sum/2;
		System.out.println("Sum of "+n+" natural numbers is " +sum);
		
	}
	
	public static void sumOfRangeOfNaturalNumbers(int n, int m) {
		int sum1, sum2, sum;
		sum1=(n-1)*(n);
		sum1=(sum1)/2;
		sum2=m*(m+1);
		sum2=(sum2)/2;
		sum=sum2-sum1;
		System.out.println("Sum of natural numbers from " +n +" to "+m+" is "+sum);
		
		
	}

}

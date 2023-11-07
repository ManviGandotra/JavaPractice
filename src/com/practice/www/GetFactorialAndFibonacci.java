package com.practice.www;

public class GetFactorialAndFibonacci {
	int n3;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GetFactorialAndFibonacci gf=new GetFactorialAndFibonacci();
		gf.getFactorialOfANumber(5);
		gf.displayFibonacciSeries(7);

	}
	
	public void getFactorialOfANumber(int num) {
		long factorial=1;
		 for (int n=num;n>0;n--) {
			 factorial=factorial*n;
			
		 }
		System.out.println("Factorial of "+num+" is "+factorial);
		 //System.out.printf("Factorial of %d = %d", num, factorial);
	}
	
	public void displayFibonacciSeries(int num) {
		int n1=0, n2=1;
		System.out.println("Fibonacci series of "+num+" is");
		System.out.print(n1+" "+n2);
		for(int i=2;i<=num;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3+" ");
		}
		
	}

}

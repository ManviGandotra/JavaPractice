package com.practice.www;

public class VariablesPractice {
	
	int x=8, y=23,z=89;
	static int n=42;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariablesPractice vp=new VariablesPractice();
		vp.add(56,7);
		vp.add(vp.x, vp.y);
		vp.add(56, vp.x, vp.z, 221);
		vp.add(n, vp.n, 22, vp.z);

	}
	
	public void add(int a, int b) {
		int j=54;
		System.out.println("This is local variable j with valiue "+j);
		int sum =a+b;
		System.out.println("Sum of two numbers is "+sum);
		
	}
	
	public void add(int a, int b, int c) {
		int sum =a+b+c;
		System.out.println("Sum of three numbers is "+sum);
		
	}
	public void add(int a, int b, int c, int d) {
		int sum =a+b+c+d;
		System.out.println("Sum of four numbers is "+sum);
		
	}



}

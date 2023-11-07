package com.assignment.www;

public class ForLoopPatternAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1();
		pattern2();
		pattern3();
		pattern4();
		pattern5();

	}
	
	public static void pattern1() {
		System.out.println("Pattern 1");
		for (int i=1;i<=7;i++) {
			System.out.println("*");
		}
	}
	
	public static void pattern2() {
		System.out.println("Pattern 2");
		for (int i=1;i<=8;i++) {
			System.out.print("#");
		}
		System.out.println();
	}
	
	public static void pattern3() {
		System.out.println("Pattern 3");
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern4() {
		System.out.println("Pattern 4");
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}
	
	public static void pattern5() {
		System.out.println("Pattern 5");
		for (int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(i+"  ");
			}
			System.out.println();
		}
	}

}

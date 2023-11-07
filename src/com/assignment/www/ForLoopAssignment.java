package com.assignment.www;

public class ForLoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSoftwareTesting();
		printNumbersInGivenRange();
		printEvenNumbersInGivenRange();
		printOddNumberInGivenRange();
	

	}
	//1. print software testing 15 times
	public static void printSoftwareTesting() {
		System.out.println("print software testing 15 times");
		for (int i=1;i<=15;i++) {
			System.out.println(i+" Software Testing");
		}
		
	}
	//print all numbers from 75 to 25
	public static void printNumbersInGivenRange() {
		System.out.println("print all numbers from 75 to 25");
		for(int i=75;i>=25;i--) {
			System.out.println(i+"  ");
		}
			
	}
	
	//print even numbers from 50 to 100
	public static void printEvenNumbersInGivenRange() {
		System.out.println("print even numbers from 50 to 100");
		for (int i=50;i<=100;i++) {
			System.out.println(i+"  ");
			i++;
		}
	}
	
	//print odd numbers from 1 to 70
	public static void printOddNumberInGivenRange() {
		System.out.println("print odd numbers from 1 to 70");
		for (int i=1;i<=70;i++) {
			if(i%2!=0) {
				System.out.println(i+"  ");
			}
		}	
	}
	
	
	

}

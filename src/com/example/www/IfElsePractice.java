package com.example.www;

public class IfElsePractice {
	
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voteEligibility(19);
		voteEligibility(18);

	}
	
	public static void voteEligibility(int age) {
		if(age>=18) {
			System.out.println("Person is eligible");
		}
		else {
			System.out.println("Person not eligible");
		}
	}
	

}

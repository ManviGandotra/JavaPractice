package com.practice.www;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkLeapYear(1996);
		checkLeapYear(2005);
		checkLeapYear(2020);
		checkLeapYear(2023);

	}
	
	public static void checkLeapYear(int year) {
		int r;
		r=year%4;
		if(r==0) {
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not a leap year");
		}
	}

}

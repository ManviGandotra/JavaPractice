package com.example.www;

public class SwitchCaseFallThrough {
	
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day;
		day=11;
		
		switch(day)
		{
		case 1:
			System.out.println("Today is Sunday");
			
			
		case 2:
			System.out.println("Today is Monday");
			
		case 3:
			System.out.println("Today is Tuesday");
			
		case 4:
			System.out.println("Today is Wednesday");
			
		case 5:
			System.out.println("Today is Thursday");
			
		case 6:
			System.out.println("Today is Friday");
			
		case 7:
			System.out.println("Today is Saturday");
			
			default:
				System.out.println("No such day");
		}
		System.out.println("you got your day");

	}

}

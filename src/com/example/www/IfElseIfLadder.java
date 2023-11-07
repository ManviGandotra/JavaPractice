package com.example.www;

public class IfElseIfLadder {
	
	static int month;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		month=12;
		
		if(1<month && month<3) {
			System.out.println("Season is Winter");
		}
		else if(3<=month && month<6) {
			System.out.println("Season is spring");
			
		}
		else if(6<=month && month<10) {
			System.out.println("season is summer");
			
		}
		else if(10<=month && month <=12) {
			System.out.println("season is fall");
			
		}
		else {
			System.out.println("No such season");
		}
	}

}

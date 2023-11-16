package com.internsified.inheritance;

public class PrivateSchool extends School {

	int fee;
	public PrivateSchool(String board, String leader, String level, int fee) {
		super(board, leader, level);
		// TODO Auto-generated constructor stub
		this.fee=fee;
	}
	
	public void printFee() {
		System.out.println("Fee is "+fee);
	}

	

}

package com.internsified.inheritance;

public class EducationInstitution {
	String board="Board of Institution";
	String leader= "Leader of Instituion";
	
	public EducationInstitution(String board, String leader) {
		
		System.out.println("EducationInstitution(String board, String leader)");
		this.board = board;
		this.leader = leader;
		
	}
	/*
	 * public EducationInstitution() {
		System.out.println("EducationInstitution");
	}
	*/



	
	
	public void printBoard() {
		System.out.println("Board is "+board);
	}
	
	public void printLeader() {
		System.out.println("Leader is "+leader);
	}
	
	

}

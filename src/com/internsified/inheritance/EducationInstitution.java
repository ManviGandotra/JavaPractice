package com.internsified.inheritance;

public class EducationInstitution {
	String board="Board of Institution";
	String leader= "Leader of Instituion";
	
	public EducationInstitution(String board, String leader) {
		
		super();
		this.board = board;
		this.leader = leader;
	}



	
	
	public void board() {
		System.out.println(board);
	}
	
	public void leader() {
		System.out.println(leader);
	}
	
	

}

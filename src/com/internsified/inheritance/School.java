package com.internsified.inheritance;

public class School extends EducationInstitution {
	String level="School level";
	int schoolRating;	
	public School(String board, String leader, String level) {
		super(board, leader);
		System.out.println("School(String board, String leader, String level)");
		super.board=board;
		super.leader=leader;
	
		this.level = level;

	}
	
	
	
	public School(String board, String leader) {
		
		super(board, leader);
		System.out.println("School(String board, String leader)");
	}
	
	public void printLevel() {
		System.out.println("Level is "+level);
	}
	
	public void printAllAttributes() {
		this.printAllAttributes(this);
	
	}
	
	public void printAllAttributes(School school) {
		System.out.println("Board is "+school.board);
		System.out.println("Leader is "+school.leader);
		System.out.println("Level is "+school.level);
	}
	
	

}

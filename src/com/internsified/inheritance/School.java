package com.internsified.inheritance;

public class School extends EducationInstitution {
	String level="School level";
	int schoolRating;	
	public School(String board, String leader, String level) {
		super(board, leader);
		this.level = level;

	}
	
	public School(String board, String leader) {
		super(board, leader);
	}
	
	public void level() {
		System.out.println("Level is "+level);
	}

}

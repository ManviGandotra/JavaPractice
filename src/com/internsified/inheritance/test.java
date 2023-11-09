package com.internsified.inheritance;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School s=new School("CBSE", "Manvi");
		School s1=new School("ICSE", "Dhvani");
		
		s.board();
		System.out.println("School has "+s.board);
		System.out.println("School has "+s.leader);
		System.out.println("School has "+ s.level);
		System.out.println();
		
		EducationInstitution ed= new EducationInstitution("", "");
		
		ed=s;
		//ed.level; //error
		

	}

}

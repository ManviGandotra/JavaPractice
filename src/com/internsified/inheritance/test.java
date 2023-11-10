package com.internsified.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School s=new School("CBSE", "Manvi");
		
		School s1=new School("ICSE", "Dhvani");
		
		PrivateSchool ps= new PrivateSchool("CBSE", "Henry", "High School", 2000);
		
		/*System.out.println("School board is "+s.board);
		System.out.println("School leader is "+s.leader);
		System.out.println("This is "+ s.level);
		
		System.out.println("School board is "+ps.board);
		System.out.println("School leader is "+ps.leader);
		System.out.println("This is "+ ps.level);
		System.out.println("School fee is "+ps.fee);
		*/
		
		s.board();
		s.leader();
		s.level();
		
		ps.board();
		ps.leader();
		ps.level();
		ps.fee();
		
		
		
		EducationInstitution ed= new EducationInstitution("", "");
		
		ed=s;
		//ed.level; //error
		

	}

}

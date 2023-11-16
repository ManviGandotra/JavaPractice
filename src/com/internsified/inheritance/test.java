package com.internsified.inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		School cbseSchool=new School("CBSE", "Manvi","high school");
		
		/*
		School icseSchool=new School("ICSE", "Dhvani");
		 
		School stateBoardSchool= new School();
		
		PrivateSchool privateSchool= new PrivateSchool("CBSE", "Henry", "High School", 2000);
		*/
		
		/*System.out.println("School board is "+s.board);
		System.out.println("School leader is "+s.leader);
		System.out.println("This is "+ s.level);
		
		System.out.println("School board is "+ps.board);
		System.out.println("School leader is "+ps.leader);
		System.out.println("This is "+ ps.level);
		System.out.println("School fee is "+ps.fee);
		*/
		
		/*
		cbseSchool.printBoard();
		cbseSchool.printLeader();
		cbseSchool.printLevel();
		System.out.println("************");
		cbseSchool.printAllAttributes();
		System.out.println("************");
		icseSchool.printBoard();
		icseSchool.printLeader();
		icseSchool.printLevel();
		System.out.println("************");
		icseSchool.printAllAttributes();
		System.out.println("************");
		cbseSchool.printAllAttributes();
		System.out.println("************");
		stateBoardSchool.printAllAttributes();
		*/
		
		
		/*
		 * privateSchool.printBoard(); privateSchool.printLeader();
		 * privateSchool.printLevel(); privateSchool.printFee();
		 * System.out.println("************");
		 * 
		 * stateBoardSchool.printAllAttributes(stateBoardSchool);
		 * 
		 */	
		
		
		EducationInstitution ed= cbseSchool;
		//ed.level; //error
		

	}

}

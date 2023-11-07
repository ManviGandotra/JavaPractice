package com.practice.www;

public class VerifyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VerifyChar vc=new VerifyChar();
		vc.verifyIfCharIsAlphabet('*');
		vc.verifyIfCharIsAlphabet('g');
		vc.verifyIfCharIsAlphabet('#');

	}
	
	public void verifyIfCharIsAlphabet(char a) {
		if(Character.isAlphabetic(a)) {
			System.out.println(a+" is alphabet");
		}
		else {
			System.out.println(a+" is not alphabet");
		}
		
	}

}

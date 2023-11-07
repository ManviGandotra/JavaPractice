package com.loopsInJava.www;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=1;i<10;i++) {
			
			System.out.println("Table of "+i);
			
			for (int j=1;j<11;j++ ) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}

	}

}

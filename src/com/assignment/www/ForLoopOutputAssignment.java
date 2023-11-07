package com.assignment.www;

public class ForLoopOutputAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program1();
		//program2();
		//program3();
		//program4();
		program6();
		program7();

	}
	
	public static void program1() {
		System.out.println("Program 1");
		for(int i=1; ;i++) {
			System.out.println(i);
		}
	}
	//OUTPUT- Infinite loop (numbers incrementing)
	
	public static void program2() {
		System.out.println("Program 2");
		for(int i=1;i<=10;) {
			System.out.println(i);
		}
	}
	//OUTPUT- Infinite 1
	
	public static void program3() {
		System.out.println("Program 3");
		for(int i=1; ;) {
			System.out.println(i);
		}
	}
	//OUTPUT- Infinite 1
	
	public static void program4() {
		System.out.println("Program 4");
		for( ; ; ) {
			System.out.println("hello");
		}
	}
	//OUTPUT- Infinite hello
	/*public static void program5() {
		System.out.println("Program 5");
		for() {
			System.out.println("hello");
		}
	}
	*/
	//wrong syntax
	
	public static void program6() {
		System.out.println("Program 6");
		for(int i=1;i<10 ;i++) {
			
		if (i==5) {
			break;
		}
		System.out.println(i);
		}
	}
	
	//OUTPUT- numbers from 1 to 4 because of loop was exited because of break keyword on meeting condition i==5 
	
	public static void program7() {
		System.out.println("Program 7");
		for(int i=1;i<10 ;i++) {
			
		if (i==5) {
			continue;
		}
		System.out.println(i);
		}
	}
	
	//OUTPUT- numbers from 1 to 9 except for 5 

}

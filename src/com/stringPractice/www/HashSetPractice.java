package com.stringPractice.www;

import java.util.HashSet;

public class HashSetPractice {
	
	static HashSet<Integer> inputHashSet=new HashSet<Integer>();
	
	public void printHashSet(HashSet<Integer> iHashSet) {
		
		int inputLength=iHashSet.size();
		System.out.println("Length of HashSet is : "+inputLength);
		System.out.println("We are printing HashSet using sop statement: "+iHashSet);
		
		System.out.println("We are printing HashSet using for each loop ");
		for (int i:iHashSet) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputHashSet.add(12);
		inputHashSet.add(34);
		inputHashSet.add(13);
		inputHashSet.add(4);
		HashSetPractice hsp=new HashSetPractice();
		hsp.printHashSet(inputHashSet);
		//adding duplicate value
		inputHashSet.add(12);
		hsp.printHashSet(inputHashSet);
		//removing a value
		inputHashSet.remove(4);
		hsp.printHashSet(inputHashSet);
		inputHashSet.add(0);
		hsp.printHashSet(inputHashSet);

	}

}

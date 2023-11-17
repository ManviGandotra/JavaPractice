package com.stringPractice.www;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPractice {
	
	static ArrayList<Integer> inputArrayList=new ArrayList<Integer>();
	
	
	public static void printArrayList(ArrayList<Integer> inputAList) {
		
		int arrayLength=inputAList.size();
		System.out.println("length of ArrayList is : "+arrayLength);
		System.out.println("We are printing ArrayList using sop statement: "+inputAList);
		
		System.out.println("We are printing ArrayList using for each loop:  ");
		for (int i:inputAList) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("We are printing ArrayList using for loop");
		for(int i=0; i<arrayLength;i++)
		{
			System.out.print(inputAList.get(i)+" ");
			}
		System.out.println();
		System.out.println();
		}
	
	public static void main(String[] args) {
		inputArrayList.add(23);
		inputArrayList.add(0);
		inputArrayList.add(45);
		inputArrayList.add(3);
		printArrayList(inputArrayList);
		inputArrayList.remove(2);
		printArrayList(inputArrayList);
		//inputArrayList.sort(null);
		Collections.sort(inputArrayList);
		printArrayList(inputArrayList);
		System.out.println("Value at index 1 is : "+inputArrayList.get(1));
		//System.out.println("Last index of ArrayList is: "+inputArrayList.lastIndexOf(inputArrayList));
		//inputArrayList.toArray();
		inputArrayList.trimToSize();
		System.out.println(inputArrayList);
		
	}

}

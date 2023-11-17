package com.stringPractice.www;

import java.util.HashMap;

public class HashMapPractice {
	
	static HashMap<Integer, String> inputHashMap=new HashMap<Integer, String>();
	
	public void printHashMap(HashMap<Integer, String> iHashMap) {
		int length=iHashMap.size();
		System.out.println("Length is  "+length);
		System.out.println(iHashMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputHashMap.put(2, "Neha");
		//add duplicate values with different keys
		inputHashMap.put(12, "Neha");
		inputHashMap.put(5, "Ria");
		inputHashMap.put(10, "Zia");
		HashMapPractice hmp=new HashMapPractice();
		hmp.printHashMap(inputHashMap);
		//add duplicate keys with same/different values
		inputHashMap.put(10, "Sia");
		inputHashMap.put(10, "Alina");
		inputHashMap.put(11, "Zia");
		hmp.printHashMap(inputHashMap);
		System.out.println("Value for key 5 is "+inputHashMap.get(5));
		//add null value for a key
		inputHashMap.put(14,null);
		hmp.printHashMap(inputHashMap);
		inputHashMap.put(19,null);
		hmp.printHashMap(inputHashMap);
		//add null key
		inputHashMap.put(null,"Zoya");
		inputHashMap.put(null,null);
		hmp.printHashMap(inputHashMap);
		

	}

}

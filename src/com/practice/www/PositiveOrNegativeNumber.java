package com.practice.www;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveOrNegativeNumber pn=new PositiveOrNegativeNumber();
		pn.ifNumberIsPositiveOrNegative(33);
		pn.ifNumberIsPositiveOrNegative(0);
		pn.ifNumberIsPositiveOrNegative(-220);
		pn.ifNumberIsPositiveOrNegative(1);

	}
	
	public void ifNumberIsPositiveOrNegative(int num) {
		if(num>0) {
			System.out.println(num +" is positive number");
		}
		else if (num<0) {
			System.out.println(num +" is negative number");
		}
		else if(num==0) {
			System.out.println(num +" is neither positive nor negative");
		}
	}

}

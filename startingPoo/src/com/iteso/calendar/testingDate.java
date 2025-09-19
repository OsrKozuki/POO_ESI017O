package com.iteso.calendar;

public class testingDate {
	public static void main(String[] args) {
		Date newDate = new Date(2012, 12, 20);
		Date newDateTwo = newDate.clone();
		String newDateOne = newDate.toString(0);
		System.out.println(newDateOne);
		newDateOne = newDate.toString(1);
		String newDateOneTwo = newDateTwo.toString(2);
		System.out.println(newDateOneTwo);
		
		if(newDate.equals(newDateTwo)) {
			System.out.println("The Object is the same");
		}else {
			System.out.println("The Object is not the same");
		}
		
		System.out.println("---------- After Modifications ---------- ");
		
		Date NewDateNext = newDate.next();
		System.out.println("This is for NewDateNext");
		System.out.println(NewDateNext.toString(0));
		System.out.println(NewDateNext.toString(1));
		System.out.println(NewDateNext.toString(2));
		System.out.println();
		
	}
}

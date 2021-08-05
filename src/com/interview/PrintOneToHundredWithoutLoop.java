package com.interview;

public class PrintOneToHundredWithoutLoop {

	public static void printNumver(int n) {
		
		if(n > 0) {
			printNumver(n - 1);
			System.out.println(n+" ");
		}
	}
	
	public static void main(String[] args) {
		
		int number = 100;
		printNumver(number);
	}

}

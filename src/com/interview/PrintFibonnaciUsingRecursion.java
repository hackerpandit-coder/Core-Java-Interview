package com.interview;

public class PrintFibonnaciUsingRecursion {
	
	static int n1 = 0, n2 = 1;
	
	public static void printFibonnaci(int count) {
		
		if(count > 0) {
			
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			printFibonnaci(count - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 10;
		System.out.print(n1+" "+n2);
        printFibonnaci(count - 2);
	}

}

package com.interview;

import java.util.Scanner;

public class CheckPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse = "";
		System.out.println("Enter a value :");
		Scanner sc = new Scanner(System.in);
		original = sc.nextLine();
		int length = original.length();
		for(int i = length - 1; i>=0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(reverse.equalsIgnoreCase(original))
			System.out.println(original+": the given value is palindrome");
		else
			System.out.println(original+": the given no is not palindrome");
	}

}

package com.interview;

import java.util.Scanner;

public class PalindromeIntegerWala {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, sum = 0, temp;
		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		temp = n;
		
		while(n > 0) {
			
			r = n % 10;
			sum = (sum*10)+r;
			n = n/10;
		}
		
		if(temp == sum) {
			System.out.println(sum+" is palindrome...");
		}
		else {
			System.out.println(sum+" is not palindrome...");
		}

	}

}

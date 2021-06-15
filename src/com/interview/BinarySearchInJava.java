package com.interview;

import java.util.Scanner;

public class BinarySearchInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,25,28,35,50,58,65,78,87,93};
		
		System.out.println("Enter the number to be search:");
		Scanner sc = new Scanner(System.in);
		int serchItem = sc.nextInt();
		
		int firstIndex = 0;
		int lastIndex = arr.length-1;
		int middleIndex = (firstIndex+lastIndex)/2;
		
		while (firstIndex<=lastIndex) {
			
			if(arr[middleIndex]==serchItem) {
				break;
			}
			
			else if (arr[middleIndex] < serchItem) 
				firstIndex = middleIndex+1;
			
			else 
				lastIndex = middleIndex-1;
			
			middleIndex = (firstIndex+lastIndex)/2;
			
			
		}
		System.out.println("Your are Searching "+serchItem+" Which is at Index "+middleIndex);
		System.out.println();
		BinarySearchInJava.main(null);


	}

}

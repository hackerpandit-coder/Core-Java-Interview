package com.interview;

import java.util.Arrays;

public class FindLargestNumberUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,25,45,23,75,26,35,62,95,28};
		
		int size = arr.length;
		
		int max = arr[0];
		
		Arrays.sort(arr);
		
		System.out.println("Smallest Number from array :"+ arr[0]);
		
		System.out.println("Largest value from array : "+arr[size - 2]);
		
		for(int i = 0; i< size; i++) {
			 max = arr[i];
		}
		System.out.println("Largest number by legacy way :"+ max);
	
	}

}

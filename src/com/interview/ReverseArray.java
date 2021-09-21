package com.interview;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,3,1,8,7};
//		System.out.println("Forword Array");
//		for(int i = 0; i< arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//		
//		System.out.println("Reverse Array");
//
//		for(int i = arr.length - 1; i>= 0; i--) {
//			System.out.print(arr[i]);
//		}
		//For finding max value
		int max = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max value :"+max);
		
		//For finding min value
		int min = arr[0];
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min value :"+min);
	}
}

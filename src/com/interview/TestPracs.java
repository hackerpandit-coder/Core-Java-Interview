package com.interview;

public class TestPracs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 7, 2, 4 };
		int sum = 6;
		for(int i = 0; i< arr.length ; i++) {
			for(int j = i + 1; j< arr.length; j++) {
				if(arr[i]+arr[j] == sum) {
					System.out.println(arr[i]+":"+arr[j]);
				}
			}
		}

	}

}

package com.interview;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,9,7,8,10,1,3,4,6};
		
		Arrays.sort(arr);
		int arrIndex = 0;
		
		for(int i = 0; i< arr[arr.length - 1]; i++) {
			if(i == arr[arrIndex]) {
				arrIndex++;
			}
			else
				System.out.println("Missing Number :"+i);
		}

	}

}

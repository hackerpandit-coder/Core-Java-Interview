package com.interview;

public class SecongMaxNumber {
	
	public static int getSecondLargestNumber(int[] a, int total) {
		
		int temp;
		for(int i = 0; i< total ; i++) {
			
			for(int j = i+ 1; j< total ; j++) {
				
				if(a[i] > a[j]) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For finding 2nd highest number from array using advance way
		int a[] = {1,5,3,6,2,4};
//		int size = a.length;
//		Arrays.sort(a);
//		System.out.println("2nd Largest Number : "+a[size-2]);
		System.out.println("2nd Largest Number :"+getSecondLargestNumber(a,6));

	}

}

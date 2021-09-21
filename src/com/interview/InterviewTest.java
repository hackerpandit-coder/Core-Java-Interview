package com.interview;

import java.util.HashMap;
import java.util.Map;

public class InterviewTest {
	
	//Find Minimum frequency

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {6 ,6, 7, 7, 5, 5, 9};
		
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], hashMap.get(arr[i])+1);
				
			}
			else {
				hashMap.put(arr[i], 1);
			}
		}
		
		

	}

}

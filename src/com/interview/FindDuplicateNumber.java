package com.interview;

import java.util.HashMap;
import java.util.Map.Entry;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Array of Number
		int[] arr = {3,2,8,8,3,2,3,2,2};
		//String[] arrayString = {"stack","google","insolution","isg","stack","google","stack","disk","danger"};
		//List<Integer> li = IntStream.of(arr).boxed().collect(Collectors.toList());
		//System.out.println(li);
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for(int value : arr) {
			if(hashMap.containsKey(value)) {
				hashMap.put(value, hashMap.get(value)+1);
			}
			else {
				hashMap.put(value, 1);
			}
		}
		
		//For printing value
		for(Entry<Integer, Integer> map : hashMap.entrySet()) {
			System.out.println(+map.getKey()+":"+map.getValue());
		}
			
	}
}

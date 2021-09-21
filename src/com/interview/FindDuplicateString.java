package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Array of string
		String[] arrayString = {"stack","google","insolution","isg","stack","google","stack","disk","danger"};
		
		//Converting Array to list This Conversion optional
		List<String> list = Arrays.asList(arrayString);
		
		//Pring list
		System.out.println(list);
		
		//printing list using java 8
		list.forEach(a -> System.out.println(a));
		
		//Created Map object
		Map<String, Integer> map = new HashMap<>();
		
		for(String str : arrayString) {
			if(map.containsKey(str)) {
				map.put(str, map.get(str)+1);
			}
			else {
				map.put(str, 1);
			}
		}
		
		//For Print List value
		for(Map.Entry<String, Integer> mapList : map.entrySet()) {
			System.out.println(mapList.getKey()+":"+mapList.getValue());
		}			
	}
}

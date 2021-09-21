package com.interview;

import java.util.HashMap;
import java.util.Map;

public class MapPractise {

	public static void main(String[] args) {
		// Create Map object
		Map<String, String> map = new HashMap<>();
		map.put("Rahul", "Mishra");
		map.put("Kallu", "Pandey");
		map.put("Sammer", "Verma");
		map.put("Ramesh", "Singh");
		
		System.out.println(map);
		// For key iteration
		for (String keys : map.keySet()) {
			System.out.println(keys);
			
		}
		// For value iteration
		for(String value : map.values())
		{
			System.out.println(value);
		}
		
		//For Key and value iteration
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key :"+entry.getKey()+ "="+entry.getValue());
		}
		
		//For fetch value based on key
		System.out.println(map.get("Kallu"));
		System.out.println(map.get(null));
		
		//For key and value iteration using java 8
		map.forEach((k,v) -> System.out.println("Key :"+k+":"+v));
		
	}
}

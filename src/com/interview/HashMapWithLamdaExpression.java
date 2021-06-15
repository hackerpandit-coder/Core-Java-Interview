package com.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapWithLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "VIRENDRA");
		map.put(10, "Ramesh");
		map.put(25, "Sharma");
		map.put(40, "Kallu");
		map.put(75, "Dhanjay");
		map.put(null, "abc");
		
		map.keySet().stream().forEach(key -> System.out.println(key));   // Find key using lambda expression
		
		map.values().stream().forEach(value -> System.out.println(value));   // Find value using lambda expression
		
		map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+":"+entry.getValue()));    //// Find key and value using lambda expression
		
		//System.out.println(map.get(null));   // Find value based on key
		
		// Using for loop find key and value
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
			
		}
		//Using for loop find key only
		for(int i: map.keySet()) {
			System.out.println(i);
			
		}

		
		// using for loop find value only
		for(String s: map.values()) {
			System.out.println(s);
		}
	}

}

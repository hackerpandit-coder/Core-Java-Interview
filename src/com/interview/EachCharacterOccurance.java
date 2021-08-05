package com.interview;

import java.util.HashMap;
import java.util.Map;

public class EachCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gitika";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i< str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> list : map.entrySet()) {
			System.out.println(list.getKey()+":"+list.getValue());
		}

	}

}

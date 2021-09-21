package com.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class FindSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
//
//		Arrays.sort(arr);
//		
//		int length = arr.length;
//		
//		System.out.println("Second Highest Number :"+arr[length-2]);
		
//		int[] array={ -40, -5, 1, 3, 6, 7, 8, 20 };
//		
//		int sum = 15;
//
//		for(int i = 0; i< array.length; i++) {
//			for(int j = i + 1; j < array.length; j++) {
//				if(array[i]+array[j] == sum) {
//					System.out.println(array[i]+":"+array[j]);
//				}
//			}
//		}
		
		String str1 = "abcdABCDabcd";

		Stream<Character> strChar = str1.chars().mapToObj(val -> (char) val);
		
		//strChar.distinct().forEach(System.out::print);
		
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		for(int i = 0; i< str1.length(); i++) {
			if(hashMap.containsKey(str1.charAt(i))) {
				hashMap.put(str1.charAt(i), hashMap.get(str1.charAt(i))+1);
			}
			else {
				hashMap.put(str1.charAt(i), 1);
			}
		}

		//hashMap.entrySet().stream().forEach(val -> System.out.println(val.getKey()+":"+val.getValue()));
		for(Map.Entry<Character, Integer> map : hashMap.entrySet()) {
			System.out.println(map.getKey()+":"+map.getValue());
		}
	}

}

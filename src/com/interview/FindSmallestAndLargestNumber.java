package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestAndLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer arr[] = {2,45,9,10,95,15,65,25,35,4,75,85};
		
		List<Integer> list = Arrays.asList(arr);
		System.out.println("List------ :"+list);
		Collections.sort(list);
		System.out.println("Sorted List :"+list);
		
		System.out.println("Smallest Number :"+list.get(0));
		
		System.out.println("Largest Number : "+list.get(list.size()-1));

	}
}

package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonElementInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list1 = Arrays.asList(1,56,78,95,54,0,9);
		List<Integer> list2 = Arrays.asList(2,75,56,35,42,95,9,0);
		
		List<Integer> list3 = new ArrayList<>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		list3.stream().sorted().forEach(System.out::print);
		
		//Concate list or merge using java 8 stream api's
		List<Integer> intList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		
		//Using Java 7 find max
		int maxVal = Collections.max(list2);
		System.out.println("Max value : "+maxVal);
		
		//Duplicate integer from list using java 8 stream api's
		HashSet<Integer> hashSet = new HashSet<>();
		List<Integer> duplicateElement = intList.stream().filter(val -> !hashSet.add(val)).collect(Collectors.toList());
		System.out.println("Duplicate element present in list : "+duplicateElement);
		
		//Using Java 8 find max
		Integer maxValue = list2.stream().max(Integer::compare).get();
		System.out.println("Max value using java 8 : "+maxVal);
		
		System.out.println("List1 :"+intList);
		
		//filter even and odd value using this otherwise we can write logic inside lambda block code if and else condition 
		//if val divide by 2 == 0 is return true else list.add(val); and return false;
		
		//Map<Boolean, List<Integer>> = list2.stream().collect(Collectors.partitioningBy(val -> val%2 == 0));
		
		//Find even and odd value using java 8 stream api's
		List<Integer> oddVal = new ArrayList<>();
		List<Integer> evenVal = list3.stream().filter(val -> {
			if(val%2 == 0) {
				return true;
			}else {
				oddVal.add(val);
				return false;
			}
		}).sorted().distinct().collect(Collectors.toList());
		
		System.out.println("Even List :"+evenVal);
        System.out.println("Odd List :"+oddVal);
		
	}

}

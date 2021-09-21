package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayIntoArrayList {

	public static void main(String[] args) {
		
		//Create Array
		int[] a = {1,2,3,4,5,6,7,8,9};
		
		List<Integer> list = IntStream.of(a).boxed().collect(Collectors.toList());
		
		System.out.println(list);
		
		//Convert array into arrayList
		String[] s = {"Ramesh","Mahesh","Sittu","Amar","Govind","Bandana","Yuvraj","Sanjay"};
		List<String> arrayList = Arrays.asList(s);
		System.out.println("ArrayList-----:"+arrayList);
		Collections.sort(arrayList);
		System.out.println("Sorted ArrayList----:"+arrayList);
		System.out.println();
		
		//Convert arrayList to array
		String[] arr = arrayList.toArray(new String[0]);
		System.out.println("Array---:"+arr);
		
		int index = 0;
		for(String ar: arr) {
			System.out.println(ar+":"+index);
			index++;
		}	
	}
}

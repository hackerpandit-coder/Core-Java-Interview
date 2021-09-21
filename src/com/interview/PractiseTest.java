package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PractiseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(5);
		list1.add(3);
	
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		list2.add(1);
		list2.add(5);
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println(list1.equals(list2));

	}

}

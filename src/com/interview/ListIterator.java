package com.interview;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Virendra");
		list.add("Mishra");
		list.add("Adarsh");
		list.add("Kallu");
		
		for(String str : list) {
			list.remove(1);  // It will throw java.util.ConcurrentModificationException at runtime 
			System.out.println(str);
		}

	}

}

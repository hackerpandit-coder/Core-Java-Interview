package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(5);
		list.add(23);
		list.add(45);
		list.add(56);
		list.add(48);
		
		List<Integer> oddlist = list.stream().filter(val -> val%2 != 0).collect(Collectors.toList());

		System.out.println("Odd Number : "+oddlist);
		
		Collections.reverse(oddlist);
		
		System.out.println("Revrse order :"+oddlist);
	}

}

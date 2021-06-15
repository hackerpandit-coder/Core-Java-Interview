package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUsingLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(15);
		list.add(25);
		list.add(65);
		list.add(75);
		list.add(32);
		list.add(95);
		
		Collections.sort(list);
		System.out.println("Asending Order List :"+list);
		
		Collections.sort(list, (I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
		System.out.println("Descending Order List :"+list);

	}

}

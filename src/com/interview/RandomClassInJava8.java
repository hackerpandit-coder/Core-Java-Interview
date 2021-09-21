package com.interview;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomClassInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We can generate random number using Java 8
		List<Object> numbers =  new Random().ints(0,350).limit(8).boxed().collect(Collectors.toList());
		System.out.println("Random Number : "+numbers);

		//We can generate random double using Java 8
		Random random = new Random();
		List<Double> list = random.doubles(0.0, 415.0).limit(10).boxed().collect(Collectors.toList());
		System.out.println("List : "+list);
	}

}

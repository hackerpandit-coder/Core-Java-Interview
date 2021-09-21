package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> arrList = Arrays.asList(10,30,40,20,40,60,50,40,80,90,50);
		
		Collections.sort(arrList);
		//Remove duplicate from integer array using distinct method
		arrList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		
		String[] arrayString = {"stack","google","insolution","isg","stack","google","stack","disk","danger"};
		
	    List<String> stringList = Arrays.asList(arrayString);

	    //Removing duplicate from list of string
	    stringList.stream().distinct().sorted().forEach(System.out::println);
	    
	    String str = "aaabcdaabbeeecccddd";
	    
	    //Converting string to charcter stream object
	    Stream<Character> streamChar = str.chars().mapToObj(val -> (char) val);
	    
	    //Remove duplicate charcter from string using java 8
	    streamChar.distinct().forEach(System.out::println);
	}

}

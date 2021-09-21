package com.interview;

public class ConcatNumberWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10+20+"JavaTPoint");  //30JavaTPoint 
		System.out.println("JavaTPoint"+10+20);  //JavaTPoint1020
		
		String s = "Virendra";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);  // ardneriV
	}

}

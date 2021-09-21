package com.interview;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rahul";
		String s2 = new String("RAHUL");
		String s3 = "Rahul";
		String s4 = new String("Rahul");
		Integer i1 = 20;
		Integer i2 = 20;
		
		System.out.println(i1 == i2); // true
		
		System.out.println("--------------::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println(s1.equals(s3)); // True
		System.out.println(s1 == s3);      // True
		System.out.println(s1.equals(s2)); // False
		System.out.println(s1.equalsIgnoreCase(s2)); //True
		System.out.println(s1.equals(s4)); // True
		System.out.println(s2 == s4);  // False
		System.out.println(s2.equalsIgnoreCase(s4));  //True
		

//No.	String	                                                           StringBuffer
//1)	String class is immutable.	                               1.StringBuffer class is mutable.
//2)	String is slow and consumes more memory when you concat    2.StringBuffer is fast and consumes less memory when you cancat strings.
//too many strings because every time it creates new instance.	
//3)	String class overrides the equals() method of Object class. 3.StringBuffer class doesn't override the equals() method of Object class.
//So you can compare the contents of two strings by equals() method.	
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		
//		No.	StringBuffer	                                                             StringBuilder
//		1)	StringBuffer is synchronized i.e. thread safe. It means two threads   1.StringBuilder is non-synchronized i.e. not thread safe. It means two
//           can't call the methods of StringBuffer simultaneously.                    threads can call the methods of StringBuilder simultaneously.
//        	 
//		2)	StringBuffer is less efficient than StringBuilder.	                  2.StringBuilder is more efficient than StringBuffer.		
		StringBuffer sb = new StringBuffer("Rahul");
		StringBuffer sb1 = new StringBuffer("Rahul");
		StringBuilder stringBuilder = new StringBuilder("Rahul");
		StringBuilder stringBuiilder1 = new StringBuilder("Rahul");
		
		System.out.println(sb == sb1); // False
		System.out.println(sb.toString().equals(sb1.toString()));  //True
		System.out.println(stringBuilder == stringBuiilder1);   // False
		System.out.println(stringBuilder.equals(stringBuiilder1)); //False
		
	}	
}

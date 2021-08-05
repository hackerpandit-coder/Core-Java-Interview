package com.interview;

public class ThisKeywordExample {

	void m1() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ThisKeywordExample thisKeyord = new ThisKeywordExample();
    System.out.println(thisKeyord);
    thisKeyord.m1();
		
	}
	
//	Q. Usage of java this keyword
//	Here is given the 6 usage of java this keyword.
//
//	1. this can be used to refer current class instance variable.
//	2. this can be used to invoke current class method (implicitly)
//	3. this() can be used to invoke current class constructor.
//	4. this can be passed as an argument in the method call.
//	5. this can be passed as argument in the constructor call.
//	6. this can be used to return the current class instance from the method.

}

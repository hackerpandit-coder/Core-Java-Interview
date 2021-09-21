package com.interview;

public class CustomExceptionClass extends Exception {

	public CustomExceptionClass(String errMessage) {
		super(errMessage);
	}
}

class Test{

public static void main(String[] args) {
	
	throw new CustomExceptionClass("Custom Exception....");
}
}

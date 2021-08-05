package com.interview;


 class A{
	public void m1() {
		System.out.println("Parent class");
	}
}
 
 class B extends A{
	 @Override
	 public void m1() {
		 
        System.out.println("child class");		 
	 }
 }


 class MethodOverridding {
public static void main(String[] args) {
	A a = new B();
	a.m1();
}
	
}

package com.interview;


 class A{
	 A(){
		 System.out.println("Default Parent Construtor");
	 }
	public void m1() {
		System.out.println("Parent class");
	}
}
 
 class B extends A{
	 
	 B(){
		 System.out.println("Default child construtor");
	 }
	 
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

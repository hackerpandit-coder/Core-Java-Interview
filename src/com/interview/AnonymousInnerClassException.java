package com.interview;

//abstract class Person{
//	abstract void eat();
//}

public class AnonymousInnerClassException {

	public static void main(String[] args) {
		
//		Person p = new Person() {
//			
//			@Override
//			void eat() {
//				System.out.println("Nice fruits");
//				
//			}
//		};
//      p.eat();	
		
		StringBuffer s1 = new StringBuffer("Complete");
		s1.setCharAt(1, 'i');
		s1.setCharAt(7, 'd');
		System.out.println(s1);
}
}
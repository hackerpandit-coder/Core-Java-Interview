package com.interview;

class Vehicle{
	void run() {
		System.out.println("Vehicle method called.....");
	}
	
	 static void print() {
		System.out.println("Print Mthod called....");
	}
	 
	 void test() {
		 System.out.println("Test method called...");
	 }
}

class Bike extends Vehicle{
	void run() {
		System.out.println("Bike method called....");
	}
	
	static void print() {
		System.out.println("child method called..");
	}
}

public class MethodOverridingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle b = new Bike();
		b.run();
		b.print();
		b.test();
	}
	
//	Covariant Return Type
//	The covariant return type specifies that the return type may vary in the same direction as the subclass.
//
//	Before Java5, it was not possible to override any method by changing the return type. But now, since Java5, 
//	it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive
//	but it changes its return type to subclass type. Let's take a simple example:
	//Example of covarient type
//	class A{  
//		A get(){return this;}  
//		}  
//		  
//		class B1 extends A{  
//		B1 get(){return this;}  
//		void message(){System.out.println("welcome to covariant return type");}  
//		  
//		public static void main(String args[]){  
//		new B1().get().message();  
//		}  
//	} 
}

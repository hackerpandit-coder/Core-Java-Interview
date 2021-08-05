package com.interview;

import org.w3c.dom.Entity;

public class StaticKeyword {

	int studId;
	String studName;
	static String collegeName = "ITS"; //Its create memory on class area
	
	void print() {
		System.out.println("Print non static method called...");
	}
	
//	It Is used to initialize the static data member.
//	It is executed before the main method at the time of classloading.
	static {
		System.out.println("Static block called......");
	}
	
	//Static method....Its only access static variable and static method
	static void change() {
		collegeName = "BBIT";	
	}
	
	public StaticKeyword(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}

	public void printStudentDetails() {
		System.out.println(studId+":"+studName+":"+collegeName);
	}

//	1.Why is the Java main method static?
//	Ans. : It is because the object is not required to call a static method. If it were a non-static method, 
//	JVM creates an object first then call main() method that will lead the problem of extra memory allocation.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword.change();  //We call static method without object created
		StaticKeyword sk = new StaticKeyword(101, "Virendra");
		StaticKeyword sk1 = new StaticKeyword(102, "Rahul");
		sk.printStudentDetails();
		sk1.printStudentDetails();
		sk.print();  //For call non-satic method object required...
		
		

	}
	
//	Q) Can we execute a program without main() method?
//	Ans) No, one of the ways was the static block, but it was possible till JDK 1.6. Since JDK 1.7, 
//       it is not possible to execute a Java class without the main method.

}

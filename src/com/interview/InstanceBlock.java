package com.interview;


//Rules of Instance block
//1.It created after instance created.
//2.It invoked after parent class constructor invoked
//3.It invoked before child class constructor or current class construtor.
class Vir{
	Vir(){
		System.out.println("Parent Construtor called...");
	}
}


public class InstanceBlock extends Vir {

	InstanceBlock(){
		super();
		System.out.println("Child Construtor called..");
	}
	
	{
		System.out.println("Inisilizer block called...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      InstanceBlock b = new InstanceBlock();

}
}

package com.interview;

abstract class Bacchi{
	
	String s;
	
    Bacchi(String s) {
    	System.out.println("Abstact class construtor...."+s);
    	this.s=s;
		
	}
}


public class AbstractClassConstrutor extends Bacchi{
	
	 AbstractClassConstrutor() {
		
		super("Virendra");
		System.out.println("Default constructor......");
	}

	public static void main(String[] args) {

		AbstractClassConstrutor ac = new AbstractClassConstrutor();
	}

}

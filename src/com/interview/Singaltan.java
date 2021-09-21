package com.interview;

public class Singaltan {
	
	private Singaltan() {
		super();
	}
	
	private static Singaltan singaltan = null;
	
	public static Singaltan getInstance() {
		if(singaltan == null) {
			singaltan = new Singaltan();
		}
		return singaltan;
	}

	public static void main(String[] args) {
		// TODO Auto-generated met
		System.out.println("OBJ1 :" +getInstance());
		System.out.println("OBJ2 :" +getInstance());
		System.out.println("OBJ3 :" +getInstance());
		System.out.println("OBJ4 :" +getInstance());
	}

}

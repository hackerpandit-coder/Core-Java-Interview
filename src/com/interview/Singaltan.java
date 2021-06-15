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
		// TODO Auto-generated method stub

		Singaltan singletan = new Singaltan();
		System.out.println("OBJ1 :" +singletan.getInstance());
		System.out.println("OBJ2 :" +singletan.getInstance());
		System.out.println("OBJ3 :" +singletan.getInstance());
		System.out.println("OBJ4 :" +singletan.getInstance());
	}

}

package com.interview;

public class CountProgramUsingStatic {

	static int counter;
	
	CountProgramUsingStatic(){
		counter++;
		System.out.println("Counter :"+counter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountProgramUsingStatic c1 = new CountProgramUsingStatic();
		CountProgramUsingStatic c2 = new CountProgramUsingStatic();
		CountProgramUsingStatic c3 = new CountProgramUsingStatic();
		CountProgramUsingStatic c4 = new CountProgramUsingStatic();

	}

}


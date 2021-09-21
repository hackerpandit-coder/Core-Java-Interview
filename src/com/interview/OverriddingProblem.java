package com.interview;

class M1{
	
	private void print() {
		System.out.println("A");
	}
}

public class OverriddingProblem extends M1 {

	public void print() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when we create child class object it will work properly 
		OverriddingProblem ov = new OverriddingProblem();
		
		//when we create object of parent class object it gives error
		M1 ov = new M1();
		ov.print();
	

	}

}

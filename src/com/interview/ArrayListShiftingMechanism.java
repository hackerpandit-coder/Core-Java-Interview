package com.interview;

import java.util.ArrayList;

public class ArrayListShiftingMechanism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Final finall = new Final();
		finall.addd();

	}

}

class Final{
	
	final ArrayList<String> list = new ArrayList<>();
	
	public void addd(){
		
		list.add("Ramesh");
		list.add("Kamlesh");
		list.add("Pankaj");
		list.add("Sanjay");
		
		System.out.println("ArrayList----:"+list); //output list= [Ramesh,kamlesh,Pankaj,Sanjay]
		
		//After removing element shifting takes place
		String a = list.remove(0);
		System.out.println(a);  //output Ramesh
		System.out.println("Remaing list :"+list); //output [Kamlesh,Pankaj,Sanjay]
		String b = list.remove(1);
		System.out.println(b);   //output Pankaj
		System.out.println(list);   //output [Kamlesh,Sanjay]
	}
}

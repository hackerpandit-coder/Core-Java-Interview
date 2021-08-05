package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
//		list.add(new Player(100, "Virendra", "Kandivali"));
//		list.add(new Player(101, "Raju", "Borivali"));
//		list.add(new Player(102, "Saurabh", "Kandivali"));
//		list.add(new Player(103, "Kallu", "Kandivali"));
		list.add("Virendra");
		list.add("Kallu");
		list.add("Mallu");
		list.add("Dinesh");

	    List<String> list2 = list.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
	    System.out.println(list2);
	    for(String s : list2) {
	    	System.out.println(s);
	    }
	}

}

class Player{
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Player(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}

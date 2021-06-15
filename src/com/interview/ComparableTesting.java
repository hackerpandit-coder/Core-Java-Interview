package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<LaptopModel> list = new ArrayList<>();
		list.add(new LaptopModel("Dell",8,10000));
		list.add(new LaptopModel("HP",16,12000));
		list.add(new LaptopModel("Acer",4,8000));
		
		Collections.sort(list);
		
		for(LaptopModel o : list) {
			System.out.println(o);
		}

	}

}

class LaptopModel implements Comparable<LaptopModel>{

	private String name;
	private int ram;
	private int price;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getRam() {
		return ram;
	}



	public void setRam(int ram) {
		this.ram = ram;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public LaptopModel() {
		super();
		// TODO Auto-generated constructor stub
	}



	public LaptopModel(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}



	@Override
	public String toString() {
		return "LaptopModel [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}



	@Override
	public int compareTo(LaptopModel model) {
		
		boolean abc = this.getPrice() < model.getPrice();
		
		if(abc)
			return -1;
		else 
		    return 1;
	}
	
	
	
}

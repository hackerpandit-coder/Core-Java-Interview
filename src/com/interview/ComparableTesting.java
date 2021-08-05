package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparableTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<LaptopModel> list = new ArrayList<>();
		list.add(new LaptopModel("Dell",8,10000));
		list.add(new LaptopModel("HP",16,12000));
		list.add(new LaptopModel("Acer",4,8000));
		LaptopModel l1 = new LaptopModel("Lenovo",14,4000);
		LaptopModel l2 = new LaptopModel("Lenovo",14,4000);
		
		Map<LaptopModel, Integer> map = new HashMap<>();
		map.put(l1, 1);
		map.put(l1, 1);
		map.put(l2, 1);
		
		System.out.println(map);
		
		Collections.sort(list);
		
//		for(LaptopModel o : list) {
//			System.out.println(o);
//		}

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ram;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LaptopModel other = (LaptopModel) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (ram != other.ram)
			return false;
		return true;
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

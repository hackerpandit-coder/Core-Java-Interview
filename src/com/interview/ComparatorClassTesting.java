package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClassTesting {
	
	public static void main(String[] args) {
		
		List<LaptopEntity> list = new ArrayList<>();
		list.add(new LaptopEntity(001, "HP", 4, 31000));
		list.add(new LaptopEntity(002, "Dell", 3, 21000));
		list.add(new LaptopEntity(003, "Lenovo", 6, 48000));
		
		
		
		Comparator<LaptopEntity> comparator = new Comparator<LaptopEntity>() {

			@Override
			public int compare(LaptopEntity o1, LaptopEntity o2) {
				// TODO Auto-generated method stub
				if(o1.getRam() < o2.getRam())
					return - 1;
				else
					return 1;
			}
		};
		
		Collections.sort(list, comparator);
		
		System.out.println("Assending List : "+list);
		
		for(LaptopEntity laptopEntity : list) {
			System.out.println("Id :"+laptopEntity.getId()+"Name :"+laptopEntity.getName()+" Ram :"+laptopEntity.getRam()+" Price :"+laptopEntity.getPrice());
		}
	}

}

class LaptopEntity{
	
	private int id;
	private String name;
	private int ram;
	private int price;
	
	public LaptopEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public LaptopEntity(int id, String name, int ram, int price) {
		super();
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	@Override
	public String toString() {
		return "LaptopModel [id=" + id + ", name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
	
	
}

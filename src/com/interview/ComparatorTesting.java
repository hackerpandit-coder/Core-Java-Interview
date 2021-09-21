package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<LaptopModelClasss> list = new ArrayList<>();
		list.add(new LaptopModelClasss("Dell", 8, 10000));
		list.add(new LaptopModelClasss("HP", 16, 12000));
		list.add(new LaptopModelClasss("Acer", 4, 8000));

		Comparator<LaptopModelClasss> compartor = new Comparator<LaptopModelClasss>() {

			@Override
			public int compare(LaptopModelClasss o1, LaptopModelClasss o2) {

				if (o1.getRam() > o2.getRam())
					return -1;
				else
					return 1;
			}
		};
		
		Collections.sort(list, compartor);
		for(LaptopModelClasss o : list) {
			System.out.println(o);
		}
	}
}

class LaptopModelClasss {

	private String name;
	private int ram;
	private int price;

	public LaptopModelClasss() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LaptopModelClasss(String name, int ram, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
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

	@Override
	public String toString() {
		return "LaptopModelClasss [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}

}

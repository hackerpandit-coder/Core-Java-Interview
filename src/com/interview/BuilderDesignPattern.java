package com.interview;

class Phone{
	private String os;
	private int ram;
	private String processor;
	private int storage;
	public Phone(String os, int ram, String processor, int storage) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
		this.storage = storage;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor + ", storage=" + storage + "]";
	}
		
}

class PhoneBuilder{
	
	private String os;
	private int ram;
	private String processor;
	private int storage;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBuilder setStorage(int storage) {
		this.storage = storage;
		return this;
	}
	
	public Phone getPhone() {
		return new Phone(os, ram, processor, storage);
	}
	
}

public class BuilderDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p = new PhoneBuilder().setOs("Android").setRam(2).getPhone();
		
		System.out.println(p);
	}

}

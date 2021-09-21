package com.interview;

import java.util.HashSet;

public class Student {

	int rollNo;
	String name;
	
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollNo;
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
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		HashSet<Student> setStudent = new HashSet<>();
		setStudent.add(new Student(001, "Amit"));
		setStudent.add(new Student(001, "Amit"));
		setStudent.add(new Student(001, "Amit"));
		
		System.out.println(setStudent.size());
	}

}



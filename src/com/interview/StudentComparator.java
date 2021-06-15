package com.interview;

import java.util.Comparator;

public class StudentComparator {
	
	private int rollNo;
	private String name;
	private String grade;
	public StudentComparator(int rollNo, String name, String grade) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public static Comparator<StudentComparator> stuNameComparator = new Comparator<StudentComparator>() {

		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			// TODO Auto-generated method stub
			String stuName1 = o1.getName().toUpperCase();
			String stuName2 = o2.getName().toUpperCase();
			return stuName1.compareToIgnoreCase(stuName2);
			
			
		}
	};
	
	public static Comparator<StudentComparator> stuRollNoComparator = new Comparator<StudentComparator>() {

		@Override
		public int compare(StudentComparator o1, StudentComparator o2) {
			// TODO Auto-generated method stub
			int stuRollNo1 = o1.getRollNo();
			int stuRollNo2 = o2.getRollNo();
			
			return stuRollNo1-stuRollNo2;
		}
	};
	@Override
	public String toString() {
		return "StudentComparator [rollNo=" + rollNo + ", name=" + name + ", grade=" + grade + "]";
	}
	
}

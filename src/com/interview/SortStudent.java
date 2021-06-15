package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStudent {
	
public static void main(String[] args) {
	
	List<StudentComparator> list = new ArrayList<>();
	list.add(new StudentComparator(123, "Ankiut", "first"));
	list.add(new StudentComparator(101, "Kallu", "Third"));
	list.add(new StudentComparator(321, "Raju", "Second"));
	
	//For Print Student Based on name
	Collections.sort(list, StudentComparator.stuNameComparator);
	
	for(StudentComparator stuName : list) {
		System.out.println("Student NAME :"+stuName.getRollNo()+":"+stuName.getName()+":"+stuName.getGrade());
	}
	
	//For Print Student Based on roll no
	Collections.sort(list, StudentComparator.stuRollNoComparator);
	for(StudentComparator stuRoll : list) {
		System.out.println("Student Roll : "+stuRoll.getRollNo()+":"+stuRoll.getName()+":"+stuRoll.getGrade());
	}
}

}

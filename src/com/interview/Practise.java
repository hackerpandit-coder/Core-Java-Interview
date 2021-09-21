package com.interview;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Employee{
	
	int empId;
	String empName;
	String age;
	public Employee(int empId, String empName, String age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
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
		Employee other = (Employee) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}
	
	
}

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee, String> map = new HashMap<>();
		map.put(new Employee(1, "Ramesh", "26"), "one");
		map.put(new Employee(2, "Ankit", "18"), "two");
		map.put(new Employee(3, "Kallu", "24"), "three");
		map.put(new Employee(4, "Ashish", "35"), "one");
		map.put(new Employee(5, "Anand", "28"), "four");
		map.put(new Employee(6, "Alok", "36"), "five");
		map.put(new Employee(7, "Anand","28"), "six");
		
		//Start with A : [Employee [empId=2, empName=Ankit, age=18], Employee [empId=6, empName=Alok, age=36], Employee [empId=5, empName=Anand, age=28]]
		List<Employee> emp = map.keySet().stream().filter(value -> value.empName.startsWith("A")).limit(3).collect(Collectors.toList());
		
		List<Employee> emp1 = map.keySet().stream().filter(val -> val.empName.contains("A")).collect(Collectors.toList());
		System.out.println(emp1);
		for(Employee list : emp) {
			System.out.println("Emploee name start with A :"+list.empName);
		}
		
		//Collect List of EmployeeName
	    List<String> empListName = map.keySet().stream().map(val -> val.empName).collect(Collectors.toList());
	    System.out.println("EmpList :"+empListName);
	    
	    //Print EmployeeName List using forEach
		map.keySet().stream().map(val -> val.empName).forEach(System.out::println);
		
		//Convert int array using java 8 feature IntStream.of(arr).boxed().Collect(Collectors.toList());
		int arr[] = {12,59,56,35,45,75,35,97};
		List<Integer> arrList = IntStream.of(arr).sorted().distinct().boxed().collect(Collectors.toList());
		System.out.println("arrList :"+arrList);
		
	}
}

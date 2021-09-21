package com.interview;

//Q. Aggregation in Java
//If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
//
//Consider a situation, Employee object contains many informations such as id, name, emailId etc. 
//It contains one more object named address, which contains its own informations such as city, state, country, zipcode etc.
//as given below.

//          OR        //
// We use inheritance also for code reuseability but it maintain IS-A relationship.

class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
}

public class AggregationExample {
	
		int id;  
		String name;  
		Address address;  
		  
		public AggregationExample(int id, String name,Address address) {  
		    this.id = id;  
		    this.name = name;  
		    this.address=address;  
		}  
		  
		void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
		  
		AggregationExample e=new AggregationExample(111,"varun",address1);  
		AggregationExample e2=new AggregationExample(112,"arun",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
}

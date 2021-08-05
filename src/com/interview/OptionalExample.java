package com.interview;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getName(){
		String name = "This is optional example";
		return Optional.ofNullable(name);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Optional<String> optional = getName();
           System.out.println(optional.get());
           
           //Multiple method
//           optional.get();
//           optional.isPresent();
//           optional.ifPresent(consumer);
//           optional.orElse(other);
//           optional.filter(predicate);
           
           
	}

}

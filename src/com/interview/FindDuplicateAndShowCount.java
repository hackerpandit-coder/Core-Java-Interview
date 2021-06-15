package com.interview;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicateAndShowCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arrList[] = {"Viru","Rahul","Ajinkya","Pandya","Rahul","Viru","Kamlesh","Viru"};
		
		//Create hashmap
		HashMap<String, Integer> dupliMap = new HashMap<>();
		
		for(String name : arrList) {
			System.out.println("----arr : "+name);
			Integer count = dupliMap.get(name);
			System.out.println("----Count : "+count);
			if(count == null)
				dupliMap.put(name, 1);
			else {
				count++;
			    dupliMap.put(name, count);
			}
		}
        System.out.println("-----MapDupli : "+dupliMap);
        
        //Create Set
        HashSet<String> hashSet = new HashSet<>();
        
        for(String name : arrList) {
        	
        	if(hashSet.add(name)==false)
        		System.out.println("-----HashSet Duplicate : "+name);
        	
        }
	}

}

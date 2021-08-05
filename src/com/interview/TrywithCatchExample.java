package com.interview;

public class TrywithCatchExample {
	
	public static void main(String[] args) {  
        try  
        { 
        	String s = null;
        	s.length();
        //int data=50/0; //may throw exception   
        }  
            //handling the exception 
        catch(Exception parentException){
        	System.out.println("Parent Exception");
        }
        catch(ArithmeticException childException)   
        {  
            System.out.println("Child Exception");  
        }
        catch(NullPointerException e) {
        System.out.println("Null pointer exception");	
        }
            
        System.out.println("rest of the code");  
    }

}

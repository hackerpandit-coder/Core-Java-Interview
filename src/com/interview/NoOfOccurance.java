package com.interview;

public class NoOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaabcbcddaaa";
		int count = 0;
		//By Java 1.8
		long codePoint = str.codePoints().filter(ch -> ch == 'a').count();
		System.out.println("count :"+codePoint);
		
		//By Normal Java Code Using For loop
		for(int i =0; i<str.length(); i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
        System.out.println("count of a :"+count);
	}

}

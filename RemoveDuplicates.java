package com.RecursionNew;

public class RemoveDuplicates {
	
	public static String removeDuplicates(String s) {
		if(s.length() <=1) {
			return s;
		}
		
		String smallOutput = removeDuplicates(s.substring(1));
		
		if(s.length() >=2 && s.charAt(0) == s.charAt(1)) {
			return smallOutput;
		}
		
		return s.charAt(0) + smallOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = removeDuplicates("xxxyyyzwwzzz");
		System.out.println(ans);

	}

}

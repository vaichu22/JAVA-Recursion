package com.RecursionNew;

public class Palindrome {
	
	public static boolean palindrome(String s) {
		if(s.length() <= 1) {
			return true;
		}
		
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			return palindrome(s.substring(1, s.length()-1));
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mom";
		boolean ans = palindrome(s);
		System.out.println(ans);
	}

}

package com.RecursionNew;

public class ReplacePi {
	
	public static String replacePi(String s) {
		if(s.length() <=1) {
			return s;
		}
		
		if(s.charAt(0) == 'p' && s.charAt(1) == 'i') {
			String smallOutput = replacePi(s.substring(2));
			return "3.14" + smallOutput;
		} else {
			String smallOutput = replacePi(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = replacePi("apipi");
		System.out.println(ans);

	}

}

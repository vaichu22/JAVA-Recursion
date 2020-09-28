package com.RecursionNew;

public class StringToInteger {
	
	public static int stringToInt(String s) {
		if(s.length() <= 1) {
			return Integer.parseInt(s);
		}
		
		int small = stringToInt(s.substring(1));
		double output = (Integer.parseInt(s.substring(0,1))* Math.pow(10, s.length()-1)) + small;
		return (int) output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-gnerated method stub
		
		String s = "12597";
		int ss = stringToInt(s);
		System.out.println(ss);

	}

}

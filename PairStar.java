package com.RecursionNew;

public class PairStar {
	
	public static String pairStar(String s) {
		if(s.length() <=1) {
			return s;
		}
		
		String smallValue = pairStar(s.substring(1));
		if(s.charAt(0) == smallValue.charAt(0)) {
			//System.out.println("equals: "+ s.charAt(0) +"*" + smallValue);
			return s.charAt(0) +"*" + smallValue;
		}
		
		//return new StringBuilder().append(s.charAt(0)).append(smallValue).toString();
		
		return s.charAt(0)+smallValue;
	}
	
	public static void main(String args[]) {
		
		String s = "hyhyyy";
		String ss = pairStar(s);
		
		System.out.println(ss);
		
//		String s1= "b";
//		System.out.println(s1.charAt(0));
	}

}

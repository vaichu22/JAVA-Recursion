package com.RecursionNew;

public class Factorial {
	
	public static int fact(int n) {
		if(n ==1) {
			return 1;
		}
		
		int smallOutput = fact(n-1);
		int output = n * smallOutput;
		return output;
	}
	
	public static void main(String args[]) {
		
		int ans = fact(6);
		System.out.println(ans);
	}

}

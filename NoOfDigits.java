package com.RecursionNew;

public class NoOfDigits {
	
	public static int totalDigits(int n) {
		if(n ==0) {
			return 0;
		}
		int smallOutput = totalDigits(n/10);
		int output = 1+smallOutput;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans= totalDigits(7);
		System.out.println(ans);
	}

}

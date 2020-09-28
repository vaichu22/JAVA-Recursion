package com.RecursionNew;

public class SumOfDigits {
	
	public static int sumOfDigits(int n) {
		if(n == 0) {
			return n;
		}
		
		int smallOut = sumOfDigits(n/10);
		int output = smallOut + (n%10);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8965;
		int ans = sumOfDigits(n);
		System.out.println(ans);
	}

}

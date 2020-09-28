package com.RecursionNew;

public class Multiplication {
	
	public static int multiplication(int m, int n) {
		if(m == 0 || n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return m;
		}
		
		int smallOutput = multiplication(m, n-1);
		int output = m + smallOutput;
		return output;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = multiplication(9, 5);
		System.out.println(ans);
		System.out.println(1%10);

	}

}

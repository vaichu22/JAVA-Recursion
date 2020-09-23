package com.RecursionNew;

public class Power {
	
	public static int pow(int x, int n) {
		if(n==1) {
			return x;
		}
		int smalloutput = pow(x, n-1);
		int output = x*smalloutput;
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = pow(2,5);
		System.out.println(ans);

	}

}

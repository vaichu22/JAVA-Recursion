package com.Recursion;

public class CheckPower {
	
	public static int power(int x,int n) {
		
		if(n!=1) {
			int ans=power(x, n-1);
			return x*ans;
		}
		else{
			return x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pow=power(-4, 2);
		System.out.println(pow);
	}

}

package com.Recursion;

public class NoOfDigits {
	
	public static int totalDigits(int n) {
		
		if(n/10 ==0) {
			return 1;
		}
		else{
			return 1 + totalDigits(n/10);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans=totalDigits(1498769786);
		System.out.println("ans "+ans);

	}

}

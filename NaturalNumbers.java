package com.Recursion;

public class NaturalNumbers {
	
	public static void naturalNum(int n) {
		
		if(n==1) {
			System.out.print(n+" ");
			return;
		}
		//System.out.print(n+" ");
		naturalNum(n-1);
		System.out.print(n+" ");
		return;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		naturalNum(3);
	}

}

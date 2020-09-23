package com.RecursionNew;

public class NaturalNumbers {
	
	public static void firstNNaturalnumbers(int n) {
		if(n==0) {
			return;
		}
//		if(n==1) {
//			System.out.println(n);
//			return;
//		}
		//System.out.println(n);
		firstNNaturalnumbers(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstNNaturalnumbers(5);
	}

}

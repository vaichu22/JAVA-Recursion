package com.RecursionNew;

public class SumOfArray {
	
	public static int sum(int[] a) {
		if(a.length==1) {
			return a[0];
		}
		
		int[] smallerOutput = new int[a.length-1];
		for(int i=1;i<a.length;i++) {
			smallerOutput[i-1] = a[i];
		}
		
		int output= a[0] + sum(smallerOutput);
		return output;
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {4,2,1};
		int ans = sum(a);
		System.out.println(ans);

	}

}

package com.RecursionNew;

public class CheckNumberInArray {
	
	public static boolean checkNumber(int a[], int n) {
		if(a.length==1 && a[0] != n) {
			return false;
		}
			
		if(a[0] == n) {
			return true;
		}
		
		int[] smallerOutput = new int[a.length-1];
		for(int i=1;i<a.length;i++) {
			smallerOutput[i-1] = a[i];
		}
		
		boolean ans = checkNumber(smallerOutput, n);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {9,8,10};
		int n=8;
		boolean ans= checkNumber(a, n);
		System.out.println(ans);

	}

}

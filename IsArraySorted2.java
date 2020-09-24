package com.RecursionNew;

public class IsArraySorted2 {
	
	public static boolean isSortedBetter(int[] a, int si) 
	{
		if(si == a.length-1) {
			return true;
		}
		
		if(a[si] > a[si+1]) {
			return false;
		}
		
		boolean output = isSortedBetter(a, si+1);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {1,3,6};
		boolean ans = isSortedBetter(a, 0);
		System.out.println(ans);

	}

}

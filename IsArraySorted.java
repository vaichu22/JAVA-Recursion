package com.RecursionNew;

public class IsArraySorted {
	
	public static boolean isSorted(int[] a) {
		if(a.length==1) {
			return true;
		}
		
		if(a[0] > a[1]) {
			return false;
		}
		
		int[] smallerArray = new int[a.length-1];
		for(int i=1; i<a.length;i++) {
			smallerArray[i-1] = a[i];
		}
		
		boolean output = isSorted(smallerArray);
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= new int[] {1,2,3,5,6};
		boolean ans = isSorted(a);
		System.out.println(ans);
	}

}

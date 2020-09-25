package com.RecursionNew;

public class BinarySearch {
	
	public static int binarySearch(int[] a, int si, int ei, int x) {
		if(si > ei) {
			return -1;
		}
		
		int midIndex = (si + ei)/2;
		
		if(a[midIndex] == x) {
			return midIndex;
		} else if(a[midIndex] < x) {
			return binarySearch(a, midIndex+1, ei, x);
		} else {
			return binarySearch(a, si, midIndex-1, x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,5,7,9};
		int ans = binarySearch(a, 0, a.length-1, 17);
		System.out.println(ans);

	}

}

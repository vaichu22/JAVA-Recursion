package com.Recursion;

public class ReverseOfAnArray {
	
	public static void elements(int[] arr, int si) {
		
		if(arr.length == 0 || si >= arr.length) {
			return;
		}
		
		if(arr.length == 1) {
			System.out.println(arr[0]);
			return;
		}
		
		if(si<arr.length) {

			elements(arr, si+1);
			
			
		}
		 
		System.out.println(arr[si]);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,6,3,8};
		elements(a, 0);

	}

}

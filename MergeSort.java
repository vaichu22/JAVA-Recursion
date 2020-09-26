package com.RecursionNew;

public class MergeSort {
	
	public static void merge(int[] left, int[] right, int[] a) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				a[k] = left[i];
				i++;
				k++;
			} else {
				a[k] = right[j];
				j++;
				k++;
			}
		}
		
		if(i < left.length) {
			while(i< left.length) {
				a[k] = left[i];
				i++;
				k++;
			}
		}
		
		if(j< right.length) {
			while(j < right.length) {
				a[k] = right[j];
				j++;
				k++;
			}
		}
	}
	
	public static void mergeSort(int[] a) {
		if(a.length <= 1) {
			return;
		}
		
		int left[] = new int[a.length/2];
		int right[] = new int[a.length - left.length];
		
		for(int i=0; i<a.length/2; i++) {
			left[i] = a[i];
		}
		
		for(int i= a.length/2; i<a.length; i++) {
			right[i-a.length/2] = a[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8,5,9,2,3,1};
		mergeSort(a);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

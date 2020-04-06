package com.Recursion;

public class MergeSort {
	
	public static void merge(int[] s1, int[] s2, int[] orig) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<s1.length && j<s2.length) {
			if(s1[i]<s2[j]) {
				orig[k]=s1[i];
				k++;
				i++;
			}
			else {
				orig[k]=s2[j];
				k++;
				j++;
			}
		}
		
		if(i<s1.length) {
			while(i<s1.length) {
				orig[k]=s1[i];
				k++;
				i++;
			}
		}
		
		if(j<s2.length) {
			while(j<s2.length) {
				orig[k]=s2[j];
				k++;
				j++;
			}
		}
	}
	
	public static void mergeSortFunc(int[] arr) {
		if(arr.length <=1) {
			return;
		}
		
		int b[]=new int[arr.length/2];
		int c[]=new int[arr.length-b.length];
		
		for(int i=0;i<arr.length/2;i++) {
			b[i]=arr[i];
		}
		
		for(int j=arr.length/2;j<arr.length;j++) {
			c[j-arr.length/2]=arr[j];
		}
		
		mergeSortFunc(b);
		mergeSortFunc(c);
		merge(b,c,arr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {12,5,1,44,23,11,3,9};
		mergeSortFunc(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

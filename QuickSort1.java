package com.RecursionNew;

public class QuickSort1 {
	
	public static int partition(int[] a, int si, int ei) {
		int pivotElement = a[si];
		int count=0;
		
		for(int i=si+1; i<=ei; i++) {
			if(a[i] < pivotElement) {
				count++;
			}
		}
		
		int temp = a[si + count];
		a[si + count] = pivotElement;
		a[si] = temp;
		
		int i=si;
		int j=ei;
		pivotElement = a[si + count];
		System.out.println("pivot"+(si+count));
		
		while(i< j) {
			if(a[i] < pivotElement) {
				i++;
			}
			else if(a[j] >= pivotElement) {
				j--;
			} else {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		return si + count;
	}
	
	public static void quickSort(int[] a, int si, int ei) {
		if(si >=ei) {
			return;
		}
		
		int pivot = partition(a, si, ei);
		quickSort(a, si, pivot-1);
		quickSort(a, pivot+1, ei);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,7,8,2,1,9,4,20,11,35,19};
		quickSort(a, 0, a.length-1);
		
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}

package com.RecursionNew;

public class FirstIndexOfANumInArray {
	
	public static int findIndex(int[] a, int n) {
		if(a.length == 1 && a[0] != n) {
			return -1;
		}
		
		if(a[0] == n) {
			return 0;
		}
		
		int[] smallerOutput = new int[a.length-1];
		for(int i=1; i<a.length;i++) {
			smallerOutput[i-1] = a[i];
		}
		
		int output = findIndex(smallerOutput, n);
		if(output!=-1) {
			output+=1;
		}
		return output;
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {6,5,5,8};
		int ans = findIndex(a, 8);
		System.out.println(ans);

	}

}

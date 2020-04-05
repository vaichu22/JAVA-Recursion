package com.Recursion;

import java.util.ArrayList;

public class SplitArray {
	
	public static boolean splitArray(int input[]) {
		boolean bool=false;
		int arr1[]=new int[input.length];
		int arr2[]=new int[input.length];
		int sum1=0;
		int sum2=0;
		for(int i=0;i<input.length;i++) {
			if(input[i] % 3 == 0) {
				arr1[i]=input[i];
				sum1+=arr1[i];
			}
			else if(input[i] % 5 == 0 && input[i] % 3 != 0) {
				arr2[i]=input[i];
				sum2+=arr2[i];
			}
			else if((input[i] % 5 != 0 && input[i] % 3 != 0)) {
				if(sum1 == sum2) {
					//System.out.println("inn");
					arr2[i]=input[i];
					sum2+=arr2[i];
				}
				else if(sum1<sum2) {
					arr1[i]=input[i];
					sum1+=arr1[i];
				}
				else if(sum2<sum1) {
					arr2[i]=input[i];
					sum2+=arr2[i];
				}
			}
		}
		if(sum1 ==sum2) {
			bool=true;
		}
		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bud[]={1,4,3};
		boolean bool=splitArray(bud);
		System.out.println(bool);
	}

}

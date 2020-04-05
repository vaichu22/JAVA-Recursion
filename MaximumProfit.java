package com.Recursion;

import java.util.Arrays;

public class MaximumProfit {
	
	public static int maximumProfit(int budget[]) {
		// Write your code here
		int count=0;
		int max=0;
		Arrays.sort(budget);
		for(int i=0;i<budget.length;i++) {
			int mybudget=budget[i];
			for(int j=0;j<budget.length;j++) {
				if(budget[j]>=mybudget) {
					count+=1;
				}
			}
			int ans=count*mybudget;
			count=0;
			if(ans>max) {
				max=ans;
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bud[]={34, 78, 90, 15, 67};
		int res=maximumProfit(bud);
		System.out.println(res);
	}

}

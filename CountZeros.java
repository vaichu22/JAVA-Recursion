package com.RecursionNew;

public class CountZeros {
	
	public static int countZeros(int n) {
		//int count = 0;
		if(n == 0) {
//			if(n == 0) {
//				count++;
//			}
//			return count;
			return 0;
		}
		
		int smallOutput = countZeros(n/10);
		if(n%10 == 0) {
			return 1+ smallOutput;
		}
		return smallOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ans = countZeros(30000540);
		System.out.println(ans);
		
		String s1="23";
//		int a1 = Integer.parseInt(s1);
//		System.out.println(a1);
//		int a = Integer.valueOf(a1 + 2);
//		System.out.println(a);
		
//		int aa = Integer.valueOf(s1.charAt(0) + s1.charAt(1));
//		System.out.println(aa);
		
		System.out.println(Integer.valueOf(s1.charAt(0)));
	}

}

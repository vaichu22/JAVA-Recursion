package com.Recursion;

public class SContainsT {
	public static boolean bool=false;
	
	public static boolean checkSequence(String a, String b) {
		
		if(a.length()==0 && b.length() !=0) {
			bool=false;
			return bool;
		}
		if(a.length() == 0) {
			return false;
		}
		if(b.length() == 0) {
			return false;
		}
		
		
		if(a.charAt(0) == b.charAt(0) && b.length()==1) {
			//System.out.println("yes");
			bool=true;
			return bool;
		}
		else if(a.charAt(0) == b.charAt(0) && b.length() >1) {
			//System.out.println("inn");
			bool=true;
			checkSequence(a.substring(1), b.substring(1));
		}
		else {
			//System.out.println("inside else");
			checkSequence(a.substring(1), b);
		}
		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans=checkSequence("abchjsgsuohhdhyrikkknddg", "coding");
		System.out.println(ans);

	}

}

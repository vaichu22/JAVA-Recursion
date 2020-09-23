package com.RecursionNew;

public class FindOutput {

	public static void print(int n){
	    if(n < 0){
	        return;
	    }
	    if(n == 0){
	        System.out.println(n);
	        return;
	    }
	    print(n--);    //it is a post decrement operator. Here only 'n' is called and not 'n-1' during recursion calls
	    System.out.print(n+" ");
	}

	public static void main(String[] args) {
	    int num = 3;
	    print(num);
	}

}

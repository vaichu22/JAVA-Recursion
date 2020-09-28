package com.RecursionNew;

public class TowerOfHanoi {
	
	public static void moveDisks(int totDisks, char src, char aux, char dest) {
		if(totDisks == 1) {
			System.out.println("Move disk from "+src+"to "+dest);
			return;
		}
		
		moveDisks(totDisks-1, src, dest, aux);
		System.out.println("Move disk from "+src+"to "+dest);
		moveDisks(totDisks-1, aux, src, dest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveDisks(2, 'A', 'B', 'C');
	}

}

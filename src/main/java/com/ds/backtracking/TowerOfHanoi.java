package com.ds.backtracking;

import java.util.Scanner;

public class TowerOfHanoi {
	
	public void solve(int n, String fromRod,String toRod,String auxRod) {
		if(n==1) {
			System.out.println("Move disk 1 from tower "+fromRod+" to "+toRod);
			return;
		}
		solve(n-1,fromRod,auxRod,toRod);
		System.out.println("Move disk from tower "+fromRod+" to "+toRod);
		solve(n-1, auxRod, toRod, fromRod);
	}

	public static void main(String[] args) {
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Number of Discs");
			int numberOfDiscs = scanner.nextInt();
			System.out.println("Enter From Tower Name");
			String fromRod = scanner.next();;
			System.out.println("Enter To Tower Name");
			String toRod = scanner.next();
			System.out.println("Enter Auxilary Tower Name");
			String auxRod = scanner.next();
			scanner.close();
			new TowerOfHanoi().solve(numberOfDiscs, fromRod, toRod, auxRod);
		}
		catch(Exception ex) {
			System.out.println("Error:"+ex);
		}finally {
			
		}
	}

}

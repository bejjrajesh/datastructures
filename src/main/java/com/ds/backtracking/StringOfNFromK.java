package com.ds.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class StringOfNFromK {

	private static int[] value;
	private static void k_string(int n,int k) {
		if(n<1) {
			System.out.println(Arrays.toString(value));
		}else {
			for(int j=0;j<k;j++) {
				value[n-1]=j;
				k_string(n-1,k);
			}
		}
	}
	public static void main(String args[]) {
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Number of Bits");
			int noOfBits = scanner.nextInt();
			scanner.close();
			value = new int[noOfBits];
			k_string(noOfBits,10);
		}
		catch(Exception ex) {
			System.out.println("Error:"+ex);
		}finally {
			
		}
	}

}

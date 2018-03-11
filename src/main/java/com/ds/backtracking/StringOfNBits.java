package com.ds.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class StringOfNBits {
	private static int[] value;
	private static void Binary(int n) {
		if(n<1) {
			System.out.println(Arrays.toString(value));
		}else {
			value[n-1]=0;
			Binary(n-1);
			value[n-1]=1;
			Binary(n-1);
		}
	}
	public static void main(String args[]) {
		try{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Number of Bits");
			int noOfBits = scanner.nextInt();
			scanner.close();
			value = new int[noOfBits];
			Binary(noOfBits);
		}
		catch(Exception ex) {
			System.out.println("Error:"+ex);
		}finally {
			
		}
	}
}

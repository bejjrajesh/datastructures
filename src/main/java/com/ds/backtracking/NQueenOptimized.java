package com.ds.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class NQueenOptimized {
	
	private static int queenPosition[];
	private static int chessBoard[][];
	
	public NQueenOptimized() {
		for(int i=0;i<queenPosition.length;i++) {
			for(int j=0;j<queenPosition.length;j++){
				chessBoard[i][j]=0;
			}
		}
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Chess Board Size");
		int chessBoardSize = scanner.nextInt();
		chessBoard = new int[chessBoardSize][chessBoardSize];
		queenPosition = new int[chessBoardSize];
		scanner.close();
		NQueenOptimized nQueenOptimized = new NQueenOptimized();
		nQueenOptimized.placeQueens(0);
	}
	private boolean placeQueens(int queen) {
		for(int col=0;col<chessBoard.length;col++) {
			if(canPlace(queen,col)) {
				queenPosition[queen]=col;
				if(queen==queenPosition.length-1) {
					System.out.println("Order of " + queenPosition.length + " queens"
							+ Arrays.toString(queenPosition));
				}
				placeQueens(queen+1);
			}
		}
		return false;
	}
	private boolean canPlace(int row, int col) {
		for(int i=0;i<row;i++) {
			if(i==row||queenPosition[i]==col||(Math.abs(i-row)==Math.abs(queenPosition[i]-col))) {
				return false;
			}
		}
		return true;
	}
}

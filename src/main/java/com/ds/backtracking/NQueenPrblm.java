package com.ds.backtracking;

import java.util.Scanner;

public class NQueenPrblm {
	private static int chessBoard[][];
	
	public NQueenPrblm() {
		for(int row=0;row<chessBoard.length;row++) {
			for(int col=0;col<chessBoard.length;col++) {
				chessBoard[row][col]=0;
			}
		}
	}
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ChessBoard Size");
		int chessBoardSize = scanner.nextInt();
		chessBoard = new int[chessBoardSize][chessBoardSize];
		NQueenPrblm nQueenPrblmAltSolution = new NQueenPrblm();
		boolean isSuccess = nQueenPrblmAltSolution.placeQueens(0,chessBoardSize);
		if(isSuccess) {
			for(int row=0;row<chessBoard.length;row++) {
				for(int col=0;col<chessBoard.length;col++) {
					System.out.print(chessBoard[row][col]);
				}
				System.out.println();
			}
		}else {
			System.out.println("Solution does not exist");
		}
		scanner.close();
	}
	private boolean placeQueens(int queen, int size) {
		if(queen==size) {
			return true;
		}
		for(int row=0;row<chessBoard.length;row++) {
			if(canPlaceQueen(row,queen)){
				chessBoard[row][queen] = 1;
				if(placeQueens(queen+1,size)){
					return true;	
				}
			}
			chessBoard[row][queen]=0;
		}
		return false;
	}
	private boolean canPlaceQueen(int row, int col) {
		for(int i=0;i<col;i++) {
			if(chessBoard[row][i]==1) {
				return false;
			}
		}
		for(int i=row,j=col;i>=0&&j>=0;i--,j--) {
			if(chessBoard[i][j]==1) {
				return false;
			}
		}
		for(int i=row,j=col;i<chessBoard.length&&j>=0;i++,j--) {
			if(chessBoard[i][j]==1) {
				return false;
			}
		}
	  return true;
	}
}

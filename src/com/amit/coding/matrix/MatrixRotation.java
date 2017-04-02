package com.amit.coding.matrix;

import java.util.Scanner;

public class MatrixRotation {

	int [] [] mat;
	int row, col;
	public MatrixRotation(int row, int col){
		mat = new int[row][col];
		this.row = row;
		this.col = col;
	}
	public void getMatrix(){
		Scanner in = new Scanner(System.in);
		for(int i =0; i< row; i++){
			for(int j = 0; j < col; j++){
				mat[i][j] = in.nextInt();
			}
		}
	}
	public void operationRotateClockwise(){
		int temp = 0;
		int lastExtra = 0;

		for(int i =0; i< row; i++){
			//forword
			for(int j = i; j < col - i - 1; j++){
				temp = mat[i][j];
				mat[i][j + 1] = temp;
			}
			//lastextra = temp;
			for(int j = i; j < row - i - 1; j++){
				mat[j + 1][row - i -  1] = temp;
				temp = mat[j][row - i -  1];
				//mat[j + 1][row - i -  1] = mat[j][row - i -  1];	
			}
			
		}
	}
}

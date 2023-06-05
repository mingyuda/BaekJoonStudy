package practice;

import java.util.Arrays;
import java.util.Scanner;

public class step07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int findMax[][] = new int[9][9];
		int matrixRow[] = new int[1];
		int matrixCol[] = new int[1];
		int Max = 0;
		
		for(int i = 0; i < 9; i++) {
			for(int j = 0; j < 9; j++) {
				int input = scan.nextInt();
				findMax[i][j] = input;
				if(input > Max) {
					Max = input;
					matrixRow[0] = i;
					matrixCol[0] = j;
				}
			}
		}
		
		
		System.out.println(Max);
		System.out.print(matrixRow[0] + 1 + " ");
		System.out.print(matrixCol[0] + 1);
		
		
		

		
		
		
		
		
		
		
//		
//		int row = scan.nextInt();
//		int column = scan.nextInt();
//		int firstMatrix[][] = new int[row][column];
//		int secondMatrix[][] = new int[row][column];
//		int sumMatrix[][] = new int[row][column];
//		
//		
//		for(int i = 0; i < row; i++) {
//			for(int j = 0; j < column; j++) {
//				int input = scan.nextInt();
//				firstMatrix[i][j] = input;	
//			}
//		}
//		for(int i = 0; i < row; i++) {
//			for(int j = 0; j < column; j++) {
//				int input = scan.nextInt();
//				secondMatrix[i][j] = input;	
//			}
//		}
//		
//		for(int i = 0; i < row; i++) {
//			for(int j = 0; j < column; j++) {
//				sumMatrix[i][j] = secondMatrix[i][j] + firstMatrix[i][j];
//				System.out.print(sumMatrix[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}

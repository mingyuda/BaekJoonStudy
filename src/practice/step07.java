package practice;


import java.util.Arrays;
import java.util.Scanner;

public class step07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][]arr = new int[100][100];
		int len = scan.nextInt();
		int sum = 0;
		
		for(int i = 0; i < len; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
				for(int k = y; k < y + 10; k++) {
					for(int j = x; j < x + 10; j++) {
						if(arr[j][k] == 1) {
							sum = sum + 1;
						}else {
							arr[j][k] = 1;
						}
					}
				}
		}		
		System.out.println(len * 100 - sum);
		
//		int [][] backboard = new int[100][100];
//		int len = scan.nextInt();
//		int x = 0;
//		int y = 0;
//		int sum = 0;
//		
//		for(int i=0; i<len; i++)
//		{
//			x = scan.nextInt();
//			y = scan.nextInt();
//			
//			for(int j=x; j<x+10; j++)
//			{
//				for(int g=y; g<y+10; g++)
//				{
//					if(backboard[j][g] == 1)
//						sum++;
//					else backboard[j][g] = 1;
//				}
//			}
//		}
//		System.out.println(len * 100 - sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		String arr[][] = new String[5][15];
//		for(int i = 0; i < 5; i++) {
//			String input = scan.next();
//			for(int j = 0; j < input.length(); j++) {
//				arr[i][j] = input.substring(j, j + 1);
//			}
//		}
//		
//		
//		for(int i = 0; i < 15; i++) {
//			for(int j  = 0; j < 5; j++) {
//				if(arr[j][i] != null) {
//					System.out.print(arr[j][i]);
//				}
//			}
//		}
//		
		
		
		
		
//		String arr[] = new String[3];
//		arr[0] = "10";
//		arr[2] = "12";
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] != null) {
//				System.out.println(arr[i].substring(1, 2));
//			}
//		}
		
//		int findMax[][] = new int[9][9];
//		int matrixRow[] = new int[1];
//		int matrixCol[] = new int[1];
//		int Max = 0;
//		
//		for(int i = 0; i < 9; i++) {
//			for(int j = 0; j < 9; j++) {
//				int input = scan.nextInt();
//				findMax[i][j] = input;
//				if(input > Max) {
//					Max = input;
//					matrixRow[0] = i;
//					matrixCol[0] = j;
//				}
//			}
//		}
//		
//		
//		System.out.println(Max);
//		System.out.print(matrixRow[0] + 1 + " ");
//		System.out.print(matrixCol[0] + 1);
		
		
		
		
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

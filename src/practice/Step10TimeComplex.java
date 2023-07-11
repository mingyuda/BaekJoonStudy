package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Step10TimeComplex {	
		
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] arr = new int [5];
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			int input = scan.nextInt();
			arr[i] = input;
			sum += input;
		}
		
		Arrays.sort(arr);
		
		System.out.println(sum/5);
		System.out.println(arr[2]);
		
		
		
//		int len = scan.nextInt();
//		
//		int arr[] = new int [len];
//		
//		for(int i = 0; i < len; i++) {
//			int input = scan.nextInt();
//			arr[i] = input;
//		}
//		
//		Arrays.sort(arr);
//
//		
//		for(int i = 0; i < len; i++) {
//			System.out.println(arr[i]);
//		}
		
		
		
//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		
//		String arr[][] = new String[N][M];
//
//		for(int i = 0; i < N; i++) {
//			String input = scan.next();
//			for(int j = 0; j < M; j++) {
//				String input_j = input.charAt(j) + "";
//				arr[i][j] = input_j;
//			}
//		}
//		
//		int index_i = 0;
//		int index_j = 0;
//		int totalCount = 0;
//		int Mincount = 4000;
//		int count = 0;
//		String firstChar = "";
//		while(true) {
//			for(int i = index_i; i < index_i + 8; i++) {
//				firstChar = arr[index_i][index_j];
//				System.out.println(firstChar);
//				for(int j = index_j; j < index_j + 8; j++) {
//					if((j + 1) % 2 == 1) {
//						if(firstChar.equals(arr[i][j])) {
//							
//						}else {
//							arr[i][j] = firstChar;
//							count++;
//						}
//					}
//					if((j + 1) % 2 == 0) {
//						if(firstChar.equals(arr[i][j])) {	
//							count++;
//						}
//					}
//				}			
//
//			}
//			index_j++;
//			if(count < Mincount) {
//				Mincount = count;
//			}
//			count = 0;
//			
//			if(index_i + 8 >= N && index_j + 7 >= M) {
//				break;
//			}
//
//			// 행을 다 훑었을 때
//			if(index_j + 7 >= M) {
//				index_j = 0;
//				index_i++;				
//			}
//			
//			// 열을 다 훑었을 때
//			if(index_i + 7 >= N) {
//				index_i = 0;
//				break;
//			}
//		}
//		
//		
//		System.out.println(Mincount);
		
		
		
		
		
////		체스판
//		int N = scan.nextInt();
//		int M = scan.nextInt();
//		
//		String arr[][] = new String[N][1];
//
//		for(int i = 0; i < N; i++) {
//			String input = scan.next();
//			arr[i][0] = input;
//		}
//
//		
//		System.out.println(Arrays.deepToString(arr));
//		
//		// 흑과 백의 비율이 좋은 배열 찾기
//		int arrColorRatio[] = new int [N];
//		
//		
//		for(int i = 0; i < N; i++) {
//			int whiteCount = 0;
//			int blackCount = 0;
//			for(int j = 0; j < M; j++) {
//				if(arr[i][0].charAt(j) == 'W') {
//					whiteCount++;
//				}else if(arr[i][0].charAt(j) == 'B'){
//					blackCount++;
//				}
//			}
//			arrColorRatio[i] = Math.abs(whiteCount - blackCount);
//		
//		}
//		
//		System.out.println(Arrays.toString(arrColorRatio));
//		int min = 400;
//		int minIndex = 0;
//		for(int i = 0; i < N; i++) {
//			int sum = 0;
//			for(int j = i; j < i + 8; j++) {
//				sum += arrColorRatio[j];
//			}
//			if(sum <= min) {
//				minIndex = i;
//				min = sum;
//				System.out.println(min);
//			}
//			if(i + 8 >= N) {
//				break;
//			}
//		}
//		
//		System.out.println(minIndex);
//		
//		String[][] answerArr = new String [8][1];
//		int index = 0;
//		for(int i = minIndex; i < minIndex + 8; i++) {
//			answerArr[index][0] = arr[i][0];
//			index++;
//		}
//		
//		System.out.println(Arrays.deepToString(answerArr));
		
		
		
		
		
		
		
		
		
		
//		int n = scan.nextInt();
//
//
//		int answer = -1;
//		for (int i = 0; i * 5 <= n; i++) {
//			for (int j = 0; i * 5 + j * 3 <= n; j++) {
//				if (i * 5 + j * 3 == n) {
//					answer = i + j;
//				}
//			}
//		}
//
//		System.out.println(answer);
		
		
		
		
		
		
		

		
		
//		if(kg != 0) {
//		System.out.println(-1);
//	}else {
//		System.out.println(count2);			
//	}
		
		
		

		
		
// ----------
		
		
		
		
//		보류
//		for(int i = 0; i < N - 1; i++) {
//			for(int j = 0; j < M - 1; j++) {
//				if(arr[i][M] == arr[i][M+1]) {
//					if(arr[i][M] == "W") {
//						arr[i][M+1] = "B";
//					}else {
//						arr[i][M+1] = "B";
//					}
//				}
//			}
//		}
		
		
		
		
//		int input = scan.nextInt();
//		int index = 0;
//		int count = 0;
//		while(true) {
//			if(Integer.toString(index).contains("666")) {
//				count++;
//				if(count == input) {
//					System.out.println(index);
//					break;
//				}
//			}
//			index++;
//		}
		
		
		
		
		
		

		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int e = scan.nextInt();
//		int f = scan.nextInt();
//		
//		// 크래머의 공식
//		int D1 = a * e - (d * b);
//		int D2 = c * e - (f * b);
//		int D3 = a * f - (d * c);
//		
//		int x = D2/D1;
//		int y = D3/D1;
//		
//		System.out.print(x + " ");
//		System.out.print(y);		
		
		
//		실패
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int e = scan.nextInt();
//		int f = scan.nextInt();
//		
//		int answer_x = 0;
//		int answer_y= 0;
//		if(a != 0) {
//			for(int i = 0; i < 1000; i++) {
//				if(((c-b*i)/a) * d + (e*i) == f) {
//					answer_y = i;
//					answer_x = (c-b*i)/a;
//	
//					break;
//				}
//			}
//			for(int i = -999; i < 0; i++) {
//				if(((c-b*i)/a) * d + (e*i) == f) {
//					answer_y = i;
//					answer_x = (c-b*i)/a;
//					break;
//				}
//			}
//		}else if(d != 0){
//			for(int i = 0; i < 1000; i++) {
//				if(b * i == c) {
//					answer_y = i;
//					answer_x = (e * i - f) / d;
//	
//					break;
//				}
//			}
//			for(int i = -999; i < 0; i++) {
//				if(b * i == c) {
//					answer_y = i;
//					answer_x = (e * i - f) / d;
//					break;
//				}
//			}	
//		}else {
//			answer_x = 0;
//			for(int i = 0; i < 1000; i++) {
//				if(b * i - (e * i) == c - f) {
//					answer_y = i;
//	
//					break;
//				}
//			}
//			for(int i = -999; i < 0; i++) {
//				if(b * i - (e * i) == c - f) {
//					answer_y = i;
//	
//					break;
//				}
//			}
//		}
//		
//		
//		
//		
//		System.out.print(answer_x + " ");
//		System.out.print(answer_y);
		
//		int input = scan.nextInt();
//		
//		int copy = input;
//		int temp = copy;
//		int answer = 0;
//		while(temp > 0) {
//			int len = Integer.toString(temp).length();
//			int [] arr = new int[len];
//			int index = (len-1);
//			int temp2 = temp;
//			while(temp2 > 0) {
//				arr[index] = temp2 % 10;
//				temp2 /=10;
//				index--;
//			}
//			int sum = 0;
//			for(int i = 0; i < arr.length; i++) {
//				sum += arr[i];
//			}
//			sum += temp;
//			if(sum == copy) {
//				answer = temp;
//			}
//			
//			temp--;
//		}
//		
//		
//		System.out.println(answer);
		
		
		
//		int n = scan.nextInt();
//		int m = scan.nextInt();
//		
//		int [] arr= new int[n]; 
//		
//		int answer = 0;
//		
//		
//		for(int i = 0; i < n; i++) {
//			int input = scan.nextInt();
//			arr[i] = input;	
//		}
//		
////		System.out.println(Arrays.toString(arr));
//		
//		int compare = 0;
//		for(int i = 0; i < n-2; i++) {
//			for(int j = i + 1; j < n-1;j++) {
//				for(int k = j+1; k < n; k++) {
//					 compare = arr[i] + arr[j] + arr[k];
//					 if(Math.abs(answer - m) > Math.abs(compare - m) && compare <= m) {
//						 answer = compare;
//					 } 
//				}
//			}
//		}	
//			
//
//		System.out.println(answer);
		
		
		
		
//		int answer = 0;
//		
//		int A1 = scan.nextInt();
//		int A2 = scan.nextInt();
//		int B = scan.nextInt();
//		int C = scan.nextInt();
//		
//		//기울기도 비교
//		if((A1 * C) + A2 <= (B * C) && B >= A1) {
//			answer= 1;
//		};
//		
//		System.out.println(answer);
		
		
		
		
//		Long A = scan.nextLong();
//		
//		A = ((A - 2) * (A - 1) * A) / 6; 
//		
//		
//		System.out.println(A);
//		System.out.println(3);
//		
		
//		Long A = scan.nextLong();
//		Long sum;
//		
//		sum = A * A * A;
//		System.out.println(sum);
//		System.out.println(3);
//		double A = scan.nextDouble();
//		
//		double sum = 0;
//		
//		sum = A * (A - 1) / 2;
//		
//		System.out.println(Math.round(sum));
//		System.out.println(2);
		
		
		
//		for(int i = 0; i < A - 1; i++) {
//			for(int j = i + 1; j < A; j++) {
//				sum++;
//			}
//		}
//		
//		String answer = Double.toString(Math.round(sum));
//		bw.write(answer.substring(0, answer.length() - 2));
//		
//		
//		bw.flush();
		
		
		
		
		
		
//		int A = scan.nextInt();
//		System.out.println(1);
//		System.out.println(0);
//
//		char B = '2';
//		B += 1;
//		System.out.println(B);
		
		
		
	}
	

}

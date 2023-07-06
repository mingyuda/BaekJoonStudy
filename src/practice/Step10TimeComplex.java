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
		
		int input = scan.nextInt();
		
		int copy = input;
		int temp = copy;
		int answer = 0;
		while(temp > 0) {
			int len = Integer.toString(temp).length();
			int [] arr = new int[len];
			int index = (len-1);
			int temp2 = temp;
			while(temp2 > 0) {
				arr[index] = temp2 % 10;
				temp2 /=10;
				index--;
			}
			int sum = 0;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			sum += temp;
			if(sum == copy) {
				answer = temp;
			}
			
			temp--;
		}
		
		
		System.out.println(answer);
		
		
		
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

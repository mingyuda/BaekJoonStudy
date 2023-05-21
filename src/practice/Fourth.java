package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Fourth {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int len = Integer.parseInt(br.readLine());
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		double max = 0;
		double arr [] = new double[len];
		
		for(int i = 0; i < len; i++) {
			
			double A = Integer.parseInt(st.nextToken());
			arr[i] = A;
			if(max < arr[i]) {
				max = arr[i];
			}
			
		}
		
		
		for(int i = 0; i < len; i++) {
			// 왜 이런걸까 arr이 int면 0이 됨!!
			arr[i] = (arr[i]/max) * 100;
		}
		
		double sum = 0;
		for(int i = 0; i < len; i++) {
			sum = arr[i] + sum;
		}
//		System.out.println(sum/len);
		bw.write(String.valueOf(sum/len));
		bw.close();
		
		
		
		
		
		
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		st = new StringTokenizer(br.readLine());
//
//		Scanner scan = new Scanner(System.in);
//		
//		
//		int [] N = new int[30];
//		int [] B = new int[30];
//		for(int i = 0; i < 28; i++) {
//			int n = scan.nextInt();
//			N[i] = n;
//		}
//		
//		for(int i = 1; i <= 30; i++) {
//			B[i - 1] = i;
//		}
//
//		for(int i = 0; i < 30; i++) {
//			for(int j = 0; j < 30; j++) {
//				if(B[j] == N[i]) {
//					B[j] = 0;
//				}
//			}
//		}
//
//		for(int i = 0; i < 30; i++) {
//			if(B[i] != 0) {
//				System.out.println(B[i]);
//			}
//			
//		}
		
		
//		int n = Integer.parseInt(st.nextToken()); // 바구니 번호
//		int M = Integer.parseInt(st.nextToken()); // 공 바꾸는 횟수
//		
//		int temp = 0;
//		
//		for(int i = 0; i < N.length; i++) {
//			N[i] = i + 1;
//		}
//		
//		
//		for(int k = 0; k < M; k++) {
//			StringTokenizer st2 = new StringTokenizer(br.readLine());
//			int i = Integer.parseInt(st2.nextToken());
//			int j = Integer.parseInt(st2.nextToken());
//			
//			temp = N[i - 1];
//			N[i - 1] = N[j - 1];
//			N[j - 1] = temp;
//		}
//		
//		for(int i = 0; i< N.length; i++) {
//			System.out.print(N[i]);
//			System.out.print(" ");
//		}
		
		
		
		
//		int n = Integer.parseInt(st.nextToken()); // 바구니 번호
//		int[] N = new int[n];
//		int M = Integer.parseInt(st.nextToken()); // 공 넣는 횟수
//		
//		for(int q = 0; q < M; q++) {
//			StringTokenizer st2 = new StringTokenizer(br.readLine());
//			int i = Integer.parseInt(st2.nextToken());
//			int j = Integer.parseInt(st2.nextToken());
//			int k = Integer.parseInt(st2.nextToken());
//			for(int t = i - 1; t < j; t++) {
//				N[t] = k; 
//			}
//		}
//		for(int i = 0; i < N.length; i++) {
//			System.out.print(N[i]);
//			System.out.print(" ");
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr [] = new int[9];
//		int Max = 0;
//		int seq = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			st = new StringTokenizer(br.readLine());
//			arr[i] = Integer.parseInt(st.nextToken());
//			if(arr[i] > Max) {
//				Max = arr[i];
//				seq = i + 1;
//			}
//		}
//		System.out.println(Max);
//		System.out.println(seq);
		
		
		
		
		
		
		
//		
//		int len = Integer.parseInt(st.nextToken());
//		int Max = - 1000001;
//		int Min = 1000001;
//		StringTokenizer st2 = new StringTokenizer(br.readLine());
//		for(int i = 0; i < len; i++) {
//			int X = Integer.parseInt(st2.nextToken());
//			if(X > Max) {
//				Max = X;
//			}
//			if(X < Min) {
//				Min = X;
//			}
//		}
//		System.out.println(Min);
//		System.out.println(Max);
		
		
		
//		int N = Integer.parseInt(st.nextToken());
//		int X = Integer.parseInt(st.nextToken());
//		
//		StringTokenizer st2 = new StringTokenizer(br.readLine()); //띄어쓰기 기준으로 끊는듯
//		
//		for(int i = 0; i < N ; i++) {
//			int Y = Integer.parseInt(st2.nextToken()); // 따로 사용해야
//			
//			if(X > Y) {
//				System.out.print(Y + " ");
//			}
//		}
		
		
		
		
		
		
//		
//		int arr[] = new int [t];
//		int count = 0;
//		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 위치에 따라 에러 메세지가 뜨네 
//		int search = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < t; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//			if(arr[i] == search) {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}

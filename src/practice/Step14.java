package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Step14 {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();
		int arr[] = new int[len];
		
		if(len == 1) {
			int input = scan.nextInt();
			System.out.println(input * input);
		}else{
			
			for(int i = 0; i < len; i++) {
				int input = scan.nextInt();	
				arr[i] = input;
				
			}
			
			int Max = 0;
			int Min = 1000000;
			
			for(int i = 0; i < len; i++) {
				if(arr[i] > Max) {
					Max = arr[i];
				}
				// 어떤 수가 Max 이면서 Min일 수 있어서 else 하면 안됨
				if(arr[i] < Min) {
					Min = arr[i];
				}
				
			}
			
			System.out.println(Max * Min);
		}
		
		
		
//		int len = scan.nextInt();
//		
//		for(int i = 0; i < len; i++) {
//			int N = scan.nextInt();
//			int M = scan.nextInt();
//			double result = 1;
//			
//			int temp = N;
//			
//			for(int j = 0; j < N; j++) {
//				result = M * result;
//				result = result / temp;
//				M--;
//				temp--;
//			}
//			System.out.println(Math.round(result));
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
//		int input2 = scan.nextInt();
//		
//		int temp = input2;
//		double result = 1;
//		
//		
//		for(int i = 0; i < input2; i++) {
//			result = input * result;
//			result = result / temp;
//			input--;
//			temp--;
//		}
//		
//		System.out.println(Math.round(result));
		
		
		
		
		
//		int input = scan.nextInt();
//		
//		System.out.println(square(input));
		
		
	}
	
	
	
	
	
	
	static int result = 1;
	static int square(int a) {
		
		for(int i = 0; i < a; i++) {
			result = 2 * result;
		}
		
		
		return result;
	}
}

package practice;

import java.util.Scanner;

public class Step14 {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();
		
		for(int i = 0; i < len; i++) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			double result = 1;
			
			int temp = N;
			
			for(int j = 0; j < N; j++) {
				result = M * result;
				result = result / temp;
				M--;
				temp--;
			}
			System.out.println(Math.round(result));
			
		}
		
		
		
		
		
		
		
		
		
		
		
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

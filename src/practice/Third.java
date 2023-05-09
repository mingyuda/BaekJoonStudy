package practice;

import java.util.Scanner;


public class Third {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int totalPrice = scan.nextInt();
		int kinds = scan.nextInt();
		
		int A[] = new int[kinds];
		int B[] = new int[kinds];
		
		int total = 0;
		for(int i = 0; i < kinds; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			
			total = A[i] * B[i] + total;
		}
//		System.out.println(total);
		if(totalPrice == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		
//		int A = scan.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= A; i++) {
//			sum  = i + sum;
//		}
//		System.out.println(sum);
		
		
		
		
		
//		int len = scan.nextInt();
//		int x[] = new int[len];
//		int y[] = new int[len];
//		
//		for(int i = 0; i < len; i++) {
//			x[i] = scan.nextInt();
//			y[i] = scan.nextInt();
//			
//			System.out.println(x[i]+y[i]);
//		}
		
		
	}
}

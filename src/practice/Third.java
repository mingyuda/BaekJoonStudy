package practice;

import java.util.Scanner;


public class Third {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int sum = 0;
		for(int i = 1; i <= A; i++) {
			sum  = i + sum;
		}
		System.out.println(sum);
		
		//test
		
		
		
		
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

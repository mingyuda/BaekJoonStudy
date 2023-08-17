package basicpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step17 {
	
	public static int recursion(String s, int i, int r) {
		if(i >= r) {
			return 1;
		}
		
		else if(s.charAt(i) != s.charAt(r)) {
			return 0;
		}
		
		return recursion(s, i + 1, r - 1);
	}
	public static int timeCount(String s, int i, int r, int T) {
		T++;
		if(i >= r) {
			return T;
		}
		
		else if(s.charAt(i) != s.charAt(r)) {
			return T;
		}
		return timeCount(s, i + 1, r - 1, T);
	}
	
	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}
	
	
	public static int time(String s) {
		return timeCount(s, 0, s.length() - 1, 0);
	}
	
	
	
//	public static int fibonacci(int x) {
//		
//		if(x == 1 || x == 2) {
//			return 1;
//		}
//		
//		if(x == 0) {
//			return 0;
//		}
//		
//		int sum = fibonacci(x-1) + fibonacci(x-2);
//		
//		return sum; 
//	}
	
	
	
	
	
//	public static Long Factorial(Long x) {
//		Long sum = 0L;
//		
//		if(x == 1) {
//			return (long) 1;
//		}		
//		
//		sum = x * Factorial(x - 1);
//		
//		
//		return sum;
//	}
	
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			String input = br.readLine();
			sb.append(isPalindrome(input) + " " + time(input)+ "\n");
		
		}
		
		System.out.println(sb);
		
		
		
		
		// Fibonacci
//		int N = Integer.parseInt(br.readLine());
//		
//		System.out.println(fibonacci(N));
		
		
		
		
//		Long N = Long.parseLong(br.readLine());
//		if(N == 0) {
//			System.out.println(1);
//		}else {
//			System.out.println(Factorial(N));			
//		}
		
		
	}

}

package basicpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Step17 {
	
	public static int fibonacci(int x) {
		
		if(x == 1 || x == 2) {
			return 1;
		}
		
		if(x == 0) {
			return 0;
		}
		
		int sum = fibonacci(x-1) + fibonacci(x-2);
		
		return sum; 
	}
	
	
	
	
	
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
		
		System.out.println(fibonacci(N));
		
		
		
		
//		Long N = Long.parseLong(br.readLine());
//		if(N == 0) {
//			System.out.println(1);
//		}else {
//			System.out.println(Factorial(N));			
//		}
		
		
	}

}

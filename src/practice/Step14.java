package practice;

import java.util.Scanner;

public class Step14 {
	
	static int result = 1;
	static int square(int a) {
		
		for(int i = 0; i < a; i++) {
			result = 2 * result;
		}
		
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		System.out.println(square(input));
		
		
	}
}

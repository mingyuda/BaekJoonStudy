package practice;

import java.util.Scanner;

public class Step14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//nC2
		int input = scan.nextInt();
		
		int result = (input * (input-1));
		
		System.out.println(result);
		
		
	}
}

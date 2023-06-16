package practice;

import java.util.Scanner;

public class Step09Math {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}else if(B % A == 0) {
				System.out.println("factor");
			}else if(A % B == 0) {
				System.out.println("multiple");				
			}else {
				System.out.println("neither");
			}
		}
		

	}

}

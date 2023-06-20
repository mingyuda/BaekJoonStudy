package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Step09Math {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int start = scan.nextInt();
		int end = scan.nextInt();
		int totalSum = 0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = start; i <= end; i++) {
			int sum = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			if(sum == i + 1) {
				arr.add(i);
				totalSum += i;
			}
		}
		
		if(totalSum != 0) {
			System.out.println(totalSum);
			System.out.println(arr.get(0));	
		}else {
			System.out.println(-1);
		}
		
		
//		int len = scan.nextInt();
//		int count = 0;
//		for(int i = 0; i < len; i++) {
//			int sum = 0;
//			int input = scan.nextInt();
//			for(int j = 1; j <= input; j++) {
//				if(input % j == 0) {
//					sum += j;
//				}
//			}
//			if(sum == input + 1) {
//				count += 1;
//			}
//			
//		}
//		System.out.println(count);
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		int A = 0;
//		while(true) {
//			int sum = 0;
//			A = scan.nextInt();
//			if(A == -1) {
//				break;
//			}
//			for(int i = 1; i < A; i++) {
//				if(A % i == 0) {
//					arr.add(i);
//				}
//			}
//			
//			for(int i = 0; i < arr.size(); i++) {
//				sum = arr.get(i) + sum;
//			}
//			
//			if(A == sum) {
//				System.out.print(A + " = " + arr.get(0));
//				for(int i = 1; i < arr.size(); i++) {
//					System.out.print(" + " + arr.get(i));
//				}
//				System.out.println();
//			}else {
//				System.out.println(A + " is NOT perfect.");
//			}
//			
//			int index = arr.size();
//			for(int i = 0; i < index; i++) {
//				arr.remove(0);
//			}		
//			
//		}
		
		
		
		
		
		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
////		ArrayList<Integer> arr = new ArrayList<Integer>(); 
//		int [] arr = new int [A];
//		int index = 0;
//		for(int i = 0; i < A; i++) {
//			if(A % (i+1) == 0) {
//				arr[index] = i+1;
//				index++;
//			}
//		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[B - 1]);
		
//		while(true) {
//			int A = scan.nextInt();
//			int B = scan.nextInt();
//			
//			if(A == 0 && B == 0) {
//				break;
//			}else if(B % A == 0) {
//				System.out.println("factor");
//			}else if(A % B == 0) {
//				System.out.println("multiple");				
//			}else {
//				System.out.println("neither");
//			}
//		}
		

	}

}

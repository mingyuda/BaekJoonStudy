package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Step09Math {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		double input = scan.nextDouble();
		double sum = input * 4;
		
		System.out.println(Math.round(sum));
		
		
//		int [][] arr = new int [3][2];
//		
//		System.out.println(Arrays.deepToString(arr));
//		
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 2; j++) {
//				int input = scan.nextInt();
//				arr[i][j] = input;
//			}
//		}
//
//		
//		int temp1 = 0;
//		int temp2 = 0;
//		for(int i = 0; i < 2; i++) {
//			temp1 = arr[i][0];
//			temp2 = arr[i][1];
//			for(int j = i + 1; j < 3; j++) {
//				if(temp1 == arr[j][0]) {
//					arr[j][0] = 0;
//					arr[i][0] = 0;
//				}
//				if(temp2 == arr[j][1]) {
//					arr[j][1] = 0;
//					arr[i][1] = 0;
//				}
//				
//			}
//		}
//		
////		System.out.println(Arrays.deepToString(arr));
//		
//		
//		for(int i = 0; i < 3; i++) {
//			if(arr[i][0] != 0) {
//				System.out.print(arr[i][0] + " ");
//			}
//		}
//		
//		for(int i = 0; i < 3; i++) {
//			if(arr[i][1] != 0) {
//				System.out.print(arr[i][1]);
//			}
//		}
//		
		
		
		
		
		
		//실패
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		for(int i = 0; i < 6; i++) {
//			int input = scan.nextInt();
//			arr.add(input);
//		}
//		
//		HashSet<Integer> set = new HashSet<>(arr);
//		ArrayList<Integer> temp = new ArrayList<Integer>(set);
//		
//		System.out.println(temp);
//		
//		
//		for(int i = 0; i < temp.size(); i++) {
//			for(int j = i + 1; j < arr.size(); j++) {
//				
//			}
//		}
		
		
		//실패
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		ArrayList<Integer> answer = new ArrayList<Integer>();
//		for(int i = 0; i < 6; i++) {
//			int input = scan.nextInt();
//			arr.add(input);
//		}
//		
//		System.out.println(arr);
//		int temp = 0;
//		int index = 6;
//		for(int i = 0; i < index; i++) {
//			temp = arr.get(i);
//			arr.remove(i);
//			System.out.println(arr);
//			index--;
//			if(arr.contains(temp) == false) {
//				answer.add(temp);
//			}
//		}
//		
//		System.out.println(answer);		
		
		
		//실패
//		int x = scan.nextInt();
//		int y = scan.nextInt();
//		int h = scan.nextInt();
//		int w = scan.nextInt();
//		
//		int xdiff = h - x;
//		int ydiff = w - y;
//		
//		int input = 0;
//		
//		if(xdiff < ydiff) {
//			input = xdiff;
//		}else {
//			input = ydiff;
//		}
//		
//		if(x < input) {
//			input = x;
//		}
//		
//		if(y < input) {
//			input = y;
//		}
//		
//		
//		System.out.println(input);

		
		
		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		int answer = A * B;
//		System.out.println(answer);
		
		
		
		
		
		
		
		
		
		
		
//		int input = scan.nextInt();
//		
//		ArrayList<Integer> arr= new ArrayList<Integer>();
//		
//		while(input > 1) {
//			int index = 2;
//			while(true) {
//				if(input % index == 0) {
//					input = input / index;
//					arr.add(index);
//					break;
//				}
//				index++;
//			}
//		}
//		
////		System.out.println(arr);
//		
//		for(int i = 0; i < arr.size(); i++) {
//			System.out.println(arr.get(i));
//		}
		
		
		
//		int start = scan.nextInt();
//		int end = scan.nextInt();
//		int totalSum = 0;
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		for(int i = start; i <= end; i++) {
//			int sum = 0;
//			for(int j = 1; j <= i; j++) {
//				if(i % j == 0) {
//					sum += j;
//				}
//			}
//			if(sum == i + 1) {
//				arr.add(i);
//				totalSum += i;
//			}
//		}
//		
//		if(totalSum != 0) {
//			System.out.println(totalSum);
//			System.out.println(arr.get(0));	
//		}else {
//			System.out.println(-1);
//		}
		

		
		
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

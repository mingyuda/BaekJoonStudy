package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Step08Math {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int input = scan.nextInt();
	int inputJinbeop = scan.nextInt();
	ArrayList<Integer> arr = new ArrayList<Integer>();
	int temp = 0;
	String answer = "";
	
	char charArr[] = new char[26];
	for(char i = 'A'; i <= 'Z'; i++) {
		charArr[temp] = i;
		temp++;
	}
	
	System.out.println(charArr);
	
	for(int i = input; input > 0; input = input / inputJinbeop) {
		arr.add(input % inputJinbeop);
	}
	
	System.out.println(arr);
	
	Collections.reverse(arr);
	System.out.println(arr);
	for(int i = 0; i < arr.size(); i++) {
		if(arr.get(i) >= 10) {
			answer += charArr[arr.get(i) - 10];
		}else {
			answer += arr.get(i);
		}
	}
	
	System.out.println(answer);
	
//	String input = scan.next();
//	int inputInt = scan.nextInt();
//	
//	int totalSum = 0;
//	int arr [] = new int[input.length()];
//	for(int i = 0; i < input.length(); i++) {
//		int sum = 1;
//		for(int j = input.length() - i - 1; j > 0; j--) {
//			sum *= inputInt;	
//		}
//		if(input.charAt(i) >= 65) {
//			arr[i] = sum * (input.charAt(i) - 55);
//		}else {
//			System.out.println(input.charAt(i));
//			System.out.println(sum);
//			arr[i] = sum * Integer.parseInt(input.substring(i, i+1));
//			System.out.println(arr[i]);
//		}
//		totalSum += arr[i];
//	}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(totalSum);
		
	}
}

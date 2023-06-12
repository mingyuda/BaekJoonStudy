package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Step08Math {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int input = scan.nextInt();
	int i = 0;
	// 맨윗값 기준으로 i가 분모에 들어갈 값
	while(input > 0) {
		i++;
		input -= i;
	}
	input = Math.abs(input);
	String arr[] = new String[i];
	System.out.println(input);
	int loc = i;
	//짝수 내려가고 홀수 올라가고
	if(i % 2 == 0) {	
		for(int j = 0; j < loc; j++) {
			arr[j] = i + "/" + (j + 1);
			i--;
		}
	}else {
		for(int j = 0; j < loc; j++) {
			arr[j] = (j+1) + "/" + i;
			i--;
		}
	}
	
	System.out.println(Arrays.deepToString(arr));
	System.out.println(arr[input]);
	
//	int input = scan.nextInt() - 1;
//	int count = 0;
//	int answer = 0;
//	int arr[][] = new int [input / 6 + 1][2];
//
//	for(int i = 0; i < input; i++) {
//		if(i % 6 == 0) {
//			for(int j = 0; j < 1; j++) {
//				if(arr[count][0] == 0) {
//					arr[count][0] = i; 
//				}else if(arr[count][1] == 0) {
//					arr[count][1] = i;
//					count++;
//				}
//			}
//		}
//	}
//	System.out.println(Arrays.deepToString(arr));
//	for(int i = 0; i < arr.length; i++) {
//		for(int j = 0 ; j < 2; j++) {
//			if(arr[i][0] < input && arr[i][1] == 0 
//					|| arr[i][0] < input && arr[i][1] > input) {
//				answer = i + 1;
//			}
//		}
//	}
//	System.out.println(answer);
	
	
	
	
	
//	int len = scan.nextInt();
//	int num = 4;
//	int num2 = 4;
//	
//	for(int i = 0; i < len; i++) {
//		num = num * 4 - (num2 + num2 - 1);
//		num2 = (num2 - 1) * 2;
//	}
//	System.out.println(num);
	
	
	
	
//	int input = scan.nextInt();
//	int num = 4;
//	for(int i = 0; i < input; i++) {
//		num = num * 4 - (num - (i+1));
//		System.out.println(num);
//	}
//	
	
	
	
	
	
//	int len = scan.nextInt();
//	for(int i = 0; i < len; i++) {
//		int input = scan.nextInt();	
//		int count = 0;
//		System.out.print((input / 25) + " ");
//		input = input % 25;
//		System.out.print((input / 10) + " ");
//		input = input % 10;
//		System.out.print((input / 5) + " ");
//		input = input % 5;
//		System.out.print((input / 1) + " ");
//		input = input % 1;
//		
//		System.out.println();
//		
//	}
	
	
	
	
	
	
	
//	int input = scan.nextInt();
//	int inputJinbeop = scan.nextInt();
//	ArrayList<Integer> arr = new ArrayList<Integer>();
//	int temp = 0;
//	String answer = "";
//	
//	char charArr[] = new char[26];
//	for(char i = 'A'; i <= 'Z'; i++) {
//		charArr[temp] = i;
//		temp++;
//	}
//	
//	System.out.println(charArr);
//	
//	for(int i = input; input > 0; input = input / inputJinbeop) {
//		arr.add(input % inputJinbeop);
//	}
//	
//	System.out.println(arr);
//	
//	Collections.reverse(arr);
//	System.out.println(arr);
//	for(int i = 0; i < arr.size(); i++) {
//		if(arr.get(i) >= 10) {
//			answer += charArr[arr.get(i) - 10];
//		}else {
//			answer += arr.get(i);
//		}
//	}
//	
//	System.out.println(answer);
	
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

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Step14 {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scan = new Scanner(System.in);
		
		int len = scan.nextInt();
		
		int arr[] = new int[len * 2];
		ArrayList<String> arrStr = new ArrayList<String>(); 
		
		
		for(int i = 0; i < len; i++) {
			// input 값이 2개
			String input1 = scan.next();
			String input2 = scan.next();
			int temp1 = 0;
			int temp2 = 0;
			
			
			// 값이 없다면 넣어주고 temp에 담아주기
			// 값이 있다면 temp에 담아주기
			if(arrStr.contains(input1)) {
				for(int j = 0; j < arrStr.size(); j++) {
					if(arrStr.get(j).equals(input1)) {
						temp1 = j;
						break;
					}
				}
				
			}else {
				arrStr.add(input1);
				temp1 = arrStr.size() - 1;
			}
			
			
			if(arrStr.contains(input2)) {
				for(int j = 0; j < arrStr.size(); j++) {
					if(arrStr.get(j).equals(input2)) {
						temp2 = j;
						break;
					}
				}
				
			}else {
				arrStr.add(input2);
				temp2 = arrStr.size() - 1;
			}
			
			
			// 총총이 처음 들어올 때
			if(input1.equals("ChongChong")) {
				arr[temp1] = 1;
			}
			if(input2.equals("ChongChong")) {
				arr[temp2] = 1;
			}
			
			
			
			// 춤추는 사람과 마주한 경우

			if(arr[temp1] == 1) {
				arr[temp2] = 1;
			}
			if(arr[temp2] == 1) {
				arr[temp1] = 1;
			}
			
//			System.out.println(temp1);
//			System.out.println(temp2);
			
		}
		
//		System.out.println(arrStr);
//		System.out.println(Arrays.toString(arr));
		
		
		int count = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int len = Integer.parseInt(br.readLine());
//		
//		
//		
//		HashSet<String> arr = new HashSet<String>();
//		int extra = 0;
//		for(int i = 0; i < len; i++) {
//			String input = br.readLine();	
//			arr.add(input);
//			
//			if(input.equals("ENTER")) {
//				extra += arr.size() - 1;
//				arr.clear();
//			}
//			
//		}
//		
//		System.out.println(arr.size() + extra);
		
		
		
		
		
		
//		int len = scan.nextInt();
//		int arr[] = new int[len];
//		
//		if(len == 1) {
//			int input = scan.nextInt();
//			System.out.println(input * input);
//		}else{
//			
//			for(int i = 0; i < len; i++) {
//				int input = scan.nextInt();	
//				arr[i] = input;
//				
//			}
//			
//			int Max = 0;
//			int Min = 1000000;
//			
//			for(int i = 0; i < len; i++) {
//				if(arr[i] > Max) {
//					Max = arr[i];
//				}
//				// 어떤 수가 Max 이면서 Min일 수 있어서 else 하면 안됨
//				if(arr[i] < Min) {
//					Min = arr[i];
//				}
//				
//			}
//			
//			System.out.println(Max * Min);
//		}
		
		
		
//		int len = scan.nextInt();
//		
//		for(int i = 0; i < len; i++) {
//			int N = scan.nextInt();
//			int M = scan.nextInt();
//			double result = 1;
//			
//			int temp = N;
//			
//			for(int j = 0; j < N; j++) {
//				result = M * result;
//				result = result / temp;
//				M--;
//				temp--;
//			}
//			System.out.println(Math.round(result));
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
//		int input2 = scan.nextInt();
//		
//		int temp = input2;
//		double result = 1;
//		
//		
//		for(int i = 0; i < input2; i++) {
//			result = input * result;
//			result = result / temp;
//			input--;
//			temp--;
//		}
//		
//		System.out.println(Math.round(result));
		
		
		
		
		
//		int input = scan.nextInt();
//		
//		System.out.println(square(input));
		
		
	}
	
	
	
	
	
	
	static int result = 1;
	static int square(int a) {
		
		for(int i = 0; i < a; i++) {
			result = 2 * result;
		}
		
		
		return result;
	}
}

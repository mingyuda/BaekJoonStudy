package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step15_1 {
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int len = Integer.parseInt(st.nextToken());
		int LetterLen = Integer.parseInt(st.nextToken());
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for(int i = 0; i < len; i++) {
			String input = br.readLine();
			
			if(input.length() >= LetterLen) {
				arr.add(input);
			}
			
		}
		
		Collections.sort(arr);
//		System.out.println(arr);
		
		int count[] = new int [arr.size()];
		
		for(int i = 0; i < arr.size() - 1; i++) {
			int index = i;
			while(arr.get(index).equals(arr.get(index + 1))) {
				count[i]++;
				if(index < arr.size() - 2) {
					index++;					
				}else {
					break;
				}
			}				
			i += (index - i);
		}
		
//		System.out.println(Arrays.toString(count));
		
		
		int tempLen = arr.size();
		
		ArrayList<String> answer = new ArrayList<String>();
		
		for(int i = 0; i < tempLen; i++) {
			int Max = -1;
			int MaxLoc = 0;
			for(int j = 0; j < tempLen; j++) {
				// 개수로 높은 개수인것을 Max에 넣기
				if(count[j] > Max) {
					Max = count[j];
					MaxLoc = j;
				// 빈도가 같을 때
				}else if(count[j] == Max) {
					// 문자열 길이로 대소 비교
					if(arr.get(MaxLoc).length() > arr.get(j).length()) {
					}else if(arr.get(MaxLoc).length() < arr.get(j).length()) {
						MaxLoc = j;
					// 문자열이 같을 때 알파벳으로 대소 비교
					// 1과 -1이 아님 로직이 잘못됨, 숫자의 경우에는 이렇지만 문자의 경우에는 다른 문자의 아스키 코드로 결정
					}else {
						if(arr.get(MaxLoc).compareTo(arr.get(j)) == 1) {
						}else if(arr.get(MaxLoc).compareTo(arr.get(j)) == -1) {
							MaxLoc = j;
						}
					}
					
				}
				
				
			}
			// 중복 값 제거
			if(!answer.contains(arr.get(MaxLoc))) {
				answer.add(arr.get(MaxLoc));
			}
			
			count[MaxLoc] = -2;
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < answer.size(); i++) {
			sb.append(answer.get(i) + "\n");
		}
		
		System.out.println(sb);
		
		
//		int len = scan.nextInt();
//		
//		int Max = -4000;
//		int Min = 4000;
//		double sum = 0;
//		int Mode = 0;
//		int arr[] = new int[len];
//		
//		
//		for(int i = 0; i < len; i++) {
//			int input = scan.nextInt();
//			if(input < Min) {
//				Min = input;
//			}
//			if(input > Max) {
//				Max = input;
//			}
//			
//			sum += input;
//			
//			arr[i] = input;
//			
//			
//		}
//		
//		Arrays.sort(arr);
//		
//
//		
//		int count[] = new int[arr.length];
//		for(int i = 0; i < arr.length - 1; i++) {
//			int index = i;
//			
//			
//			while(arr[index] == arr[index+1]) {
//				count[i]++;
//				if(index < len - 2) {
//					index++;					
//				}else {
//					break;
//				}
//			}				
//			i += (index - i);
//			
//			
//			
//		}
//		
//		int tempMax = 0;
//		int tempLoc = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(count[i] > tempMax) {
//				tempMax = count[i];
//				tempLoc = i;
//			}
//		}
//		
//		int countMax = 0;
//		for(int i = 0; i < arr.length; i++) {
//			if(count[i] == tempMax) {
//				countMax++;
//			}
//		}
//		if(countMax != 1) {
//			ArrayList<Integer> tempMode = new ArrayList<Integer>();
//			for(int i = 0; i < arr.length; i++) {
//				if(count[i] == tempMax) {
//					tempMode.add(arr[i]);
//				}
//			}
//			
//			Collections.sort(tempMode);
//			
//			Mode = tempMode.get(1);
//			
//		}else {
//			Mode = arr[tempLoc];
//		}
//		
//		
//
//		
//		
//		
//		// avg
//		System.out.println(Math.round(sum / len));
//		// median
//		System.out.println(arr[Math.round(len/2)]);
//		//mode
//		System.out.println(Mode);
//		//range
//		System.out.println(Max - Min);
		
	}
}


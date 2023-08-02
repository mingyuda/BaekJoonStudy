package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int input1 = Integer.parseInt(st1.nextToken());
			map.put(input1, map.getOrDefault(input1, 0) + 1);		
		}
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			int input2 = Integer.parseInt(st2.nextToken());
//			map.getOrDefault(input2, 0);
			sb.append(map.getOrDefault(input2, 0) + " ");
		}
		
		System.out.println(sb);
		
		
		
		
// 1620 성공		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		ArrayList<String> arr = new ArrayList<String>();
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
////		arr.add("");
//		
//		for(int i = 1; i <= N; i++) {
//			String input = br.readLine();
//			arr.add(input);
//			map.put(input, i);	
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < M; i++) {
//			String input = br.readLine();
//			if(map.get(input) == null) {
//				sb.append(arr.get(Integer.parseInt(input) -1) + "\n");
//			}else {
//				sb.append(map.get(input) + "\n");
//			}
//		}
//		
//		System.out.println(sb);
		
		
		
		
		
		
		
		
		
//7785 성공		
//		ArrayList<String> arr = new ArrayList<String>();
//		int N = Integer.parseInt(br.readLine());
//		
//		
//		for(int i = 0; i < N; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			String name = st.nextToken(); 
//			String status = st.nextToken();
//			if(status.equals("enter")) {
//			}
//			map.put(name, status);
//			
//		}
//		
//
//		
//		for(String answer : map.keySet()) {
//			if(map.get(answer).equals("enter")) {
//				arr.add(answer);				
//			}
//		}
//		
//		Collections.sort(arr);
//		Collections.reverse(arr);
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < arr.size(); i++) {
//			sb.append(arr.get(i) + "\n");
//		}
//		
//		System.out.println(sb);
		
	
		
		
//	 7785 실패
		// 갯수가 안맞음
		//		Scanner scan = new Scanner(System.in);
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		HashMap<String, String> map = new HashMap<>();
//		ArrayList<String> temp = new ArrayList<String>();
//		int N = Integer.parseInt(br.readLine());
//		
//		
//		for(int i = 0; i < N; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			String name = st.nextToken(); 
//			String status = st.nextToken();
//			if(status.equals("enter")) {
//				temp.add(name);
//			}
//			map.put(name, status);
//			
//		}
//		
//		Collections.sort(temp);
//		Collections.reverse(temp);
//
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < map.size(); i++) {
//			if(map.get(temp.get(i)).equals("enter")) {
//				sb.append(temp.get(i) + "\n");
//			}
//		}
//		
//		System.out.println(sb);
//		
		
//		int count = 0;
//		
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		for(int i = 0; i < N; i++) {
//			String input = br.readLine();
//			map.put(input, 1);
//		}
//		
//		
//		for(int i = 0 ; i < M; i++) {
//			String input = br.readLine();
//			if(map.containsKey(input)) {
//				count++;
//			}else {
//			}
//			
//		}
//		
//		System.out.println(count);
		
		
		
		
		
		
//		int N = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < N; i++) {
//			int input = Integer.parseInt(st.nextToken());
//			map.put(input, 1);
//		}
//		
//		int M = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st2 = new StringTokenizer(br.readLine());
//		for(int i = 0 ; i < M; i++) {
//			int input = Integer.parseInt(st2.nextToken());
//			arr.add(input);
//			if(map.containsKey(input)) {
//				map2.put(input, 1);
//			}else {
//				map2.put(input, 0);
//			}
//			
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < map2.size(); i++) {
//			int answer = map2.get(arr.get(i));
//			sb.append(answer + " ");
//		}
//		
//		System.out.println(sb);
//		
//		//순서가 이상하게 나옴
////		for(int answer : map2.values()) {
////			System.out.print(answer);
////		}
		
		
	}

}

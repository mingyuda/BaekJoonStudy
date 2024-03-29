package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Step16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner scan = new Scanner(System.in);
		
		Deque<Integer> deque = new ArrayDeque<Integer>();
		
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = scan.nextInt();
		
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int input = scan.nextInt();
		
			if(input == 1) {
				int temp = scan.nextInt();
				deque.addFirst(temp);
			}else if(input == 2) {
				int temp = scan.nextInt();
				deque.addLast(temp);
			}else if(input == 3) {
				if(deque.size() > 0) {
					sb.append(deque.pollFirst() + "\n");
				}else {
					sb.append(-1 + "\n");
				}
			}else if(input == 4) {
				if(deque.size() > 0) {
					sb.append(deque.pollLast() + "\n");
				}else {
					sb.append(-1 + "\n");
				}
			}else if(input == 5) {
				sb.append(deque.size() + "\n");
			}else if(input == 6) {
				if(deque.size() > 0) {
					sb.append(0 + "\n");
				}else {
					sb.append(1 + "\n");
				}
			}else if(input == 7) {
				if(deque.size() > 0) {
					sb.append(deque.peekFirst() + "\n");
//					System.out.println("확인" + deque.peekFirst());
				}else {
					sb.append(-1 + "\n");
				}
			}else if(input == 8) {
				if(deque.size() > 0) {
					sb.append(deque.peekLast() + "\n");
				}else {
					sb.append(-1 + "\n");
				}
			}
		
		}
		
		System.out.println(sb);
		
	
		
		
		
		
		
		
		
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		ArrayList<Integer> ans = new ArrayList<Integer>();
//		Deque<Integer> deque = new ArrayDeque<Integer>();
//		
//		
//		for(int i = 1; i <= N; i++) {
//			arr.add(i);
//		}
//		
//		System.out.println(arr);
//		
//		int index = 1;
//		int count = M / N;
//		int temp = 0;
//		while(ans.size() < N) {
//			for(int i = 1; i <= count; i++) {
//				index = (M - 1) * i;
//				ans.add(arr.get(index));
//			}
//		}
//		
//		
//		System.out.println(ans);
		
		
		
		
		
		
		
		
		
// 2164
//		Deque<Integer> deque = new ArrayDeque<Integer>();
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		for(int i = 1; i <= N; i++) {
//			deque.add(i);
//		}
//		
//		int index = 0;
//		while(deque.size() > 1) {
//			if(index % 2 == 0) {
//				deque.pollFirst();
//			}else if(index % 2 == 1) {
//				deque.addLast(deque.getFirst());
////				System.out.println(deque);
//				deque.pollFirst();
////				System.out.println(deque);
//			}
//			index++;
//		}
//		
//		
//		System.out.println(deque.getFirst());
		
		
		
		
		
		
		
		
		
		
		
		
		
// 		18258
//		Scanner scan = new Scanner(System.in);
//		Deque<Integer> deque = new ArrayDeque<Integer>();
//		
//		
//		int N = scan.nextInt();
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < N; i++) {
//			String input = scan.next();
//			if(input.equals("push")) {
//				int inputNum = scan.nextInt();
//				deque.add(inputNum);
//			}else if(input.equals("front")) {
//				if(deque.size() > 0) {
//					sb.append(deque.peekFirst() + "\n");					
//				}else {
//					sb.append(-1 + "\n");
//				}				
//			}else if(input.equals("back")) {
//				if(deque.size() > 0) {
//					sb.append(deque.peekLast() + "\n");					
//				}else {
//					sb.append(-1 + "\n");
//				}	
//			}else if(input.equals("size")) {
//				sb.append(deque.size() + "\n");
//			}else if(input.equals("pop")) {
//				if(deque.size() > 0) {
//					sb.append(deque.poll() + "\n");					
//				}else {
//					sb.append(-1 + "\n");
//				}
//			}else if(input.equals("empty")) {
//				if(deque.size() == 0) {
//					sb.append(1 + "\n");
//				}else {
//					sb.append(0 + "\n");
//				}
//			}
//		}
//		
//		
//		System.out.println(sb);
//		
		
		
		
		
		
		
		
		
		
//		Stack<Integer> stack = new Stack<Integer>();
//		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		
		
//		int N = Integer.parseInt(br.readLine());
//		
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < N; i++) {
//			int input = Integer.parseInt(st.nextToken());
//			que.add(input);
//		}
//
//		int num = 1;
//		int index = 0;
//		int pass = 0;
//		
//		while(true) {
//			if(que.isEmpty() && stack.empty()) {
//				break;
//			}else if(que.isEmpty()) {
//				arr.add(stack.pop());
//				index++;
//			}else if(que.peek() == (num + index)) {
//				arr.add(que.poll());
//				index++;
//			}else if(!stack.empty()) {
//				if(stack.peek() == num + index) {
//					arr.add(stack.pop());
//					index++;
//				}else{
//					stack.add(que.poll());
//				}		
//			}else{
//				stack.add(que.poll());
//			}
//			
//		}
//		
//		for(int i = 1; i <= N; i++) {
//			if(i == arr.get(i - 1)) {
//				
//			}else {
//				pass = 1;
//			}
//		}
//		
////		System.out.println(arr);
//		
//		if(pass == 0) {
//			System.out.println("Nice");
//		}else {
//			System.out.println("Sad");
//		}
//		
		
		
		
		
		
		
//		int N = Integer.parseInt(br.readLine());
//		
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < N; i++) {
//			String input = br.readLine();
//			int left = 0;
//			int right = 0;
//			int pass = 0;
//			
//			if(input.length() % 2 == 1) {
//				right++;
//			}else{
//			
//				for(int j = 0; j < input.length(); j++) {
//					if(input.substring(j, j + 1).equals("(")) {
//						left++;
//					}else {
//						right++;
//					}
//					if(input.substring(j, j + 1).equals(")") && left == right - 1) {
//						sb.append("NO" + "\n");
//						pass = 1;
//						break;
//					}
//					
//				}
//			
//			}
//			
////			sb.append("-------------------" + "\n");
////			sb.append(left + "\n");
////			sb.append(right + "\n");
//			
//			if(pass == 1) {	
////				sb.append("pass" + "\n");
//				continue;
//			}else if(left == right) {
//				sb.append("YES" + "\n");
//			}else {
//				sb.append("NO" + "\n");				
//			}
//			
//			
//			
//		}
		
		
//		System.out.println(sb);
		
		
		
		
		
		
		
		
// 10773 성공
//		Stack<Integer> stack = new Stack<Integer>();
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < N; i++) {
//			int input = Integer.parseInt(br.readLine());
//			if(input != 0) {
//				stack.add(input);
//			}else {
//				stack.pop();
//			}
//		}
//		
//		Long sum = 0L;
//		
//		int temp = stack.size();
//		
//		for(int i = 0; i < temp; i++) {
//			sum += stack.pop();
//		}
//
//		System.out.println(sum);
				
				
		
		
		
		
		
// 1268번 성공
//		ArrayList<Integer> arr = new ArrayList<Integer>(); 
//		
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		
//		int N = Integer.parseInt(st.nextToken());
//		int M = Integer.parseInt(st.nextToken());
//		
//		int count = 0;
//		
//		StringTokenizer st1 = new StringTokenizer(br.readLine());
//		for(int i = 0; i < N; i++) {
//			int input = Integer.parseInt(st1.nextToken());
//			map.put(input, 1);
//			arr.add(input);
//		}
//		
//		
//		StringTokenizer st2 = new StringTokenizer(br.readLine());
//		for(int i = 0; i < M; i++) {
//			int input = Integer.parseInt(st2.nextToken());
//			int temp = map.getOrDefault(input, 0) + 1;
//			map2.put(input, 1);
//
//			// B-A 갯수
//			if(temp <= 1) {
//				count++;
//			}
//		}
//		
//		for(int i = 0; i < N; i++) {
//			int input = arr.get(i);
//			
//			int temp = map2.getOrDefault(input, 0) + 1;
//			
//			if(temp <=1) {
//				count++;
//			}
//			
//		}
//		
//		System.out.println(count);

		
		
		
		
		
		
		
// 1764번
//		ArrayList<String> arr = new ArrayList<String>();
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
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
//		for(int i = 0; i < M; i++) {
//			String input = br.readLine();
//			int temp = map.getOrDefault(input, 0) + 1;
//			map.put(input, temp);
//			if(temp != 1) {
//				arr.add(input);
//			}
//			
//		}
//		Collections.sort(arr);
//		
//		StringBuilder sb = new StringBuilder();
//		sb.append(arr.size() + "\n");
//		for(int i = 0; i < arr.size(); i++) {
//			sb.append(arr.get(i) + "\n");
//		}
//		
//		System.out.println(sb);
//		
		
		
		
		
		
//	10816번 성공
//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
//
//		
//		int N = Integer.parseInt(br.readLine());
//		
//		StringTokenizer st1 = new StringTokenizer(br.readLine());
//		for(int i = 0; i < N; i++) {
//			int input1 = Integer.parseInt(st1.nextToken());
//			map.put(input1, map.getOrDefault(input1, 0) + 1);		
//		}
//		
//		int M = Integer.parseInt(br.readLine());
//		StringTokenizer st2 = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < M; i++) {
//			int input2 = Integer.parseInt(st2.nextToken());
////			map.getOrDefault(input2, 0);
//			sb.append(map.getOrDefault(input2, 0) + " ");
//		}
//		
//		System.out.println(sb);
		
		
		
		
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

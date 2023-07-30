package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step16 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map2 = new HashMap<>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			int input = Integer.parseInt(st.nextToken());
			map.put(input, 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0 ; i < M; i++) {
			int input = Integer.parseInt(st2.nextToken());
			arr.add(input);
			if(map.containsKey(input)) {
				map2.put(input, 1);
			}else {
				map2.put(input, 0);
			}
			
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < map2.size(); i++) {
			int answer = map2.get(arr.get(i));
			sb.append(answer + " ");
		}
		
		System.out.println(sb);
		
		//순서가 이상하게 나옴
//		for(int answer : map2.values()) {
//			System.out.print(answer);
//		}
		
		
	}

}

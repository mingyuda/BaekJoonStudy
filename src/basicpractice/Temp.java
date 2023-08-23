package basicpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		int N = scan.nextInt();
		String arr[][] = new String[N][2];
		
		for(int i = 0; i < N; i++) {
			arr[i][0] = scan.next();
			arr[i][1] = scan.next();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			public int compare(String[]o1, String[]o2) {
				if(!o1[0].equals(o2[0])) {
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				}
				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}
		
		}
		);
		
//		System.out.println(Arrays.deepToString(arr));
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(arr[i][0] + " " + arr[i][1] + "\n");
		}
		System.out.println(sb);
	}

}

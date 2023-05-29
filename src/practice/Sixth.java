package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sixth {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < len; i++) {
			for(int k = 0; k < len - i - 1 ; k++) {
				System.out.print(" ");				
			}
			for(int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0; i < len - 1; i++) {
			for(int k = 0; k < i + 1; k++) {
				System.out.print(" ");				
			}
			for(int j = 0; j < (len - (i + 1)) * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
//		int a[] = new int[6];
//		int b[] = new int[6];
//		String c[] = new String[6];
//		String answer = "";
//		//StirngTokenizer가 안에 있으면 세로로 입력해야
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i = 0; i < 6; i++) {
//			int input = Integer.parseInt(st.nextToken());
//			a[i] = input;
//			
//			if(i == 0 || i == 1) {
//				b[i] = 1;
//			}else if(i == 2 || i == 3 || i == 4) {
//				b[i] = 2;
//			}else if(i == 5) {
//				b[i] = 8;
//			}
//			
//			c[i] = Integer.toString(b[i] - a[i]);
//		}
//		
//		for(int i = 0; i < c.length - 1; i++) {
//			answer = answer + c[i] + " ";
//		}
//		answer = answer + c[5];
//		
//		
//		System.out.println(answer);
//		
//		System.out.println(Arrays.toString(c));
//		// 사이사이마다 넣어주는 듯
//		System.out.println(String.join(" ", c)); //개 쩐다!~!!

		
		
//		System.out.println("         ,r'\"7");
//		System.out.println("r`-_   ,'  ,/");
//		System.out.println(" \\. \". L_r'");
//		System.out.println("   `~\\/");
//		System.out.println("      |");
//		System.out.println("      |");
	}
	
}

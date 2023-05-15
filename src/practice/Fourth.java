package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fourth {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int len = Integer.parseInt(st.nextToken());
		int Max = - 1000001;
		int Min = 1000001;
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < len; i++) {
			int X = Integer.parseInt(st2.nextToken());
			if(X > Max) {
				Max = X;
			}
			if(X < Min) {
				Min = X;
			}
		}
		System.out.println(Min);
		System.out.println(Max);
		
		
		
//		int N = Integer.parseInt(st.nextToken());
//		int X = Integer.parseInt(st.nextToken());
//		
//		StringTokenizer st2 = new StringTokenizer(br.readLine()); //띄어쓰기 기준으로 끊는듯
//		
//		for(int i = 0; i < N ; i++) {
//			int Y = Integer.parseInt(st2.nextToken()); // 따로 사용해야
//			
//			if(X > Y) {
//				System.out.print(Y + " ");
//			}
//		}
		
		
		
		
		
		
//		
//		int arr[] = new int [t];
//		int count = 0;
//		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 위치에 따라 에러 메세지가 뜨네 
//		int search = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < t; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//			if(arr[i] == search) {
//				count++;
//			}
//		}
//		System.out.println(count);
	}
}

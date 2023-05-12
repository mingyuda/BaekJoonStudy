package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//import java.util.Scanner;
// br.readLine()이 EOF를 만나면 null을 반환합니다. 
// 따라서 StringTokenizer 선언 시 NullPointer 에러가 생기는 것이죠. 
// 저같은 경우는 보통 이렇게 씁니다.

public class Third {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st;
		String s;
		
		while((s=br.readLine()) != null){
			st = new StringTokenizer(s);
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			bw.write((A+B) + "\n");
		}
		bw.flush();
		bw.close();
		
		//ctrl + z 하면 EOF End Of File !
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//		StringTokenizer st;
//		st = new StringTokenizer(br.readLine());
//		int t = Integer.parseInt(st.nextToken());
//		String A = "*";
//
//		for(int i = t; i > 0; i--) {
//			String B = "";	
//			for(int z = 1; z < i; z++){
//				B = B + " ";
//			}
//			System.out.println(B + A);
//			A = A + "*";
//		}
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//		StringTokenizer st;
//		st = new StringTokenizer(br.readLine());
//		int t = Integer.parseInt(st.nextToken());
//		String A = "";
//		for(int i = t; i > 0; i--) {
//			A = "";
//			for(int z = 0; z < i; z++) {
//				A = A + "*";
//			}
//			System.out.println(A);
//		
//			
//		}
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//		StringTokenizer st;
//		st = new StringTokenizer(br.readLine());
//		int t = Integer.parseInt(st.nextToken());
//		String A = "*";
//		for(int i = 0; i < t; i++) {
//			
//			
//			System.out.println(A);
//			
//			A = A + "*";
//			
//		}
		
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		int len = Integer.parseInt(br.readLine());
//		for(int i =0; i < len; i++) {
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			// 얘네는 여러개라 쪼개서 들고옴
//			
//			bw.write("Case #"+ (i + 1) + ": " + A + " + " + B + " = " + (A+B) + "\n"); //문자열로 바뀜
//		}
//		bw.flush();
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		int len = Integer.parseInt(br.readLine());
//		// 얘는 한줄만 있어서 그냥 들고오면 됨
//		// 반복문 안에 들어와야 한다
//		for(int i =0; i < len; i++) {
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			// 얘네는 여러개라 쪼개서 들고옴
//			
//			bw.write(A+B + "\n"); //문자열로 바뀜
//		}
//		bw.flush();	
		
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		int totalPrice = scan.nextInt();
//		int kinds = scan.nextInt();
//		
//		int A[] = new int[kinds];
//		int B[] = new int[kinds];
//		
//		int total = 0;
//		for(int i = 0; i < kinds; i++) {
//			A[i] = scan.nextInt();
//			B[i] = scan.nextInt();
//			
//			total = A[i] * B[i] + total;
//		}
////		System.out.println(total);
//		if(totalPrice == total) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
		
		
//		int A = scan.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= A; i++) {
//			sum  = i + sum;
//		}
//		System.out.println(sum);
		
		
		
		
		
//		int len = scan.nextInt();
//		int x[] = new int[len];
//		int y[] = new int[len];
//		
//		for(int i = 0; i < len; i++) {
//			x[i] = scan.nextInt();
//			y[i] = scan.nextInt();
//			
//			System.out.println(x[i]+y[i]);
//		}
		
		
	}
}

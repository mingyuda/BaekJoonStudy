package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;


public class OneTwo {

	public static void main(String[] args) throws IOException {
		
		
		
	//version 1
//	Scanner scan = new Scanner(System.in);
//
//	int A = scan.nextInt();
//	int B = scan.nextInt();
//	int C = scan.nextInt();
//	
//	if(A == B && B == C && C == A) {
//		System.out.println(10000 + A * 1000);
//	}else if(A == B) {
//		System.out.println(1000 + A * 100);
//	}else if(C == B) {
//		System.out.println(1000 + B * 100);
//	}else if(A == C) {
//		System.out.println(1000 + A * 100);
//	}else if(A != B && B != C && C != A) {
//		if(A > B && A > C) {
//			System.out.println(A * 100);
//		}else if(B > A && B > C) {
//			System.out.println(B * 100);
//		}else if(C > A && C > B) {
//			System.out.println(C * 100);
//		}
//	}
		
	//version2
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	StringTokenizer st = new StringTokenizer(br.readLine());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	int c = Integer.parseInt(st.nextToken());
	
	int money = 0;
    int[] arr = {a, b, c};
    Arrays.sort(arr); // Arrays 메소드인 sort로 arr 배열을 분류
    if((a==b) && (b==c) && (c==a)) {
        money = 10000 + a * 1000;
    }
    else if(a==b) {
        money = 1000 + a * 100;
        }
    else if(b==c) {
        money = 1000 + b * 100;
        }
    else if(c==a) {
        money = 1000 + c * 100;
        }
    else if((a!=b) && (b!=c) && (c!=a)) {
        money = arr[2]*100;
    }
    
    System.out.println(money);
	for(int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
		
	
	}
	
}	
	//오븐 시간 문제
//	int A = scan.nextInt();
//	int B = scan.nextInt();
//	int C = scan.nextInt();
//	
//	if(A >= 0 && A <= 23 && B <= 59 && B >= 0) {
//		B += C;
//		if(B > 59) {
//			int add = B/60;
//			B %= 60;
//			A += add;
//			if(A > 23){
//				A %= 24;
//			}
//		}
//
//	}
//		
//		System.out.println(A + " " + B);

	
	
	
	
	
//	int A = scan.nextInt();
//	int B = scan.nextInt();
//	
//	if(A >= 0 && A <= 23 && B <= 59 && B >= 0) {
//		B -= 45;
//		if(B<0) {
//			B += 60;
//			A -= 1;
//		}
//		if(A < 0) {
//			A = 23;
//		}
//
//	}
//		
//		System.out.println(A + " " + B);
//	}
//}

//		if(A == 0 && B <= 45) {
//			A = 23;
//		}
	
	
	
	
//	int A = scan.nextInt();
//	int B = scan.nextInt();
//	
//	if(A > 0 && B > 0) {
//		System.out.println(1);
//	}else if(A < 0 && B > 0) {
//		System.out.println(2);
//	}else if(A < 0 && B < 0) {
//		System.out.println(3);
//	}else if(A > 0 && B < 0) {
//		System.out.println(4);
//	}
	
	
	
//	int A = scan.nextInt();
//	
//	if((A % 4 == 0 && A % 100 != 0) || A % 400 == 0) {
//		System.out.println(1);
//	} else {
//		System.out.println(0);
//	}
	

	
//	int A = scan.nextInt();
//	
//	if(A>=90 && A<=100) {
//		System.out.println("A");
//	}else if(A >= 80 && A<= 89) {
//		System.out.println("B");
//	}else if(A >= 70 && A<= 79) {
//		System.out.println("C");
//	}else if(A >= 60 && A<= 69) {
//		System.out.println("D");
//	}else {
//		System.out.println("F");
//	}
//	
//	
	
	
	
	
	
//	int A = scan.nextInt();
//	int B = scan.nextInt();
//		
//	if(A>B) {
//		System.out.println(">");
//	}else if(A < B) {
//		System.out.println("<");
//	}else {
//		System.out.println("==");	
//	}
		
		
		
		
		
		
		
		
		
		
//--------------------------------------------------		
		
//		System.out.println("fdf\tdfd");
//		
//		//개
//		System.out.println("|\\_/|");
//        System.out.println("|q p|   /}");
//        System.out.println("( 0 )\"\"\"\\");
//        System.out.println("|\"^\"`    |");
//        System.out.println("||_/=\\\\__|");
//
//        System.out.println();
//		
		
		
		
		
//		// 특수한 목적을 가진지 여부 확인을 위해 달러를 앞에 써준다! 즉, 달러를 쓰고 싶으면 달러를 앞에 하나 더 써야
//		System.out.println("\\    /\\");
//		System.out.println(" )  ( ')");
//		System.out.println("(  /  )");
//		System.out.println(" \\(__)|");
		
// --------------------------------------------------
		// 입력, 출력
//		Scanner scan = new Scanner(System.in);
		

		
		// next long long은 10^12 까지 long은  double과 달리 정수형!
//		long A = scan.nextLong();
//		long B = scan.nextLong();
//		long C = scan.nextLong();
//		
//		
//		System.out.println(A + B + C);
		
		
		
		
		
		
		
		// 10씩
		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		
//		int b1 = B % 10;
//		int B1 = B/10;
//		int b10 = B1 % 10;
//		int B2 = B1/10;
//		int b100 = B2%10;
//		
//		System.out.println(A * b1);
//		System.out.println(A * b10);
//		System.out.println(A * b100);
//		System.out.println(A * B);
//		
//		왜 안되는지 고민해보기
//		System.out.println((String.valueOf(B)).length());
//		
//		for(int i = 0; i < (String.valueOf(B)).length() + 1; i++) {
//			int b = B % 10;
//			B = B/10;
//			System.out.println(A * b);
//		}
		
		
		
		
//		int A = scan.nextInt();
//		int B = scan.nextInt();
//		int C = scan.nextInt();
//		
//		System.out.println((A+B)%C);
//		System.out.println(((A+B)%C)%C);
//		System.out.println((A*B)%C);
//		System.out.println(((A%C)*(B%C))%C);
		
		
		
		
		
//		int y = scan.nextInt(); 
//		
//		if(y >= 1000 && y <= 3000) {
//			System.out.println(y - 543);
//		}
		
		
		
		
		
		
//		String a = scan.next();
//		System.out.println(a + "??!");
	
		
		
		
//		int a;
//		int b;
//		
//		a = scan.nextInt();
//		b = scan.nextInt();
//		
//		System.out.println((double)a + b);
//		System.out.println((double)a - b); 
//		System.out.println((double)a * b); 
//		System.out.println((double)a / b); //double은 64비트까지 float은 32bit 까지
//		System.out.println((double)a % b); 
		
		
		

//}


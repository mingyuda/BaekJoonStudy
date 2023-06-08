package practice;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sixth {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 실패
//		int len = scan.nextInt();
//		int total = 0;
//		char alphabet[] = new char[26];
//		int compare [] = new int [26];	
//		int num = 0;
//		for(char i = 'a'; i <= 'z'; i++) {
//			alphabet[num] = i;
//			compare[num] = 0;
//			num++;
//			
//		}
//		
//		for(int i = 0; i < len ; i++) {
//			String input = scan.next();
//			if(input.length() == 1) {
//				compare[0] = 1;
//			}
//			for(int index = 0; index < input.length() -1; index++) {
//				for(int j = 0; j < 26; j++) {
//					if(input.charAt(index) == alphabet[j]) {
//						compare[j]++;
//						if(input.charAt(index) == input.charAt(index + 1)) {
//							index++;
//						}
//					}
//				}
//				
//			}
//			
//			System.out.println(Arrays.toString(compare));
//			
//			int count = 0;
//			for(int k = 0; k < compare.length; k++) {
//				if(compare[k] != 0 && compare[k] != 1) {
//					count = 0;
//					break;
//				}else if (compare[k] == 1){
//					count++;
//				}
//			}
//			
//			if(count != 0) {
//				total++;
//				System.out.println(total);
//			}
//			
//			//초기화
//			for(int c = 0; c < compare.length; c++) {
//				compare[c] = 0;
//			}
//			
//		}
//		
//		
//		
//		System.out.println(total);
		
		
		
		

		String input = scan.next();
		boolean check = false;
		int count = 0;
		
		ArrayList<String> croa = new ArrayList<String>();
		croa.add("c=");
		croa.add("c-");
		croa.add("dz=");
		croa.add("d-");
		croa.add("lj");
		croa.add("nj");
		croa.add("s=");
		croa.add("z=");
		
		for(int i = 0; i < input.length(); i++) {
			for(int j = 0; j < croa.size(); j++) {
				if(input.charAt(i) == 'd' && i <= input.length() - 3) {
					if(input.charAt(i + 1) == croa.get(2).charAt(1) && 
						input.charAt(i + 2) == croa.get(2).charAt(2)) {
						i = i + 2;
						count++;
						check = true;
						break;
					}
				}
			if(i != input.length() - 1) {
				if(input.charAt(i) == croa.get(j).charAt(0) &&
					input.charAt(i + 1) == croa.get(j).charAt(1) && j!=2) {
					i++;
					count++;
					check = true;
					break;
				}
				
			}else{
                break;
            }	
				
				
			} if(!check){
                count++;
            }else{
                check = false;
            }
        }
        System.out.print(count);
//    
		
		
		
		
		
		
		
		
		
		
		
//		int A[] = {1,2,3,4};
//		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		arr.add(1);
//		arr.add(2);
//		arr.add(3);
//		arr.forEach((output) -> {System.out.println(output);});

		
//		for(int i = 0; i < len; i++) {
//			double average = 0;
//			double sum = 0;
//			double figure = scan.nextInt();
//			double[] arr = new double[(int) figure];			
//			for(int j = 0; j < figure; j++) {
//				int score = scan.nextInt();
//				sum = score + sum;
//				arr[j] = score;
//			}
//			average = sum / figure;
//			double avgSum = 0;
//			for(int k = 0; k < arr.length; k++) {
//				if(arr[k] > average) {
//					avgSum += 1;
//				}
//			}
//			double answer = (avgSum / figure) * 100;
//			System.out.println(String.format("%.3f", answer) + "%");
//						
//		}
		
		

		
//		String A = br.readLine().toUpperCase();
//		
//		char arr[] = new char[26]; 
//		int[] answer = new int[26];
//		for(char i = 'A'; i <= 'Z'; i++) {
//			arr[i - 65] = i;
//		}
//		
//		for(int i = 0 ; i < A.length(); i++) {
//			for(int j = 0; j < arr.length; j++) {
//				if(A.charAt(i) == arr[j]) {
//					answer[j] = answer[j] + 1;
//				}
//			}
//		}
//		
//		int Max = -1;
//		int temp = 0;
//				
//		for(int i = 0; i < answer.length; i++) {
//			if(answer[i] > Max) {
//				Max = answer[i];
//				temp = i;
//			}
//		}
//		
//		answer[temp] = 0;
//		
//		
//		for(int i = 0; i < answer.length; i++) {
//			if(A.length() == 1) {
//				System.out.println(arr[temp]);
//				break;
//			}
//			if(answer[i] == Max) {
//				System.out.println("?");
//				break;
//			}
//			if(i == answer.length - 1) {
//				System.out.println(arr[temp]);
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
		//팰린드롭 해답
//		Scanner sc = new Scanner(System.in);
//		
//		String str = sc.next();
//		int count = 0;
//		for(int i = 0, j = str.length() - 1; i < (str.length()) / 2; i++, j--) {			
//			if(str.charAt(i) == str.charAt(j)) {
//				count++;  // 같으면 count값 1씩 증가시킴
//			}else if(str.length() == 1) { // 길이가 1인 경우는 앞 뒤가 같기 때문에 1로 출력해줘야	
//				count = 1;
//			}else { //다르면 0 출력 후 반복문 종료
//				System.out.println("0");
//				break;
//			}
//		}
//		// 만약 모든 값이 문제가 없다면 1을 출력
//		if(count == (str.length())/2) {
//			System.out.print("1");      
//		}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		//팰린드롬  실패..
		
//		String input = br.readLine();
//		double A = input.length();
//		A = Math.round(A/2) - 1;
//		int count = 1;		
//		String[] compare1 = new String[(int) A];
//		String[] compare2 = new String[(int) A];
//		
//		
//		for(int i = 0; i < A; i++) {
//			compare1[i] = input.substring(i, i+1);
//		}
//		for(int i = 0; i < A; i++) {
//			compare2[i] = input.substring(((int)A) + i + 1, ((int)A) + i + 2);
//		}
//		
//		String temp = "";
//		for(int i = 0; i < A - 1; i++) {
//			temp = compare2[i];
//			compare2[i] = compare2[(int)A - i -1];
//			compare2[(int)A - i -1] = temp;
//		}
//				
//		for(int i = 0 ; i < A; i++) {
//			if((int)A == 0) {
//				count = 1;
//				break;
//			}
//			if(compare1[i].equals(compare2[i])){
//				count = 1;
//			}else {
//				count = 0;
//				break;
//			}
//		}
//		
//		System.out.println(count);

		
		
		
		
		
		
		

		
//		int len = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < len; i++) {
//			for(int k = 0; k < len - i - 1 ; k++) {
//				System.out.print(" ");				
//			}
//			for(int j = 0; j < 2 * i + 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i = 0; i < len - 1; i++) {
//			for(int k = 0; k < i + 1; k++) {
//				System.out.print(" ");				
//			}
//			for(int j = 0; j < (len - (i + 1)) * 2 - 1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
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

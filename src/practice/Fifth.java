package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Fifth {
	 public static void main(String[] args) throws Exception {
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	 }
}
	        
	        
//public class Fifth {
//	 public static void main(String[] args) throws Exception {	        
		 //ver2 answer
//	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//	        StringBuilder sb = new StringBuilder();
//
//	        String input = br.readLine();
//
//	        for(char i = 'a'; i <= 'z'; i++){
//	            sb.append(input.indexOf(i)).append(" ");
//	        }
//	        System.out.println("1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1");
//	        bw.write(sb.append("\n").toString());
//	        bw.flush();
//	        bw.close();
//	        br.close();
//	}
//}
	        
	        
	//ver1
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		ArrayList<String> arr = new ArrayList<String>();
//		ArrayList<String> del = new ArrayList<String>();
//		arr.add("a");
//		arr.add("b");
//		arr.add("c");
//		arr.add("d");
//		arr.add("e");
//		arr.add("f");
//		arr.add("g");
//		arr.add("h");
//		arr.add("i");
//		arr.add("j");
//		arr.add("k");
//		arr.add("l");
//		arr.add("m");
//		arr.add("n");
//		arr.add("o");
//		arr.add("p");
//		arr.add("q");
//		arr.add("r");
//		arr.add("s");
//		arr.add("t");
//		arr.add("u");
//		arr.add("v");
//		arr.add("w");
//		arr.add("x");
//		arr.add("y");
//		arr.add("z");
//
//		
//		int[] alphabet = new int [arr.size()];
//		
//		for(int i = 0; i < arr.size(); i++) {
//			alphabet[i] = -1;
//		}
//		
//		String S = br.readLine();
//		
//		for(int i = 0; i < S.length(); i++) {
//			for(int j = 0; j < arr.size(); j++) {
//				if(arr.get(j).equals(S.substring(i, i+1))) {
//					if(alphabet[j] == -1) {
//						alphabet[j] = i;						
//					}	
//				}
//				
//			}
//		}
//		
//		String answer = alphabet[alphabet.length - 1] + "";
//		for(int i = alphabet.length - 2; i >= 0; i--) {
//			answer = alphabet[i] + " " + answer;
//		}
//		System.out.println(answer);
		
		
		
		
//		double len = Integer.parseInt(br.readLine());
//		String num = (br.readLine());
//		
//		ArrayList<String> arr = new ArrayList<String>();
//		
//		int sum = 0;
//		
//		
//		
//		for(int i = 0; i < len; i++) {
//			arr.add(num.substring(i, i+1));
//			sum = (sum + Integer.parseInt(arr.get(i)));
//		}
//		System.out.println(sum);
//	}
//
//}

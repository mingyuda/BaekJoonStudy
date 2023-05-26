package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Fifth {
	 public static void main(String[] args) throws Exception {
		 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int A = Integer.parseInt(st.nextToken()); 
	        int B = Integer.parseInt(st.nextToken()); 
	        
	        //int에서 String으로
	        String[] arr = new String[3];
	        for(int i = 0; i < 3 ; i++) {
	        	String temp = "";
	        	temp = A % 10 + temp;
	        	arr[i] = temp;
	        	A = A / 10;
	        }
	        String[] arr2 = new String[3];
	        for(int i = 0; i < 3 ; i++) {
	        	String temp = "";
	        	temp = B % 10 + temp;
	        	arr2[i] = temp;
	        	B = B / 10;
	        }
	        

	        //Sting에서 Array로
	        String AS = new String();
	        for(int i = arr.length - 1; i >= 0; i--) {
	        	AS = arr[i] + AS;
	        }
	        
	        String BS = new String();
	        for(int i = arr.length - 1; i >= 0; i--) {
	        	BS = arr2[i] + BS;
	        }
	       
	        A = Integer.parseInt(AS);
	        B = Integer.parseInt(BS);
	        if(A > B) {
	        	System.out.println(A);
	        }else {
	        	System.out.println(B);
	        }
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
//	        int count = 1;
//	        String sentence = br.readLine();
//	        ArrayList<String> set = new ArrayList<String>();
//	        for(int i = 0; i < sentence.length(); i++) {
//	        	set.add(sentence.substring(i,i+1));
//	        }
//	        System.out.println(set);
//	        
//	        for(int i = 0; i < set.size(); i++) {
//	        	if(set.get(i).equals(" ") && i == 0) {
//	        	}else if(set.get(i).equals(" ")) {
//	        		count++;
//	        	}
//	        	
//	        	if(i == (set.size() - 1) && set.get(i).equals(" ")) {
//	        		count--;
//	        	}
//	        	
//	        	
//	        }
//	        System.out.println(count);
	        
	        
	        
	        
//
//	        int len = Integer.parseInt(br.readLine());
//	        
//	        for(int i = 0; i < len; i++) {
//	        	StringTokenizer st = new StringTokenizer(br.readLine());
//
//	        	int A = Integer.parseInt(st.nextToken());
//	        	String B = st.nextToken();
//	        	
//	        	for(int j = 0; j < B.length(); j++) {
//	        		for(int k = 0; k < A; k++) {
//	        			System.out.print(B.substring(j, j+1));
//	        		}
//	        	}
//	        	System.out.println();
//	        }

	
	        
	        
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

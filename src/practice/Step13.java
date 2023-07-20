package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step13{
   public static void main(String[] args) throws IOException {
	   
	   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	   StringTokenizer st =new StringTokenizer(br.readLine()," ");
	   StringBuilder sb =new StringBuilder(); 	                      

	   String a = st.nextToken();                                      
	   String b = st.nextToken();                                       
	   
	   int start = Integer.parseInt(a);                                   
	   int end = Integer.parseInt(b);                                     
       
       boolean[] list=new boolean[end+1];           
       list[0]=true;                               
       list[1]=true;                       
	   for(int i = 2;i <= Math.sqrt(end+1); i++){   
           for(int j = i * i; j < end + 1; j += i) {
        	   list[j]=true;  
           }
       }	   
	   for(int i=start;i<=end;i++) {
           if(list[i]==false) sb.append(i).append('\n');   
	   }                                                   
	   System.out.println(sb);                             



		
		
		
		
		
		
		
//		for(int i = Min; i < Max; i++) {
//			int k = 1;
//			for(int j = 2; j < i; j++) {
//				if(i % j == 0) {
//					k = 0;
//				}
//			}
//			if(k == 1) {
//				sb.append(i + "\n");
//			}
//			
//		}
//		
//		System.out.println(sb);
		
	}
}

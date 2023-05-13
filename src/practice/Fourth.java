package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fourth {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int [t];
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 위치에 따라 에러 메세지가 뜨네 
		int search = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] == search) {
				count++;
			}
		}
		System.out.println(count);
	}
}

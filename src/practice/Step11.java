package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Step11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		String input = (br.readLine());
		
		for(int i = 0; i < input.length(); i++) {
			arr.add(Integer.parseInt(input.substring(i, i + 1)));
		}
		
		Collections.sort(arr);
		
		Collections.reverse(arr);
		
		StringBuilder stringBuilder = new StringBuilder();
		for(int value : arr) {
			stringBuilder.append(value);
        }
		
		System.out.println(stringBuilder);
	}

}

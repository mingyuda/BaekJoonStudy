package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Step11 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int len = Integer.parseInt(br.readLine());
		
		String arr[] = new String [len];
		
		for(int i = 0; i < len; i++) {
			arr[i] = (br.readLine());
			
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				else {
					return o1.length() - o2.length();
				}
			}
			
		});
		
		
//		System.out.println(Arrays.deepToString(arr));
		
		for(int j = 1; j < len; j++) {
            if(!arr[j-1].equals(arr[j])) {
                System.out.println(arr[j-1]);
            }
        }
		if(len != 1) {
			if(arr[len-2] != arr[len-1]){ 
				System.out.println(arr[len-1]); 
			}	
		}else {
			System.out.println(arr[0]);
		}
		
	}
}
//	static int N, x, y;
//	static StringBuilder sb = new StringBuilder();
//        N = Integer.parseInt(br.readLine());
//
//        Point[] points = new Point[N];
//        for (int i = 0; i < N; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            x = Integer.parseInt(st.nextToken());
//            y = Integer.parseInt(st.nextToken());
//            points[i] = new Point(x, y);
//        }
//        Arrays.sort(points);
//        for (Point p : points) {
//            sb.append(p.x).append(" ").append(p.y).append("\n");
//        }
//        System.out.println(sb.toString());
//
//    }
//}
//class Point implements Comparable<Point>{
//    int x;
//    int y;
//
//    public Point(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    @Override
//    public int compareTo(Point o) {
//        if(this.y == o.y) {
//            return this.x - o.x;
//        }
//        return this.y - o.y;
//    }
//
//}
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
//		정렬 문제 시간초과..		
//		int len = Integer.parseInt(br.readLine());
//		int [][]arr = new int [len][2];
//		
//		for(int i = 0; i < len; i++) {
//			//변수를 여기에서 같이 넣어줌
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			int input = Integer.parseInt(st.nextToken());
//			int input2 = Integer.parseInt(st.nextToken());
//
//			arr[i][0] = input;
//
//			for(int j = 0; j <= 1; j++) {
//				arr[i][1] = input2;
//			}
//			
//		}
//		
////		System.out.println(Arrays.deepToString(arr));
//		
//		for(int j = 0; j < len; j++) {
//			for(int i = 0; i < len-1; i++) {
//				int temp1 = 0;
//				int temp2 = 0;
//				if(arr[i][0] > arr[i+1][0]) {
//					temp1 = arr[i][0];
//					temp2 = arr[i][1];
//					arr[i][0] = arr[i+1][0];
//					arr[i][1] = arr[i+1][1];
//					arr[i+1][0] = temp1;
//					arr[i+1][1] = temp2;
//					
//					
//				}else if(arr[i][0] == arr[i+1][0]) {
//					if(arr[i][1] > arr[i+1][1]) {
//						temp1 = arr[i][0];
//						temp2 = arr[i][1];
//						arr[i][0] = arr[i+1][0];
//						arr[i][1] = arr[i+1][1];
//						arr[i+1][0] = temp1;
//						arr[i+1][1] = temp2;
//					}
//				}
//				
//			}
//		}
//		
////		System.out.println(Arrays.deepToString(arr));
//		
////		StringBuilder sb = new StringBuilder();
//		for(int i = 0; i < len; i++) {
//			bw.write(arr[i][0] + " " + arr[i][1] + "\n");
//			
//		}
//		
//		bw.flush();
		
		
		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		String input = (br.readLine());
//		
//		for(int i = 0; i < input.length(); i++) {
//			arr.add(Integer.parseInt(input.substring(i, i + 1)));
//		}
//		
//		Collections.sort(arr);
//		
//		Collections.reverse(arr);
//		
//		StringBuilder stringBuilder = new StringBuilder();
//		for(int value : arr) {
//			stringBuilder.append(value);
//        }
//		
//		System.out.println(stringBuilder);
//	}
//
//}

package practice;

import java.io.*;
import java.util.*;

public class Step15_2 {

    static HashMap<String, Integer> map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = Integer.parseInt(st.nextToken());
        int letterLen = Integer.parseInt(st.nextToken());
        
        map = new HashMap<>();
        
        for (int i = 0; i < len; i++) {
            String input = br.readLine();
            if (input.length() >= letterLen) {
            	// 개수 셀때 사용
            	// 키가 input, 벨류를 삽입
                map.put(input, map.getOrDefault(input, 0) + 1);
            }
        }
//        System.out.println(map);
        String[] words = new String[map.size()];
        int index = 0;
        for (String s : map.keySet()) {
            words[index++] = s;
        }
        
//        System.out.println(Arrays.toString(words));
        
        Arrays.sort(words, (String o1, String o2) -> {
           if(map.get(o1) > map.get(o2)) { // 자주 나온단어 우선
               return -1;
           } else if (map.get(o1) < map.get(o2)) {
               return 1;
           } else {		// 빈도가 같을 때 길이를 비교
               if (o1.length() > o2.length()) { // 길이 긴 단어
                   return -1;
               } else if (o1.length() < o2.length()) {
                   return 1;
               } else { // 길이가 같을 때 알파벳 순으로
                   int idx = 0;
                   while (idx < o1.length() && o1.charAt(idx) == o2.charAt(idx)) {
                       idx++;
                   }
                   return o1.charAt(idx) - o2.charAt(idx);
               }
           }
        });
        StringBuilder sb = new StringBuilder();
        for (String s : words) {
           sb.append(s + "\n");
        }
        System.out.println(sb);
    }
}
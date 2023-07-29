package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Step15_3 {
    public static class Word {
        String word;
        int cnt;
        int length;

        public Word(String word, int cnt, int length) {
            this.word = word;
            this.cnt = cnt;
            this.length = length;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        ArrayList<Word> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.length() < M) {
                continue;
            }
            // 이미 키가 있다면
            if (map.containsKey(str)) {
                int x = map.get(str);
                // 같은 키의 벨류에 더하기 1(덮어쓰기)
                map.put(str, x + 1);
            } else {
                map.put(str, 1);
            }
        }
        
//        System.out.println(map);
        
        // ArrayList에 생성한 객체를 넣어줌
        for (String str : map.keySet()) {
        	// 키, 키의 반복 횟수, 키의 길이
            list.add(new Word(str, map.get(str), str.length()));
        }
        
       
        
        list.sort(new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                if (o1.cnt == o2.cnt) {
                    if (o1.length == o2.length) {
                    	// 숫자값을 비교하여 같으면 0, o1이 크면 1, o2가 크면 -1 이지만
                    	// 아예 다른 값을 가지므로 비교 불가능한 지점에서 아스키 값을 반환
                        return o1.word.compareTo(o2.word);
                    }
                    //내림차순
                    return o2.length - o1.length;
                }
                else {
                    return o2.cnt - o1.cnt;
                }
            } 
        });
        
//        System.out.println(list.get(0).word); // list의 0번째 객체의 String 값을 가지는 word를 출력
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).word + "\n");
        }
        System.out.println(sb);
    }
}



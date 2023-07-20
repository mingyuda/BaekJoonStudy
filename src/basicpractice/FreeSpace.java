package basicpractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FreeSpace {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            long primeNumber = Long.parseLong(br.readLine());
            boolean isPrime = false;
            if(primeNumber <= 2 ) {
                sb.append(2 + "\n");
                continue;
            }
            if(primeNumber == 3) {
                sb.append(3 + "\n");
                continue;
            }
            while(!isPrime) {
                for (long j = 2; j <= Math.sqrt(primeNumber); j++) {
                    if(primeNumber % j != 0) isPrime = true;
                    else {
                        primeNumber++;
                        isPrime = false;
                        break;
                    }
                }
            }
            sb.append(primeNumber + "\n");
        }
        System.out.println(sb);
    }

}

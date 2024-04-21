import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // N K 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        boolean [] primeNum = new boolean[N+1];

        for (int i = 2; i <= N; i++) {
            primeNum[i] = true;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = i; j <= N; j += i) {
                if (!primeNum[j]) {
                    continue;
                }
                primeNum[j] = false;
                count++;
                if (count == K) {
                    System.out.print(j);
                    System.exit(0);
                }
            }
        }
    }
}

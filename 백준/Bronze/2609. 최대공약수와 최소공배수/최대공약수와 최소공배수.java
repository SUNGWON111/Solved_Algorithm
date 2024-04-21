import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        //두개의 자연수 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[2];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 2; i++){
            arr[i] = Integer.parseInt((st.nextToken()));
        }

        ArrayList<Integer> div = new ArrayList<>();
        Arrays.sort(arr);

        int min = arr[0];

        for (int i = 1; i <= min; i++) {
            boolean flag = true;
            for (int t = 0; t < 2; t++) {
                if( arr[t] % i != 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                div.add(i);
            }
        }
        int div_max = div.get(0);

        for (int i = 0; i < div.size(); i++) {
          if ( div_max < div.get(i) ) {
              div_max = div.get(i);
          }
        }
        int lcm = div_max;
        for (int i = 0; i < arr.length; i++) {
            lcm *= (arr[i] / div_max) ;
        }
        System.out.println(div_max);
        System.out.print(lcm);
        //첫줄 최대공양구 출력, 둘째 줄 최소공배수 출력
        // 최소공배수: 최대공약수 * 최대공약수로 나눈 몫들
        // 최대공약수: 입력받은 수의 작은수 제곱근 보다 작은 수로 나누고 나누는 수와 몫을 저장
    }
}

import java.util.*;
import java.io.*;

public class Main { //최소공배수 구하기
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n 입력 받기
        int n = Integer.parseInt(br.readLine());

        // 공약수 리스트 선언, 초기화 필요
        ArrayList<Integer> div = new ArrayList<>();

        // n개의 최소공배수를 저장항 리스트 선언
        ArrayList<Integer> lcm = new ArrayList<>();

        // n번 만클 실행되는 수 입력 받기, 최대 공약수 구하기, 최소 공배수 구하기
        for (int i = 1; i <= n; i++) { // 자연수 입력 받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int [] arr = new int[2];
            div.clear(); // 횟수가 하나씩 증가 할 때 마다 초기화 시켜 줘야한다
            for (int j = 0; j < 2; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr); // 입력 받은 수 작은 순으로 정렬

            for (int j = 1; j <= arr[0]; j++ ) { //공약수 찾기
                boolean flag = true;
                for( int k = 0; k < 2; k++) {
                    if ( arr[k] % j != 0 ) {
                        flag = false;
                        break;
                    }
                }
                if ( flag ) { // 공약수 저장
                    div.add(j);
                }
            }
            //System.out.println(div); 저장된 공약수 확인( 1번의 횟수 공약수들만 있어야함)

            // 최대공약수 찾기
            int div_max = 0;
            for (int k = 0; k < div.size(); k++) {
                if (div_max < div.get(k)) {
                    div_max = div.get(k);
                }
            }
            //System.out.println(div_max); 최대공약수 확인
            // 최소공배수 구하기( 최대공약수 * (각 수들을 최대공약수로 나눈 몫들)
            lcm.add(div_max * (arr[0] / div_max) * (arr[1] / div_max));
            //System.out.println(lcm); 누적된 최소공배수 확인( 전체가 누적 되어야함)
        }
        for (int t = 0; t < n; t++) { // 최소공배수 하나씩 출력
            System.out.println(lcm.get(t));
        }
    }
}

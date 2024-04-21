import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 정수 N출력 받기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;
        // N의 제곱근보다 작은수로 나눈다
        for ( int i = 2; i <= num;) {
            if ( num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
            else {
                i++;
            }
        }
        /*
        if (num < 4 && num > 1) {
            System.out.print(num);
        }*/
    }
}

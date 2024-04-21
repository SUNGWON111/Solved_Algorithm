import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if ( N == 1) {
            System.out.print(2);
            return;
        }
        for (int i = N; ; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                String s1 = String.valueOf(i);
                StringBuffer sb = new StringBuffer(s1);
                String palindrom = sb.reverse().toString();
                if (s1.equals(palindrom)) {
                    System.out.print(s1);
                    return;
                }
            }
        }
    }
}

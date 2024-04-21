import java.sql.SQLOutput;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] N = new int[size];

        for (int i = 0; i < size; i++) {
            N[i] = scanner.nextInt();
        }
        int count = 0;
        for (int k = 0; k < size; k++) {
            boolean isPrime = true;
            if (N[k] < 2){
                isPrime = false;
            }
            for (int j = 2; j <= Math.sqrt(N[k]); j++){
                if (N[k] % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                count += 1;
            }
        }
        System.out.print(count);
    }
}

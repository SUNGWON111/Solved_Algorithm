//https://www.acmicpc.net/problem/2581
import  java.util.*;

public class Main {
    // M, N 입력 받기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int primeSum = 0;
        ArrayList<Integer> primeMin = new ArrayList<>();
        // M <= X <= N 의 소수 찾기
        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            }
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeSum += i;
                primeMin.add(i);
            }
        }
        // 소수가 없으면 -1 출력
        if (primeSum == 0){
            System.out.print(-1);
        }
        // 소수 합 구하기
        // 소수가 나올 때 마다 대소 관계 비교해 최솟값 찾기
        else {
            System.out.println(primeSum);
            System.out.print(primeMin.get(0));
        }
    }
}
/*Q. scanner.nextLine();으로 여래개을 정수 문자열을 입력 받아
Inteager.parseInt로 변환 하면 어떻게 되는가 */
/* ArrayList 사용 이유 
    1. 사이즈를 따로 지정하지 않아도 돼 코드를 좀 더 간단하게 짤 수 있다
    2. 소수의 최솟값을 구할 때 난 시작값부터 1씩 증가하기에 최솟값은 0번째 인데스에 저장 되는데
    Arraylist.add메소드를 사용하여 쉽게 값을 순서대로 추가 할 수 있어 코드를 보다 가독성 좋게 작성 할 수 있었다.
    3. List의 사이즈 지정을 따로 하지 않아도 되는 장점과 Array의 인덱스 접근을 사용 할 수 있어 사용!
 */

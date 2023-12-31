package 집주소문제;
// 숫자를 입력
// 해당 숫자의 몇 칸을 차지하는지를 출력하는 문제
// 0을 입력하면 종료
import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        // 각 숫자가 차지하는 자리수를 배열로 만들기
        int[] numSize = {4, 2, 3, 3, 3, 3, 3, 3, 3, 3};
        int sum = 0; // 입력받은 수가 차지하는 총 자리수
        Scanner sc = new Scanner(System.in);
        while (true) {
            String number = sc.next();
            if(number.equals("0")) break; // 0이 입력되면 끝남
            for(int i = 0; i < number.length(); i++) {
                sum += numSize[number.charAt(i) - '0'] + 1;
            }
            System.out.println(sum + 1); // 1을 더하는 이유는 처음 공백을 더해줌
            sum = 0; // 다음 계산을 위해 sum 변수를 초기화
        }
    }
}

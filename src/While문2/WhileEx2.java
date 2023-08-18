package While문2;

import java.util.Scanner;

// 반복 횟수를 알 수 없는 경우에 대한 예제
// do ~ while
public class WhileEx2 {
    public static void main(String[] args) {
        int age; // 나이를 입력 받는 변수
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력 하세요 : ");
            age = sc.nextInt();
//        Scanner sc = new Scanner(System.in);
//        while (true) { // 무한의 횟수를 반복하기 위해 조건식을 참으로 만듦 (반드시 탈출문이 필요)
//            System.out.println("나이를 입력 하세요 : ");
//            age = sc.nextInt();
//            if (age > 0 && age < 200) break; // 1~199 사이만 정상적으로 입력된 나이로 간주
//            System.out.println("나이를 잘 못 입력하셨습니다. ");
//        }
        do {

        } while (age <= 0 || age >= 200);
        System.out.println("입력하신 나이는 " + age + "입니다.");
    }
}

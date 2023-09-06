package 나머지;

import java.util.Scanner;

public class Plus {
    public static void main(String[] args) {
        int[] arr = new int[42];
        int input; // 입력 받은 값
        int cnt = 0; // 42로 나눈 나머지가 다른 경우에 대한 총 횟수
        Scanner sc = new Scanner(System.in);
        System.out.println("10개의 숫자 입력.");
        for(int i = 0; i < 10; i++) {
            input = sc.nextInt();
            arr[input % 42] = 1; // 입력받은 값을 42로 나눈 나머지에 해당하는 인덱스에 1을 대입
        }
        for(int val : arr) cnt += val;
        System.out.println(cnt);
    }
}

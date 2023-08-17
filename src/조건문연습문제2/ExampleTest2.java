package 조건문연습문제2;

import java.util.Scanner;

public class ExampleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수 입력 : ");
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;

        if(a>b) {
            if(a > c) System.out.println(a);
            System.out.println(c);
        }
        else {
            if(b > c) System.out.println(b);
            else System.out.println(c);
        }

//        if(a >= b && a > c){
//            System.out.println(a);
//        }
//        else if(b > a && b >= c ) {
//            System.out.println(b);
//        }
//        else if(c > b && c >= a) {
//            System.out.println(c);
//        }
//        else {
//            System.out.println("세 숫자는 모두 같습니다.");
//        }

    }
}

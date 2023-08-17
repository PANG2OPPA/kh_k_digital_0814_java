package 조건문연습문제1;

import java.util.Scanner;

public class ExampleTest1 {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num < 0 || num > 100) continue;
            if (num >= 90) System.out.println("A");
            else if (num >= 80) System.out.println("B");
            else if (num >= 70) System.out.println("C");
            else if (num >= 60) System.out.println("D");
            else System.out.println("F");
            break;
        }
//        if(num >= 90 && num <= 100){
//            System.out.println(num + "점은 A입니다.");
//        }
//        else if(num >= 80 && num <= 89) {
//            System.out.println(num + "점은 B입니다.");
//        }
//        else if(num >= 70 && num <= 79) {
//            System.out.println(num + "점은 C입니다.");
//        }
//        else if(num >= 60 && num <= 69) {
//            System.out.println(num + "점은 D입니다.");
//        }
//        else if(num >= 0 && num <= 59) {
//            System.out.println(num + "점은 F입니다.");
//        }
//        else {
//            System.out.println("성적이 잘못 입력되었습니다.");
//    }
        }
    }


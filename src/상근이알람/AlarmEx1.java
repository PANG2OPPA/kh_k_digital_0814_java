package 상근이알람;

import java.util.Scanner;

public class AlarmEx1 {
    public static void main(String[] args) {
        // 시간과 분을 입력 받기 위한 스캐너 생성
        Scanner sc = new Scanner(System.in);
        // 시간과 분을 각각 입력 받음
        System.out.print("시간 분 입력 : ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        // 45분을 빼야 되므로 시간과 분을 총 몇 분인 환산하고 거기서 45를 빼줌
        int totalMin = hour * 60 + min;
        // 계산된 시간이 45분 보다 작으면 하루 전날 이므로 하루의 시간 만큼 더해줌
        if (totalMin < 45) {
            totalMin = 24 * 60 + totalMin;
        }
        // 계산된 시간에서 45를 빼줌
        totalMin -= 45;
        // 결과를 시간과 분으로 환산해서 출력 해줌(몫과 나머지 계산으로 구함)
        System.out.println((totalMin / 60) + " 시 " + (totalMin % 60) + " 분 ");

//        int hour, min;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("시간 입력 : ");
//        hour = sc.nextInt();
//        min = sc.nextInt();
//
//        if (min >= 45){
//            min -= 45;
//        } else {
//            min = 60 - (45 - min);
//            if (hour == 0) {
//                hour = 23;
//            } else {
//                hour--;
//            }
//        }
//        System.out.println(hour + " " + min);

        }

    }


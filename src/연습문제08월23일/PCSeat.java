package 연습문제08월23일;
// 인원 수
// 예약할 좌석 번호 100개
// 결과는 거절 횟수 출력

import java.util.Scanner;

public class PCSeat {
    public static void main(String[] args) {
        int[] pc = new int[100];
        int rejectCnt = 0, seatNum;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            seatNum = sc.nextInt();
            if(pc[seatNum-1] == 1) rejectCnt++;
            else pc[seatNum-1] =1;
        }
        System.out.println(rejectCnt);

    }
}

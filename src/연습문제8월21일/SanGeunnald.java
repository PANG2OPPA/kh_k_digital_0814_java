package 연습문제8월21일;

import java.util.Scanner;

public class SanGeunnald {
    public static void main(String[] args) {
        // 5개의 값을 입력 받기 위해 배열 생성
        int[] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i < menu.length; i++) menu[i] = sc.nextInt(); // 햄버거 3개, 음료 2개 금액을 입력 받음
        int minBurger = menu[0]; // 햄버거 중에 제일 싼 메뉴를 찾기 위한 시작 값
        int minDrink = menu[3]; // 음료 중 제일 싼 메뉴를 찾기 위한 시작 값
        for(int i = 0; i < menu.length; i++) {
            if(i < 3 && minBurger > menu[i]) minBurger = menu[i];
            if(i > 2 && minDrink > menu [i]) minDrink = menu[i];
        }
        System.out.println(minBurger + minDrink - 50);


    }
}

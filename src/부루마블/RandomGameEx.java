package 부루마블;

public class RandomGameEx {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0; // 몇번만에 탈출했는지 숫자 세기
        while(true){
            cnt++;
            rand1 = (int) ((Math.random() * 6) +1);
            rand2 = (int) ((Math.random() * 6) +1);
            if((rand1 + rand2) == 12){
                System.out.printf("무인도를 %d번 만에 탈출했습니다.\n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "입니다.");
            }
        }
    }
}

package ForEx1;

// for(조기식;조건식;증강식) { 참인 동안 수행되는 구문 }
// 주로 정해진 횟수를 반복하는 경우에 사용된다.
public class ForEx1 {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            System.out.printf("%4d", i);
            if(i % 10 == 0) System.out.println();
        }

//        int i = 1;
//        while (true) {
//            System.out.printf("%4d", i);
//            if(i % 10 == 0) System.out.println();
//            i++;
//            if(i > 100) break;
//        }
    }
}

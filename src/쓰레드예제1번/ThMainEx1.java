package 쓰레드예제1번;
// 하나의 프로그램 내에서 여러가지 일을 동시에 수행하는 것
public class ThMainEx1 {
    public static void main(String[] args) {
        Thread testTh = new CustomThread();
        testTh.start();

        Runnable runTask = new InterThread(); // 실제 작업내용을 가지고 있지만 실제 쓰레드는 아님
        Thread runTh1 = new Thread(runTask);
        runTh1.start();
        System.out.println("Main에서 찍어봅니다.");

    }
}
// 상속 받아서 쓰레드를 만드는 방법
class CustomThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("상속받은쓰레드 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);
    }
}
class InterThread implements Runnable {

    @Override
    public void run() {
        int sum = 0;
        for(int i = 0; i <= 10; i++) {
            sum += i;
            System.out.println("인터페이스 : " + sum);
        }
        System.out.println(Thread.currentThread() + "합 : " + sum);

    }
}

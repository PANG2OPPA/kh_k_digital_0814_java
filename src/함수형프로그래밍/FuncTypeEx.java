package 함수형프로그래밍;
// 함수형 프로그래밍은 자바 8에서 도압
// 자료 처리를 수학적 함수의 계산으로 취급하고 상태와 가변 데이터를 멀라=ㅣ하는 프로그램 페러다임

// 객체 지향 코드로 만들기
interface Calculator{
    int sum (int a, int b);
}
//class MyCalculator implements Calculator{
//
//    @Override
//    public int sum(int a, int b) {
//        return a + b;
//    }
//}

// 람다식으로 변환하기
public class FuncTypeEx {
    public static void main(String[] args) {
//        MyCalculator mc = new MyCalculator();
//        int result = mc.sum(10, 20);
        Calculator mc = (int a, int b) -> a + b;
        int result = mc.sum(10, 20);
        System.out.println(result);
    }
}

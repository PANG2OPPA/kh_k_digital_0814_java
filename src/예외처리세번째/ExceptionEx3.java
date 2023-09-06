package 예외처리세번째;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Test test = null;

        if (test != null) {
            String testStr = test.name;
            System.out.println(testStr);
        } else {
            System.out.println("NPE가 발생했습니다.");
        }
    }

    class Test {
        String name = "김현빈";
    }
}

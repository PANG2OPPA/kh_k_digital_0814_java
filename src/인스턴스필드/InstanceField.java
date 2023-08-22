package 인스턴스필드;

public class InstanceField {
    public static void main(String[] args) {
        int val = 30; // 지역 변수
        Field field1 = new Field();
        field1.instanceVal = 200; // 각각의 객체마다 값을 다르게 설정 할 수 있음
        Field field2 = new Field();
        field2.instanceVal = 300;

        Field.classval = 1000;

    }
}

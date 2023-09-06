package 열거타입2;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer developer = new Developer("김현빈", DevType.BIGDATA, Career.SENIOR, Gender.MALE);
        developer.devInfo();

    }
}

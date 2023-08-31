package 컴페어러블;
// Comparable과 Comparator는 클래스에 대한 정렬을 구현 할 수 있도록 해주는 인터페이스
import java.util.TreeSet;

public class ComparableEx {
    public static void main(String[] args) {
        TreeSet<CarComp> list = new TreeSet<>();
        list.add(new CarComp("싼타페", 2016, "흰색"));
        list.add(new CarComp("아반떼", 2010, "검색"));
        list.add(new CarComp("쏘렌토", 2011, "주황색"));
        list.add(new CarComp("코나", 2016, "황색"));
        list.add(new CarComp("셀토스", 2018, "똥색"));

        for (CarComp e : list) {
            System.out.println("이름 : " + e.modelName);
            System.out.println("연식 : " + e.modelYear);
            System.out.println("색상 : " + e.color);
            System.out.println("-".repeat(25));
        }
    }
}

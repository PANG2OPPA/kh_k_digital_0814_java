package 학생성적정렬;

import 컴페어레이터.Fruit;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

// 5명의 학생에 대해 이름과 성적을 입력받고 성적이 높은 사람 순으로 정렬하고 성적이 같으면 이름순 정렬
public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<Student> set = new TreeSet<>(new Sort());
//        Scanner sc = new Scanner(System.in);
        set.add(new Student("김현빈", 100));
        set.add(new Student("손인천", 89));
        set.add(new Student("이재성", 85));
        set.add(new Student("정벼리", 96));
        set.add(new Student("이재원", 96));

        for(Student e : set) {
            System.out.println("이름 : " + e.name + ", 성적 : " + e.score);
        }

    }
}

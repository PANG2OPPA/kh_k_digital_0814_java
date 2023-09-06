package 학생성적정렬;

import java.util.Comparator;

public class Sort implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        if (s1.score != s2.score) { // 성적이 다른 경우
            return Integer.compare(s2.score, s1.score); // 내림차순 정렬
        } else { // 성적이 같은 경우 이름순 정렬
            return s1.name.compareTo(s2.name);
        }
    }
}

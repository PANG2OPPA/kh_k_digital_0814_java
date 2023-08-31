package 학생성적정렬답;

import java.util.TreeSet;

public class StudentSortEx {
    public static void main(String[] args) {
        TreeSet<StudentInfo> info = new TreeSet<>();
        info.add(new StudentInfo("김현빈", 85));
        info.add(new StudentInfo("손인천", 100));
        info.add(new StudentInfo("이재성", 85));
        info.add(new StudentInfo("정벼리", 81));
        info.add(new StudentInfo("이재원", 84));
        for(StudentInfo e : info) {
            System.out.print(e.name + " ");
        }

    }
}
class StudentInfo implements Comparable<StudentInfo> {
    String name;
    int score;

    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.score < o.score) return 1; // 내림차순 정렬
        else { // 성적이 같은 경우 이름순 정렬
            if (this.score == o.score) {
                return this.name.compareTo(o.name);
            }
            return -1;
        }
    }
}

package chap99_homework.homework12;

public class Student {
    //      1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
    private int sno;
    private String sname;
    private String major;

    public void saveStudentInfo(int sno, String sname, String major) {
        this.sno = sno;
        this.sname = sname;
        this.major = major;
    }

    public void printStudentInfo() {
        System.out.println("학번: " + this.sno);
        System.out.println("이름: " + this.sname);
        System.out.println("학과: " + this.major);
    }
}

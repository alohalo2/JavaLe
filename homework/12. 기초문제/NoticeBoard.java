package chap99_homework.homework12;

public class NoticeBoard implements Board {

    @Override
    public void post() {
        System.out.println("공지사항을 등록합니다.");
    }

    @Override
    public void modify() {
        System.out.println("공지사항을 수정합니다.");
    }

    @Override
    public void delete() {
        System.out.println("공지사항을 삭제합니다.");
    }

    @Override
    public void get() {
        System.out.println("공지사항을 조회합니다.");
    }
}

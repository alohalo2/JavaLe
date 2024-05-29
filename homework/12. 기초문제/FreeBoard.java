package chap99_homework.homework12;

public class FreeBoard implements Board {
    @Override
    public void post() {
        System.out.println("자유 게시판에 글을 등록합니다.");
    }

    @Override
    public void modify() {
        System.out.println("자유 게시판의 글을 수정합니다.");
    }

    @Override
    public void delete() {
        System.out.println("자유 게시판의 글을 삭제합니다.");
    }

    @Override
    public void get() {
        System.out.println("자유 게시판의 게시글을 조회합니다.");
    }
}

package chap12_interface.board;

// 인터페이스의 상속은 extends 키워드가 아니라 implements 키워드를 이용한다.
public class FreeBoard implements Board {

	@Override
	public void post() {
		
		System.out.println("자유게시판 게시글 등록");
	}

	@Override
	public void modify() {
		
		System.out.println("자유게시판 게시글 수정");
	}

	@Override
	public void delete() {
		
		System.out.println("자유게시판 게시글 삭제");
	}

}

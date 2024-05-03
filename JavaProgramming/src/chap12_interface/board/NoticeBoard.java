package chap12_interface.board;

public class NoticeBoard implements Board {

	@Override
	public void post() {
		
		System.out.println("공지사항 게시글 등록");

	}

	@Override
	public void modify() {
		
		System.out.println("공지사항 게시글 수정");
	}

	@Override
	public void delete() {
		
		System.out.println("공지사항 게시글 삭제");
	}

}

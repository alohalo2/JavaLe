package chap19_generic.board;

public class BoardFile <T> {

	private int boardNo;
	private String fileName;
	private T type;
	
	
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getType() {
		return type.getClass().getSimpleName();
	}
	public void setType(T type) {
//		type.getFreeBoardNo(); // T의 타입이 지정하지 않아 Object에 있는 메소드만 사용할 수 있음
		this.type = type;
	}
	
	
	@Override
	public String toString() {
		return "BoardFile [boardNo=" + boardNo + ", fileName=" + fileName + ", type=" + type.getClass().getSimpleName() + "]";
	}
	
	
}

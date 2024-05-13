package chap19_generic;

import chap19_generic.board.BoardFile;
import chap19_generic.board.FreeBoard;

public class _03_GenericClassBoard {

	public static void main(String[] args) {
		
		BoardFile<FreeBoard> freeBoardFile = new BoardFile<>();
		
		freeBoardFile.setType(new FreeBoard(1, "자유게시판 제목1")); // set은 저장, get은 출력
		freeBoardFile.setFileName("자유게시판 첨부파일1");
		freeBoardFile.setBoardNo(1);
		
		System.out.println(freeBoardFile);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

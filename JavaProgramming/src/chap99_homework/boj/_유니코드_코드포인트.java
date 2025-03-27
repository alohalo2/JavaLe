package chap99_homework.boj;

public class _유니코드_코드포인트 {

	public static void main(String[] args) {
		
		// 유니코드는 코드포인트를 인코딩 값으로 하지 않고 UTF-8,UTF-16...
		// 과 같은 방법으로 인코딩한 값을 정한다.
		int cp1 = "한".codePointAt(0);
		System.out.println("한: " + Integer.toHexString(cp1).toUpperCase());
		
		int cp2 = "글".codePointAt(0);
		System.out.println("글: " + Integer.toHexString(cp2).toUpperCase());
		
	}
	
}

package chap99_homework.boj;

import java.io.UnsupportedEncodingException;

public class _부동소수점 {

	public static void main(String[] args) {

		// 부동소수점은 저장 방식으로 인하여 무한한 소수점값을 저장할 수 없어 일부
		// 소수점에서 끊어 저장되기 때문에 실수에서 오류가 생긴다, 오류를 방지하려면
		// 실수에서 정수로 연산 후 실수로 바꿔주는 전/후 과정이 필요하다.
		double a = 0.1;
		double b = 0.2;
		double c = 0.1;

		if(a + b == c) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		System.out.println(a + b);
		
	}

}

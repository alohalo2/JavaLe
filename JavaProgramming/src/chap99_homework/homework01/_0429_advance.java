package chap99_homework.homework01;

public class _0429_advance {

	public static void main(String[] args) {
		
		//1. 사용자가 입력한 금액을 오만원권, 만원권, 오천원권, 천원권, 500원동전, 100원동전, 50원동전, 10원동전, 1원동전 
		//각 몇개로 변환되는지 출력하세요. 출력 개수는 단위가 큰 것 순서로 계산합니다
		//예를 들어 78670원이면 <오만원 1매, 만원 2매, 오천원 1매, 천원 3매, 500원 1개, 100원 1개, 50원 1개, 10원 2개> 입니다.

		
		
		
		//2. 369게임을 작성합니다.
		//1~99까지의 정수를 입력받고
		//3,6,9중 하나가 있으면 "박수짝"을 출력하고
		//2개가 있으면 "박수짝짝"을 출력하세요
		//예를 들어 13은 "박수짝"
		//36인 경우는 "박수짝짝"을 출력하면 됩니다.

		
		
		
		//3. 다음과 같이 출력하세요.
		//		    *
		//		   ***
		//		  *****
		//		 *******
		//		*********
		
		
		for(int m = 0; m < 5; m++) {
			for(int n = 1; n <= 9; n++) {

				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

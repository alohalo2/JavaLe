package chap07_class.game;

import java.util.Scanner;

public class Numbaseball2 {

	// 1. 컴퓨터가 0~9 까지 숫자중 랜덤한 값 3개를 배열에 저장(중복불가능)
	// 2. 사용자가 0~9 까지 숫자 세개 입력(중복불가능) 
	// 3. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 다르면 볼로 판단 
	// 4. 사용자가 입력한 숫자 중 컴퓨터가 가지고 있는 숫자와 같은 숫자면서 위치가 같으면 스트라이크로 판단 
	// com {1, 2, 3} user {1, 3, 5} ==> 1스트라이크 1볼
	// com {1, 2, 3} user {4, 5, 6} ==> 0스트라이크 0볼
	// com {1, 2, 3} user {2, 3, 1} ==> 0스트라이크 3볼
	// com {1, 2, 3} user {1, 2, 3} ==> 3스트라이크 아웃
	
	int strike = 0;
	int ball = 0;
	
	int[] com = new int[3];
	int[] user = new int[3];
	
	Scanner sc = new Scanner(System.in);
	
	public void start() {
		
		System.out.println("게임을 시작합니다.");
		// 컴퓨터가 랜덤한 값 3개를 배열에 저장
		for(int i = 0; i < com.length; i++) {
			com[i] = (int)(Math.random()*10);
			
			if(i > 0) { // 컴 중복 불가능
				for(int j = 0; j < i; j++) {
					if(com[i] == com[j]) {
						i--;
						break;
					}
				
				}
			}
		}
		// 사용자 입력값 3개를 배열에 저장
		while(true) {
			strike = 0;
			ball = 0;
			
			System.out.println("0~9까지 값을 입력하세요. 3스트라이크 시 종료");
			
			for(int i = 0; i < user.length; i++) {
				user[i] = sc.nextInt();
				
				if(user[i] < 0 || user[i] > 9) {
					System.out.println("잘못 누르셨습니다.");
					i--;
					continue;
				}
				
				if(i > 0) { // 사용자 중복 불가능
					for(int j = 0; j < i; j++) {
						if(user[i] == user[j]) {
							System.out.println("숫자가 중복 되었습니다, 다시 입력해주세요.");
							i--;
							break;
						}		
					}
				} 
			}
			
			// 사용자와 컴퓨터의 배열 비교
			for(int i = 0; i < user.length; i++) {
				for(int j = 0; j < com.length; j++) {
					if(user[i] == com[j]) {
						if(i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
				
			}		
			// 출력
			if (strike == 3) {
				System.out.println("3 스트라이크 아웃, 게임을 종료합니다.");
				break;
			} else {
				System.out.println(strike + "스트라이크" + ball + "볼");
			}	
		}
		
	}		
}
	
	
	
	
	
	
	
	
	
	


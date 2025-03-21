package chap06_method;

import java.util.Scanner;

import chap06_method.score.Score;

public class _05_Score {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		int studentCnt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		studentCnt = sc.nextInt();
		
		int[] scores = new int[studentCnt];
		
		System.out.println("점수를 입력하세요.");
		for(int i = 0; i < studentCnt; i++) {
			scores[i] = sc.nextInt();
		}
 
		System.out.println("점수의 총합은: " + score.getTotalScore(scores));
		System.out.println("점수의 평균은: " + score.getAvgScore(scores));
		
		sc.close();
		
	}

}

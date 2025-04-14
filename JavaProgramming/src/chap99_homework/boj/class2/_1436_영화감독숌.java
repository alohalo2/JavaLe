package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _1436_영화감독숌 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int userInput = Integer.parseInt(br.readLine());
			int count = 0;
	        int num = 666;

	        // 이 문제는 "666"이 포함되기만 하면 n번째 영화에 카운팅이 된다.
	        // 그래서 7을 입력하면 6660이 출력된다.
	        while (true) {
	            if (Integer.toString(num).contains("666")) {
	                count++;
	                if (count == userInput) {
	                    System.out.println(num);
	                    break;
	                }
	            }
	            num++;
	        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

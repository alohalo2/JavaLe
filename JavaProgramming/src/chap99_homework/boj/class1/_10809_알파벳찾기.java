package chap99_homework.boj.class1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _10809_알파벳찾기 {

	public static void main(String[] args) {

		// gpt 코드

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String userInput = br.readLine().toLowerCase();
			int[] resultArry = new int[26];
			Arrays.fill(resultArry, -1); // -1로 초기화

			// 첫 등장 위치 저장
			for (int i = 0; i < userInput.length(); i++) {
				int index = userInput.charAt(i) - 'a';
				if (resultArry[index] == -1)
					resultArry[index] = i;
			}

			// 출력 형식 맞추기 (마지막 공백 없음)
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < resultArry.length; i++) {
				sb.append(resultArry[i]);
				if (i < resultArry.length - 1)
					sb.append(" "); // 마지막 숫자 뒤 공백 제거
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 내 코드
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//			String userInput = br.readLine().toLowerCase();
//
//			int[] resultArry = new int[26];
//
//			// 배열 전체를 -1로 채움
//			Arrays.fill(resultArry, -1);
//
//			// userInput을 돌면서 ch - 'a'(알파벳의 인덱스)를
//			// index에 넣고 resultArry에 index 위치에 i값을 넣는다.
//			for (int i = 0; i < userInput.length(); i++) {
//				char ch = userInput.charAt(i);
//				int index = ch - 'a';
//
//				if (resultArry[index] == -1) {
//					resultArry[index] = i;
//				}
//			}
//
//			// resultArry 출력
//			for (int i : resultArry) {
//				System.out.print(i + " ");
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

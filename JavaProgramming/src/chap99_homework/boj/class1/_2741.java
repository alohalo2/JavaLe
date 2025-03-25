package chap99_homework.boj.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _2741 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int userInput = Integer.parseInt(br.readLine()); // 정수 입력받기

			for (int i = 1; i <= userInput; i++) { // 1부터 userInput까지 출력
				bw.write(i + "\n");
			}

			br.close();
			bw.flush();
			bw.close();

		} catch (Exception e) {
			e.printStackTrace(); // 예외 발생 시 로그 출력
		}

//		try {
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//			int userInput = Integer.parseInt(br.readLine());
//			int[] intArry = new int[userInput];
//
//			for (int i = 0; i < intArry.length; i++) {
//				intArry[i] = userInput - (userInput - i - 1);
//
//				if ((userInput - i) == 0)
//					break;
//
//			}
//
//			for (int i = 0; i < intArry.length; i++) {
//				bw.write(intArry[i] + "\n");
//			}
//
//			br.close();
//			bw.flush();
//			bw.close();
//
//		} catch (Exception e) {
//
//		}

	}

}

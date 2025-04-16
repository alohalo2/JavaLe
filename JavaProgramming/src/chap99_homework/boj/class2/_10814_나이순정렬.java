package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class _10814_나이순정렬 {

	public static void main(String[] args) {

		// List<String[]>의 값들에 정렬 기준을 잘 정리해 문제 해결
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			List<String[]> userInputList = new ArrayList<>();
			StringBuilder sb = new StringBuilder();

			int N = Integer.parseInt(br.readLine());

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				String[] userInput = new String[3];
				userInput[0] = st.nextToken();
				userInput[1] = st.nextToken();
				userInputList.add(userInput);
			}

			userInputList.sort(Comparator.comparingInt(strArry -> Integer.parseInt(strArry[0])));

			for (int i = 0; i < N; i++) {
				sb.append(userInputList.get(i)[0]).append(" ").append(userInputList.get(i)[1]).append("\n");
			}

			System.out.println(sb);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1018_체스판다시칠하기 {

	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int height = Integer.parseInt(st.nextToken());
			int width = Integer.parseInt(st.nextToken());
			String[][] wbArry = new String[height][width];

			// WB 문자 그대로 이차원 배열에 담기
			for (int i = 0; i < height; i++) {
				String[] lineWBArry = br.readLine().split("");
				for (int j = 0; j < width; j++) {
					wbArry[i][j] = lineWBArry[j];
				}
			}

			// 담은 이차원 배열 repaintCount메소드로 바꿔야 할 최소값 구하기
			// 체스판은 8*8이므로 입력값이 8*8을 넘어갈 수 있어서
			// width랑 height에서 8을 빼준다,
			// repaintCount 함수에 이차원 배열과 시작좌표 i,j를 보내준다.
			for (int i = 0; i <= height - 8; i++) {
				for (int j = 0; j <= width - 8; j++) {
					int repaint = repaintCount(wbArry, i, j);
					min = Math.min(min, repaint);
				}
			}

			System.out.println(min);

		} catch (Exception e) {
			e.printStackTrace();
		}

//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			int height = Integer.parseInt(st.nextToken());
//			int width = Integer.parseInt(st.nextToken());
//			String[][] wbArry = new String[height][width];
//			int count = 0;
//
//			for (int i = 0; i < height; i++) {
//				String[] lineWBArry = br.readLine().split("");
//				for (int j = 0; j < width; j++) {
//					wbArry[i][j] = lineWBArry[j];
//				}
//			}
//
//			for (int i = 0; i < height; i++) {
//				for (int j = 0; j < width; j++) {
//					if(i > 0 && j > 0) {
//						if (wbArry[i][j].equals(wbArry[i - 1][j]) && wbArry[i][j].equals(wbArry[i][j - 1])) {
//							count++;
//							if(wbArry[i][j].equals("W")) {
//								wbArry[i][j] = "B";
//							} else {
//								wbArry[i][j] = "W";
//							}
//						}
//					}
//				}
//			}
//
//			System.out.println(count);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

	public static int repaintCount(String[][] wbArry, int x, int y) {
		int count1 = 0; // 'W' 시작
		int count2 = 0; // 'B' 시작

		for (int i = x; i < x + 8; i++) {
			for (int j = y; j < y + 8; j++) {
				// B시작이면 기대값 W
				char expected1 = ((i + j) % 2 == 0) ? 'W' : 'B';
				// W시작이면 기대값 B
				char expected2 = ((i + j) % 2 == 0) ? 'B' : 'W';

				if (!wbArry[i][j].equals(String.valueOf(expected1)))
					count1++;
				if (!wbArry[i][j].equals(String.valueOf(expected2)))
					count2++;
			}
		}

		return Math.min(count1, count2);
	}
}

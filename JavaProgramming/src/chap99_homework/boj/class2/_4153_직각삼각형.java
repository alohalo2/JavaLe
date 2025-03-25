package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _4153_직각삼각형 {

	public static void main(String[] args) {

		// gpt 코드
		
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            while (true) {
                String[] input = br.readLine().split(" ");
                int a = Integer.parseInt(input[0]);
                int b = Integer.parseInt(input[1]);
                int c = Integer.parseInt(input[2]);

                if (a == 0 && b == 0 && c == 0) break;

                int max = Math.max(a, Math.max(b, c));
                int sumSq = a * a + b * b + c * c - max * max;

                System.out.println(max * max == sumSq ? "right" : "wrong");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
//		// 내 코드
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//
//			while (true) {
//
//				String[] userInput = br.readLine().split(" ");
//				int A = Integer.parseInt(userInput[0]);
//				int B = Integer.parseInt(userInput[1]);
//				int C = Integer.parseInt(userInput[2]);
//				int maxLength = 0, remainDiv = 0;
//
//				if (A == 0 && B == 0 && C == 0) {
//					break;
//				}
//
//				if (A < B) {
//					if (B < C) {
//						maxLength = C;
//						remainDiv = A * A + B * B;
//					} else {
//						maxLength = B;
//						remainDiv = A * A + C * C;
//					}
//				} else {
//					maxLength = A;
//					remainDiv = C * C + B * B;
//				}
//
//				if (maxLength * maxLength == remainDiv) {
//					System.out.println("right");
//				} else {
//					System.out.println("wrong");
//				}
//
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _30802_웰컴키트 {

	public static void main(String[] args) {

		// gpt 코드
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            String[] tSizes = br.readLine().split(" ");
            String[] tp = br.readLine().split(" ");
            int T = Integer.parseInt(tp[0]);
            int P = Integer.parseInt(tp[1]);

            int totalPacks = 0;
            for (String size : tSizes) {
                int count = Integer.parseInt(size);
                // (a + b - 1) / b는 정수로 계산하면서 올림 효과 있음
                totalPacks += (count + T - 1) / T; // 올림 대신 수학적 방식
            }

            System.out.println(totalPacks);
            System.out.print(n / P + " " + n % P);
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		
//		// 내 코드
//		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
//			int peopleCount = Integer.parseInt(br.readLine());
//			String[] tSizeCount = br.readLine().split(" ");
//			String[] quantityCount = br.readLine().split(" ");
//			int T = Integer.parseInt(quantityCount[0]);
//			int P = Integer.parseInt(quantityCount[1]);
//			int sum = 0, penSetCount = 0, penCount = 0;
//
//			for (String string : tSizeCount) {
//				int count = Integer.parseInt(string);
//				int packs = (int) Math.ceil((double) count / T);
//				sum += packs;
//			}
//
//			penSetCount = peopleCount / P;
//			penCount = peopleCount % P;
//
//			System.out.println(sum);
//			System.out.print(penSetCount + " " + penCount);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}

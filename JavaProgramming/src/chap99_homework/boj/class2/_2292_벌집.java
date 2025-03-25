package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2292_벌집 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int N = Integer.parseInt(br.readLine());
			// 방 개수가 무조건 1이 포함되기 때문에 layer랑 max를 1로 초기화
			int layer = 1; 
			int max = 1;
			
			// 방의 개수는 1 + 6*(1+2+3+(n-1))개로
			// 처음 layer 1을 포함한 나머지는 6개씩 증가함
			// 그래서 입력값 N이 방의 누적값 max를 넘지 않으면 layer를
			// 증가 시켜서 값을 구한다.
			while(N > max) {
				max += 6 * layer;
				layer++;
			}
			
			System.out.println(layer);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _2231_분해합 {

	public static void main(String[] args) {
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			
			int N = Integer.parseInt(br.readLine());
			int M = 0;
			
			// 분해합의 생성자를 찾기 위해서는 분해합의 
			// 최솟값까지 탐색하면 모든 생성자를 찾을 수 있음
			// 생성자 최솟값 = 분해합의 자리수 * 9
			// N - N의 자리수 * 9(한 자리수에 올 수 있는 최대숫자)부터 N까지 탐색
			for(int i = N - 9*String.valueOf(N).length(); i < N; i++) {
				int sum = i;
				int temp = i;
				
				while(temp > 0) {
					// 탐색하는 수의 자리 수를 가중시킴
					// sum = sum(198) + (temp(198) % 10 = 8)
					sum += temp % 10;
					// 탐색하는 수의 자리 수의 마지막 수를 제거함
					// temp = (temp(198) / 10 = 19) 
					temp /= 10;
				}
				
				if(sum == N) {
					M = i;
					// 생성자의 최소값을 출력하기 위해 처음 발견했을 때 break 작성
					// break 없으면 제일 마지막 값이 덮어 씌어진다.
					break;
				}
			}
			
			System.out.println(M);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

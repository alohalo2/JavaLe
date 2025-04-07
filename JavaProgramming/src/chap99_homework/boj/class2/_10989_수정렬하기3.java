package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _10989_수정렬하기3 {

	public static void main(String[] args) {
		
		try (	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			){
			
		int N = Integer.parseInt(br.readLine());
		int[] count = new int[10001]; // 정수범위: 1~10000
		
		// 계수 정렬
		// 값을 index로 넣고 값의 갯수를 배열의 값으로 넣음
		// index는 정렬된 수이니까 따로 정렬이 필요하지 않음
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			count[num]++;
		}
		
		// 실제 출력 값의 범위를 i로 설정
		for(int i = 1; i <= 10000; i++) {
			while(count[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		
		bw.flush();
			
		} catch (Exception e) {
			
		}
		
		// 메모리 초과로 실패
		// List<Integer>는 int를 Integer로 박싱해서 저장하기 때문에
		// 메모리 소비가 int보다 크다
		// Collections.sort()는 비효율적인 정렬 알고리즘(시간과 메모리 소모가 큼)
		
//		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//			
//			int N = Integer.parseInt(br.readLine());
//			
//			while(N > 0) {
//				StringBuilder sb = new StringBuilder();
//				List<Integer> numbers = new ArrayList<>();
//				
//				for(int i = 0; i < N; i++) {
//					numbers.add(Integer.parseInt(br.readLine()));
//				}
//				
//				Collections.sort(numbers);
//				
//				for (int number : numbers) {
//					sb.append(number).append("\n");
//				}
//				
//				System.out.println(sb.toString());
//				
//				N--;
//			}
//			
//			
//		} catch (Exception e) {
//			
//		}
		
	}

}

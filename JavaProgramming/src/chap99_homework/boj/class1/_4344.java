package chap99_homework.boj.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _4344 {

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {
            
        	int[] arr;
            
            int testcase = Integer.parseInt(br.readLine());
            StringTokenizer st;
            
            for(int i = 0; i < testcase; i++) {
            	
            	st = new StringTokenizer(br.readLine(), " ");
            	
            	int N = Integer.parseInt(st.nextToken()); // 학생 수


          
            	arr = new int[N];
    			
    			double sum = 0;	// 성적 누적 합 변수 
    			
    			// 성적 입력부분 
    			for(int j = 0 ; j < N ; j++) {
    				int val = Integer.parseInt(st.nextToken());	// 성적 저장
    				arr[j] = val;
    				sum += val;	// 성적 누적 합 
    			}
    			
    			double mean = (sum / N) ; // 학생들의 평균
    			double count = 0; // 평균 넘는 학생 수 변수 
    			
    			// 평균 넘는 학생 비율 찾기 
    			for(int j = 0 ; j < N ; j++) {
    				if(arr[j] > mean) {
    					count++;
    				}
    			}
    			
    			bw.write(String.format("%.3f%%\n", (count / N) * 100));
 
            }

            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
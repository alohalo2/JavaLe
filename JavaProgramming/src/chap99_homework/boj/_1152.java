package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _1152 {

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
             
        try {
        	
        	// 공백만 주어지거나 빈 문자열일 경우 0을 반환해야함
        	// .trim() : 앞,뒤 공백을 제거
        	// .strip() : .trim() 메소드 보다 더 포괄적으로 유니코드의 공백을 포함한 앞,뒤 공백을 지움
        	// 유니코드 공백 ex): 스페이스('\u0020'), 탭('\u0009) ...
        	
        	String str = br.readLine().strip();
        	
        	if(str.isEmpty()) {
        		bw.write(0 + "\n");
        	} else {
        		StringTokenizer st = new StringTokenizer(str);
        		bw.write(st.countTokens() + "\n");
        	}
        	
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
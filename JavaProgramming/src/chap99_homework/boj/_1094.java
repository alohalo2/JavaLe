package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class _1094 {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {

        	int X = Integer.parseInt(br.readLine());
        	int initial = 64;
        	
        	List<Integer> intList = new ArrayList<>();
        	
        	intList.add(initial);
            int sum = initial;
            
            while (sum >= X) {
            	
            	if(X == 64) break;
            	
            	// 가장 작은 막대기를 smallest 변수에 담고 list에서는 제거한다.
                int smallest = intList.get(intList.size() - 1);
                intList.remove(intList.size() - 1);
                
                // smallest(가장 작은 막대기)를 반으로 나눠서 half에 담고
                // half를 list에 저장한다.
                int half = smallest / 2;
                intList.add(half);
                
                // sum에서 half를 뺀 값을 sum에 저장한다.
                sum -= half;

                // 만약 sum이 X보다 작으면 list에 나머지 half를 추가 저장하고
                // sum에 half를 더한 값을 sum에 저장한다.smallest
                if (sum < X) {
                    intList.add(half);
                    sum += half;
                }
                
                if(sum == X) break;
                
            }
            
            bw.write(intList.size() + "\n");
            
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
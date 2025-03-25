package chap99_homework.boj.class1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class _1837_암호제작_BigInteger {

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {

    		StringTokenizer st = new StringTokenizer(br.readLine());
    		BigInteger mulPrime = new BigInteger(st.nextToken());
    		BigInteger basedNum = new BigInteger(st.nextToken());
    		BigInteger smallPrime = new BigInteger("1");
    		
    		while(true) { // while문을 돌면서 smallPrime이 1씩 증가함
    			if (smallPrime.compareTo(basedNum) == 1 || smallPrime.compareTo(basedNum) == 0) {
    				bw.write("GOOD\n");
    				bw.flush();
    				bw.close();
    				break;  // 프로그램 종료
    			}
    			
    			smallPrime = smallPrime.add(BigInteger.ONE);
    			
    			//BigInteger I.compareTo(BigInteger J) == 1 => I > J
    			//BigInteger I.compareTo(BigInteger J) == 0 => I == J
    			//BigInteger I.compareTo(BigInteger J) == -1 => I < J
    			
    			// BAD가 출력되는 경우 : mulPrime와 smallPrime를 나눈 나머지 수와 0을 비교(값이 0과 같으면 나누어 떨어짐) 
    			//				 && smallPrime와 basedNum를 비교
    			if(mulPrime.remainder(smallPrime).compareTo(BigInteger.ZERO) == 0 && smallPrime.compareTo(basedNum) == -1) {
    				bw.write("BAD" + " " + smallPrime + "\n");
    				bw.flush();
    	            bw.close();
					break;
    			}
    		}
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
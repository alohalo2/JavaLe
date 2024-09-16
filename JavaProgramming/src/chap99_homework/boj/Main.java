package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        try {

    		StringTokenizer st = new StringTokenizer(br.readLine());
    		int mulPrime = Integer.parseInt(st.nextToken());
    		int basedNum = Integer.parseInt(st.nextToken());
    		int bigPrime = 2;
    		int smallPrime = 2;
    		
    		if(mulPrime / basedNum > basedNum) {
    			bw.write("GOOD" + "\n");
    		} else {
				for(int i = 2; i <= basedNum; i++) {
					if(mulPrime % i == 0) {
						bigPrime = mulPrime / i;
						smallPrime = i;
						bw.write("BAD" + " " + smallPrime + "\n");
					} else {
						return;
					}
				}
			}
            bw.flush();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static boolean isPrime(int num) {
		if(num < 2) return false;
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) return false; 
		}
		return true;
	}
}
package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
             
        try {
        	
        	int N = Integer.parseInt(br.readLine());
        	
        	int[] intArr = new int[N];
        	
        	for(int i = 0; i <= intArr.length; i++) {
        		intArr[i] = 1;
        	}
        	
        	for(int i = 1; i <= intArr.length; i++) {
        		if(intArr[i * N] == 1) {
        			intArr[i * N] = 0;
        		} else if(intArr[i * N] == 0) {
        			intArr[i * N] = 1;
        		} 
        	}
        	
        	for(int i : intArr) {
        		bw.write(i + "\n");
        	}
        	
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
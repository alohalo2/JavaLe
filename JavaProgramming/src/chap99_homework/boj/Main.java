package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
        	
//        	접근 방법 : 맨해튼 거리(위치 좌표 상의 차이)에 대한 이해	 
        	
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	
        	int month = Integer.parseInt(st.nextToken());
        	int date = Integer.parseInt(st.nextToken());
        	
        	if(month < 10) {
//        		month = "0" + month.toString();
        	}
        	
        	String[] dayArr = {"", "SUN", "MON", "TUE", "WED", 
					   "THU", "FRI", "SAT"};
	
        	String[] dateArr = {"2007", ""};
        	
			Calendar cal1 = Calendar.getInstance();
			
			cal1.set(Integer.parseInt(dateArr[0]), (Integer.parseInt(dateArr[1]) - 1), Integer.parseInt(dateArr[2]));
			
			bw.write(dayArr[cal1.get(Calendar.DAY_OF_WEEK)] + "\n");
        	
            bw.flush();
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
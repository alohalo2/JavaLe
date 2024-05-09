package chap99_homework.homework08.basic;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
//		1. Calendar 객체를 오늘날짜로 생성하세요.
//		   객체의 날짜를 2020년 4월 8일로 변경하고 출력하세요.
//		   위의 객체의 날짜를 add 메소드를 이용해서 5년뒤 2달뒤 3일뒤(동시에)로 변경하고 출력하세요.

		Calendar calendar1 = Calendar.getInstance();
		
		calendar1.set(2020, 3, 8);
		System.out.println(calendar1.get(calendar1.YEAR) + "년 " +
				(calendar1.get(calendar1.MONTH) + 1) + "월 " +
				calendar1.get(calendar1.DATE) + "일 "
		);
		
		calendar1.add(calendar1.YEAR, 5);
		calendar1.add(calendar1.MONTH, 2);
		calendar1.add(calendar1.DATE, 3);
		
		System.out.println(calendar1.get(calendar1.YEAR) + "년 " +
				(calendar1.get(calendar1.MONTH) + 1) + "월 " +
				calendar1.get(calendar1.DATE) + "일 "
		);
		
		
//		2. Calendar 객체를 오늘날짜로 생성하세요.
//		   오늘날짜를 2023-03-24 형식으로 출력하세요.
//		   오늘날짜를 2023년 03월 24일 xx시 xx분 xx초 형식으로 출력하세요.

		
		Calendar calendar2 = Calendar.getInstance();
		Date today = new Date();
		
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(simpleDateFormat1.format(today));
		
		System.out.println(calendar2.get(calendar2.YEAR) + "년 " +
				(calendar2.get(calendar2.MONTH) + 1) + "월 " +
				calendar2.get(calendar2.DATE) + "일 " + 
				(calendar2.get(calendar2.HOUR) < 24 ? "0" +
			    calendar2.get(calendar2.HOUR) : calendar2.get(calendar2.HOUR))
				+ "시 " + (calendar2.get(calendar2.MINUTE) < 10 ? "0" + 
				calendar2.get(calendar2.MINUTE) : calendar2.get(calendar2.MINUTE))
				+ "분 " + (calendar2.get(calendar2.SECOND) < 10 ? "0" + 
				calendar2.get(calendar2.SECOND) : calendar2.get(calendar2.SECOND)) + "초"
		);

		
		
//		3. 정수형 데이터를 저장할 수 있는 ArrayList를 생성하고 사용자가 입력한 5개의 정수를 저장하고 출력하세요.	
//		
		Scanner sc = new Scanner(System.in);
		
		List<Object> list = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요.");
			list.add(sc.nextInt());
			
		}
		
		System.out.println(list);

		
		sc.close();

	}

}

package chap99_homework.homework08.middle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		
//		1. 사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)에 add 메소드로 3일뒤로 변경하고
//	     yyyy-MM-dd 형식으로 출력하세요. (SimpleDateFormat 클래스 사용. SimpleDateFormat의
//	     parse() 메소드를 이용하면 String -> Calendar로 변환가능)

		Scanner sc = new Scanner(System.in);
		
		System.out.println("yyyy-MM-dd 형식으로 날짜를 입력하세요.");
		
		String str = sc.nextLine(); // String 객체 생성
		
		Calendar calendar = Calendar.getInstance(); //Calendar 객체 생성
		
		// SimpleDateFormat 객체 생성 및 매개변수 추가
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		
		
		try {
			// 사용자 입력 String 문자열을 SimpleDateFormat에 담고 calendar로 변환
			calendar.setTime(simpleDateFormat.parse(str)); 
			
			// 변환된 calendar에 add 메소드로 3일을 추가함
			calendar.add(calendar.DATE, 3);
			
			// calendar를 getTime 메소드로 Date로 변환
			Date userDate = calendar.getTime();
			
			// 변환된 Date를 format 메소드로 SimpleDateFormat로 출력
			System.out.println(simpleDateFormat.format(userDate));
			
		} catch (ParseException e) {
			
			// 사용자가 잘못 입력했을 경우 예외처리
			e.printStackTrace();
			System.out.println("잘못 입력했습니다, 다시 입력해주세요.");
		}
		
		System.out.println("--------------------------------------");
		
//		2. 길이가 8이며 한글로 된 요일이 저장되어 있는 요일 배열을 만들고
//	   사용자가 입력한 날짜(yyyy-MM-dd 형식으로 입력받음)의 요일을 한글로 출력하세요.
		
		// 요일 String 배열 생성
		String[] dayArr = {"", "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};	
		
		// 사용자에게 입력 양식 출력
		System.out.println("yyyy-MM-dd 형식으로 날짜를 입력하세요.");
		
		// 사용자 입력 내용을 String str1에 저장
		String str1 = sc.nextLine();
		
		// calendar1 객체 생성
		Calendar calendar1 = Calendar.getInstance();
			
		// simpleDateFormat1 객체 생성 및 매개변수 추가
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");			
						
						
		try {
			calendar.setTime(simpleDateFormat.parse(str));
							
			Date userDate1 = calendar.getTime();
							
			System.out.println(simpleDateFormat.format(userDate1));
			
			// calendar 날짜에 맞는 요일 출력
			System.out.println("오늘은 " + 
					dayArr[calendar.get(calendar.DAY_OF_WEEK)]
			);
							
							
		} catch (ParseException e) {
							
			e.printStackTrace();
			System.out.println("잘못 입력했습니다, 다시 입력해주세요.");
		}

		System.out.println("-------------------------------------");
		
//		3. 두 개의 날짜 데이터 2023-03-15 20:31:45와 2021-07-08 11:58:04의 차이를
//	     시 분 초 형태로 나타내시오.
		
		// Calendar cal1 객체 생성 및 set 메소드로 해당하는 날짜 및 시간 셋팅
		Calendar cal1 = Calendar.getInstance();
		cal1.set(2023, 3, 15, 20, 31, 45);
		
		// Calendar cal2 객체 생성 및 set 메소드로 해당하는 날짜 및 시간 셋팅
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2021, 7, 8, 11, 58, 04);
		
		// getTimeInMillis 메소드로 cal1과 cal2의 차이를 구함 
		long diff = cal1.getTimeInMillis() - cal2.getTimeInMillis();
		
		System.out.println("cal2부터 cal1까지 " + (diff / 1000) + "초가 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60) + "분이 지났습니다.");
		System.out.println("cal2부터 cal1까지 " + (diff / 1000 / 60 / 60) + "시간이 지났습니다.");
		
	
	sc.close();

	}

}

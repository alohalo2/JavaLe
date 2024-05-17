package chap99_homework.homework14.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		
//		1. List<Integer> intList를 생성하고 10개의 랜덤값(1~10)을 저장합니다. 
//		   intList를 Stream으로 만들어서 각 요소에 곱하기 3을 한 요소로 새로운 스트림을 만들어서 출력하세요.

//		List<Integer> intList = new ArrayList<>();
//		
//		for(int i = 0; i < 10; i++) {
//			intList.add((int)(Math.random() * 10) +1);	
//		}
//		
//		System.out.println(intList);
//		
//		intList.stream()
//			   .map(num -> num * 3)
//			   .forEach(num -> System.out.println(num));
//		System.out.println("-----------------------------");
		
//		2. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여 문자열의 길이가 5이상인 문자열만 출력하세요.

//		Scanner sc = new Scanner(System.in);
	
//		List<String> strList1 = new ArrayList<String>();
//		
//		
//		System.out.println("문자열을 입력하세요.");
//		for(int i = 0; i < 10; i++) {
//			strList1.add(sc.nextLine());
//		}
//		
//		strList1.stream()
//			   .filter(str1 -> str1.length() > 5)
//			   .forEach(str1 -> System.out.println(str1));
//		System.out.println("-----------------------------");
		
//		3. 사용자가 입력한 문자열 10개를 저장하는 List<String> strList를 만들고 
//		   스트림을 이용해서 문자열에 영문자가 포함된 문자열만 뽑아서 스트림을 만들고 출력하세요.

		List<String> strList2 = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		for(int i = 0; i < 10; i++) {
			strList2.add(sc.nextLine());
		}
		
		strList2.stream()
				.filter(str2 -> str2.matches(".*[a-zA-Z].*"))
				.forEach(str2 -> System.out.println(str2));
	
		
		sc.close();


	}

}

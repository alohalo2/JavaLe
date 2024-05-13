package chap99_homework.homework09.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import chap99_homework.homework04.answer.Employee;
import chap99_homework.homework04.answer.RegularEmployee;

public class Basic {

	public static void main(String[] args) {
		
//		1. Map<String, Integer>을 하나 생성하여 key는 알파벳(대소문자 구분) 
//		   value는 해당 알파벳의 유니코드 값을 Integer형태로 저장하세요.

		// 유니코드는 ASCII 코드를 확장한 표준으로, 전 세계의 모든 문자를 포함하고 있습니다. 
		// 알파벳에 대한 유니코드 값은 ASCII 코드와 동일합니다. 즉, 'A'의 ASCII 코드 값은 65이며, 
		// 이는 동일하게 'A'의 유니코드 값입니다.
		
		Map<String, Integer> map1 = new HashMap<>();
		List<String> alphabetList = new ArrayList<>();

		int[] intArr = new int[52];
		String str = "";
		
		// alphabetList와 intArr을 각각 따로 생각해서 저장하려면 합쳐서 저장하는데 어려움 있음
		// 그래서 각 대소문자 별로 for문을 돌릴 때 같이 저장되게 해야함
		// Map에 저장할 때에도 for문을 돌려서 인덱스를 받아야만 key와 value 데이터 타입을 받을 수 있음
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			alphabetList.add(str.valueOf(ch)); // key: alphabetList에 'A' - 'Z'까지 저장
			intArr[ch - 'A'] = ch; // value: intArr에 'A' - 'Z'까지 유니코드 값 저장
		}
		
		for(char ch = 'a'; ch <= 'z'; ch++) {
			alphabetList.add(str.valueOf(ch)); // key: alphabetList에 'a' - 'z'까지 저장
			intArr[ch - 'a' + 26] = ch; // value: intArr에 'a' - 'z'까지 유니코드 값 저장
		}
		
		for(int i = 0; i < alphabetList.size(); i++) { // for문으로 alphabetList와 intArr을 Map에 저장
			map1.put(alphabetList.get(i), intArr[i]);
		}
		
		System.out.println(map1);
		
		System.out.println("-------------------------------------------");
		
		
//		2. 이름과 전화번호를 쌍으로 하는 주소록을 HashMap으로 구현하고, 특정 이름의 전화번호를 조회하는 기능을 구현하세요.

		
		Map<String, String> map2 = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		List<String> nameList = new ArrayList();
		List<String> numList = new ArrayList();

		Set<Entry<String, String>> entrySet = map2.entrySet();
		
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		
		String name = "";
		String phoneNumber = "";
		
		while(true) {
			 System.out.println("*** 메뉴 선택 ***");
			 System.out.println("1.이름과 전화번호 저장");
			 System.out.println("2.이름 입력하여 전화번호 검색");
			 System.out.println("3.프로그램 종료");
			
			 int menuSelect = sc.nextInt();

			 switch (menuSelect) {
			 
			 	case 1: 
				 
			 		generatePhoneBook(sc, name, phoneNumber);
			 		break;
				 
			 	case 2:
			 		// 이 부분 문제가 있음
			 		System.out.println("검색할 이름을 입력하세요.");
			 		sc.nextLine();
			 		String userInput = sc.nextLine();
			 		
//			 		boolean found = false;
//			 		
//			 		while(iterator.hasNext()) { 
//						Entry<String, String> entry = iterator.next(); 
//
//						if(entry.getKey().equals(userInput)) {
//							System.out.print(entry.getKey() +  "의 전화번호: " + entry.getValue());
//							found = true;
//							break;
//						} 
//				
//					}
//			 		
//			 		if(!found) {
//			 			System.out.println("저장된 이름이 아닙니다.");
//			 		}
				 
			 		break;
				 
			 	case 3: 
			 		System.out.println("프로그램을 종료합니다.");
			 		sc.close();
			 		System.exit(0);
				 
			 	default:
			 		System.out.println("번호를 잘못 입력하셨습니다, 다시 입력해주세요.");
			 		continue;
			 
			 }
		
		 }

	}
	
	public static Map<String, String> generatePhoneBook(Scanner sc, String name, String phoneNumber) {
	
		Map<String, String> map2 = new HashMap<>();
		
		System.out.println("이름을 입력해주세요.");
		name = sc.nextLine();
		sc.nextLine();
		
		System.out.println("전화번호를 입력해주세요.");
		phoneNumber = sc.nextLine();
		
		map2.put(name, phoneNumber);
		
		return map2;
		 
		
	}

}

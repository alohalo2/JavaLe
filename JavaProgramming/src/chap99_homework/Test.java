package chap99_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public String addNim(String name) {
		return name + "님";
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		List<String> nameList = Arrays.asList("홍길동", "장길산", "임꺽정");
//		
//		Test test = new Test();
//		
//		nameList.stream().map(test :: addNim).forEach(System.out :: println);
		
		
		
		
//		List<String> isList = Arrays.asList("aaa","bbb","ccc","ddd");
//		isList.stream().map(element -> element.toUpperCase())
//					   .forEach(System.out :: println);
//		
//		List<String> isList2 = new ArrayList<String>();
//		
//		isList2.add("aaa");
//		isList2.add("bbb");
//		isList2.add("ccc");
//		isList2.add("ddd");
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		String bookTitle;
		int bookCnt = 0;
		
		while(true) {
			
			for(int i = 0; i < 4; i++) {
				System.out.println("책 제목을 입력해주세요.");
				bookTitle = sc.nextLine();
				bookCnt++;
				
				map.put(bookCnt, bookTitle);
			}
			
			 Set<Integer> keySet = map.keySet();       
			 for (Integer key : keySet) {            
				 System.out.println(key + " : " + map.get(key)); 
			 }
			 break; // while 루프 탈출
		}
	}
}

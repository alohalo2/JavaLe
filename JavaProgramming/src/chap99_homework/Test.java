package chap99_homework;

import java.awt.datatransfer.SystemFlavorMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

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
		
//		Map<Integer, String> map = new HashMap<Integer, String>();
//		
//		String bookTitle;
//		int bookCnt = 0;
//		
//		while(true) {
//			
//			for(int i = 0; i < 4; i++) {
//				System.out.println("책 제목을 입력해주세요.");
//				bookTitle = sc.nextLine();
//				bookCnt++;
//				
//				map.put(bookCnt, bookTitle);
//			}
//			
//			 Set<Integer> keySet = map.keySet();       
//			 for (Integer key : keySet) {            
//				 System.out.println(key + " : " + map.get(key)); 
//			 }
//			 break; // while 루프 탈출
//		}
		
		String str = "네이버> 네이버 주소: https://www.naver.com";
//		StringTokenizer st = new StringTokenizer(str, ">: ");
//		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
	
		for(int i = 0; i < str.length(); i++) {
			
			String[] str1 = str.split(":");
			System.out.println(str1);
		}
		
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//		try {
//
//			int[] Narr = new int[9];
//			int idx = 0;
//
//			while (idx < 9) {
//
//				Narr[idx++] = Integer.parseInt(br.readLine());
//			}
//
//			int max = 0;
//			int maxCnt = 0;
//			for (int i = 0; i < Narr.length; i++) {
//				if (max < Narr[i]) {
//					max = Narr[i];
//					maxCnt = i + 1;
//				}
//			}
//
//			bw.write(max + "\n");
//			bw.write(maxCnt + "\n");
//
//			bw.flush();
//			bw.close();
//
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	
		
		
		
		
//		import java.util.ArrayList;
//		import java.util.Arrays;
//		import java.util.Collections;
//		import java.util.HashSet;
//		import java.util.List;
//		import java.util.Scanner;
//		import java.util.Set;
//
//		public class Main {
//
//			public static void main(String[] args) {     
//
//				Scanner sc = new Scanner(System.in);
//				
//				List<String> stList = new ArrayList<>();
//				
//				int N = 0;
//				String st = sc.nextLine();
//				boolean existSt = false;
//				
//				if(N >= 100) {
//					
//				}
//				
//				for(int i = 0; i < N; i++) {
//					stList.add(st); 
//				}
//				
//				for(String st1 : stList) {
//					System.out.println(st1);
//				}
//				
//				sc.close();
//			}
//		}

		
	}
}

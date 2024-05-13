package chap99_homework.homework09.middle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Middle {

	public static void main(String[] args) {
		
		
//		1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고
//		  4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.(이름 : 90)

		Map<String, Integer> map = new HashMap<>();
		List<String> studentNameList = new ArrayList<>();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		
		int[] scores = new int[4];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 4; i++) {
			System.out.println("학생 이름을 입력하세요.");
			studentNameList.add(sc.nextLine());
			
			System.out.println("점수를 입력하세요.");
			scores[i] = sc.nextInt();
			sc.nextLine();
			if(i == 4) {
				break;
			}
		}
		
		for(int i = 0; i < studentNameList.size(); i++) {
			map.put(studentNameList.get(i),scores[i]);
			
//			System.out.println(map);
			
		}
		
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			
			int max = Integer.MIN_VALUE; // 정수 중 최소값을 나타냄
			
			for(int value : map.values()) {
				if(value > max) {
					max = value;
				}
			}
			
			System.out.print(entry.getKey() +  ": " + max);
		}
		
	
		
		
		
		sc.close();
		
//		2. 매개변수로 Map<Integer, Integer>이 주어졌을 때 key, value의 곱이 가장 큰 Entry를 리턴하는 메소드 getMaxMul을 구현하세요.

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		3. Map<Integer, Integer>을 매개변수로 받아서 key는 정순 출력, value는 역순 출력하는 printKVDesc라는 메소드를 구현하세요. 
//		{1: 3, 2: 4, 3: 5}
//		1 : 5
//		2 : 4
//		3 : 3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

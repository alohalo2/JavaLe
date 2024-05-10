package chap18_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class _10_HashMapEx {

	public static void main(String[] args) {
		
		
//	    1. 사용자가 입력한 6개의 정수를 저장하는 List<Integer>를 생성하고
//	    Map으로(key: 두 수의 합)(value: 합의 갯수) 두 수의 합이 유일한 값이 되는 개수를 출력하세요.(중복 숫자 사용불가)
//	    ex) [1, 2, 3, 4, 5, 6] => 총 4개(3, 4, 10, 11)
		
		Scanner sc = new Scanner(System.in);
		List<Integer> intList2 = 
				new ArrayList<>();
		
		for(int i = 0; i < 6; i++) {
			System.out.print("정수를 입력하세요.");
			intList2.add(sc.nextInt());
			
			for(int j = 0; j < i; j++) {
				if(intList2.get(i) == intList2.get(j)) {
					System.out.println("중복된 값입니다.");
					intList2.remove(i);
					i--;
				}
			}
		}
 		
		List<Integer> sumList = new ArrayList<>();
		
		Map<String, Integer> intMap = new HashMap<>();
		
		for(int i = 0; i < intList2.size(); i++) {
			for(int j = i + 1; j < intList2.size(); j++) {
				if(j != i) {
					sumList.add(intList2.get(i) + intList2.get(j));
				}
			}
		}
		
		System.out.println(sumList);
		
		/*
		 * {
		 * 		"3": 1,
		 * 		"4": 2,
		 * 		"5": 2,
		 * 		"6": 2,
		 * 		...
		 * 		"11": 1
		 * }
		 * */
		
		// 현재 List<Integer>에 해당하는 두 수의 합은 구해졌으며 Map에 List에 있는 값들이 key가 되고 
		// 합의 갯수가 value가 되도록 코딩
		for(int i = 0; i < sumList.size(); i++) { // 외부 for문은 sumList를 돌고
			int sumcnt = 1; // 두 수의 합이 최소한 1번은 등장해야 하므로 sumcnt는 1로 초기화
			
//		sumcnt가 외부 for문 안에서 초기화 되어야 하는 이유:
//		sumCnt를 외부 for 루프 안에서 초기화해야 하는 이유는 각 합의 개수를 정확하게 계산하기 위해서입니다.
//		외부 for 루프는 모든 합을 구하는 과정을 나타냅니다. 이 과정에서 각 합에 대한 개수를 정확하게 계산하려면, 
//		각 합을 처리할 때마다 sumCnt를 초기화하는 것이 필요합니다. 이를 위해 sumCnt는 외부 for 루프 안에서 초기화되어야 합니다.
			
			for(int j = 0; j < sumList.size(); j++) { // 내부 for문은 
				if(i != j) {
					if(sumList.get(i) == sumList.get(j)) {
						sumcnt++;
					}
				}	
			}
			intMap.put(sumList.get(i).toString(), sumcnt);
			
		}
		
		System.out.println(intMap);
		
		Set<Entry<String, Integer>> entrySet = intMap.entrySet(); // Map의 key와 value를 각각 접근하고자 할때 
																  // Set<Entry>와 Iterator 같이 선언해서 사용
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		int cnt = 0;
		
		System.out.print("합이 유일한 합의 값: ");
		while(iterator.hasNext()) { // Iterator.hasNext()는 다음 값이 있는지 확인하는 메소드로 다음 값이 있으면 true, 없으면 false
			Entry<String, Integer> entry = iterator.next(); 
			
//			Iterator.next() 메서드는 Iterator를 통해 다음 요소를 가져오는 메서드입니다.
//			Iterator는 컬렉션의 요소를 순회하는데 사용되며, next() 메서드는 순회 중 현재 위치의 다음 요소를 반환합니다. 
//			이 메서드를 호출할 때마다 Iterator는 내부적으로 다음 요소로 이동하게 됩니다.
//			보통 hasNext() 메서드와 함께 사용되어, 다음 요소가 있는지 확인한 후에 요소를 가져오는 용도로 사용됩니다.
			
			if(entry.getValue() == 1) {
				System.out.print(entry.getKey() +  ", ");
				cnt++;
			}
			
		}
		
		System.out.println("유일한 합의 개수: " + cnt);

		sc.close();
	}


}

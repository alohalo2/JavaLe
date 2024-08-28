package chap99_homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < N; i++) {
			intList.add(sc.nextInt());
		}
		
		List<Integer> revserList = intList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(revserList.get(k - 1));
		
		sc.close();
	}

}

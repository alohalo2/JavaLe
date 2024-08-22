package chap99_homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {     

		Scanner sc = new Scanner(System.in);
		int remain = 0;
		Set<Integer> resultSet = new HashSet<>();
		
		for(int i = 0; i < 10; i++) {
			int N = sc.nextInt();
			remain = N % 42;
			resultSet.add(remain);
		}
		
			System.out.println(resultSet.size());
		
		sc.close();
	}
}


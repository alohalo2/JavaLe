package chap99_homework.homework14.middle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		
//		1. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고 
//		   List<Student> studentList에 (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)를 저장하고 
//		   Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

		List<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1, "홍길동", 100));
		studentList.add(new Student(2, "임꺽정", 75));
		studentList.add(new Student(3, "장길산", 86));
		studentList.add(new Student(4, "정도전", 97));
		studentList.add(new Student(5, "이순신", 95));
		
		studentList.stream()
				   .filter(student -> student.getScore() >= 95)
				   .forEach(student -> System.out.println(student));
		System.out.println("---------------------------------------");
		
//		2. 1번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.

		studentList.add(new Student(6, "장발장", 80, "A+"));
		
		System.out.println(studentList);
		
		studentList.stream()
				   .filter(insert -> insert.getGrede().equals("A+") && insert.getGrede() != null)
				   .forEach(insert -> System.out.println(insert));
	
//		3. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서 
//		   영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.

		Scanner sc = new Scanner(System.in);
		
		List<Character> charList = new ArrayList<Character>();
		
		System.out.println("영문자를 입력하세요.");
		for(int i = 0; i < 10; i++) {
			charList.add(sc.nextLine().charAt(i));
		}
		
		charList.stream()
				.map(change -> {
					
					if(change.charValue() >= 'A' && change.charValue() <= 'Z') {
						change.charValue().toLowerCase();
					} else {
						change.charValue().toUpperCase();
					}
					return change;
				})
				.forEach(change -> System.out.println(change));
					
		
		
		
//					for(int i = 0; i < change.length; i++) {
//						if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
//							convertArr[i] = (char)(chArr[i] + 32);
//							// convertA[i] = character.toLowerCase(chArr[i]));
//						} else {
//							convertArr[i] = (char)(chArr[i] - 32);
//							// convertA[i] = character.toUpperCase(chArr[i]));
//						}
//					
					
					
					
//					(change	>= 'A' && change <= 'Z') ?
//							(char)(change + 32)
//					:
//					(change >= 'a' && change <= 'z') ?
//							(char)(change - 32)
//					: change;
//				});
//				.forEach()
		
		
//		char convertChar = ch >= 'A' && ch <= 'Z'
//				?
//						(char)(ch + 32)
//				:
//					ch >= 'a' && ch <= 'z'
//					?
//							(char)(ch - 32)
//					: ch;
		
		
		
		

	}

}

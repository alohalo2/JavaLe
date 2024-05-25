package chap99_homework.homework12.basic02;

public class Basic02_Class {

	public static void main(String[] args) {

		Student student = new Student(null, 0, null);
		Book book = new Book(null, null, null, 0);
		Circle circle = new Circle(20);
		Account account = new Account(0, 0);
		Add add = new Add(0, 0);
		
//		--------------------클래스--------------------
//		1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.

//		Student 클래스 생성 완료
		
		student.saveInfo("홍길동", 1, "개발");
		student.studentInfo();
		System.out.println("----------------------------");
		
//		2. 도서의 제목, 저자, 출판사, 가격을 속성으로 가지고 정보를 저장하는 메소드와 정보를 출력하는 메소드를 갖는 도서 클래스를 생성하세요.

//		Book 클래스 생성 완료		
		
		book.saveInfo("이것이 자바다", "신용권", "한빛미디어", 36000);
		book.bookInfo();
		System.out.println("----------------------------");
		
//		3. 두 문자열을 전달받아 합쳐진 새로운 문자열을 리턴하는 메소드를 구현하세요.

//		아래 combineStr 메소드 구현 완료
		
		System.out.println(combineStr("hello","world!"));
		System.out.println("----------------------------");
		
//		4. 정수 한 개와 실수 한 개를 전달받아 소수점 두자리까지만 가지는 곱의 결과를 리턴하는 메소드를 구현하세요.
		
//      아래 mul 메소드 구현 완료
		
		System.out.println(mul(3,3.14));
		System.out.println("----------------------------");
		
//		5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
		
		System.out.println(circle.round(19));
		System.out.println(circle.area(19));
		System.out.println("----------------------------");
		
//		6. 잔액을 속성으로 가지고 입금, 출금, 잔액 조회를 메소드로 갖는 계좌 클래스를 생성하세요.
		
//		Account 클래스 생성 완료
		
		account.deposit(100000);
		account.withdraw(110000);
		
		System.out.println("현재 잔액: " + account.getBalance());
		System.out.println("----------------------------");
		
//		7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
//		    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요. 

		System.out.println(add.add(2, 3));
		System.out.println(add.add(2, 3, 4));
		
	}
	
	public static String combineStr(String str1, String str2) {
		return str1 + str2;
	}
	
	public static double mul (int num1, double num2) {
		return Math.round(((double)num1 * num2)*100)/100.0;
	}
	
	

}

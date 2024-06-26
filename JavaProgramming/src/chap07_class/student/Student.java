package chap07_class.student;

public class Student {

//	chap07_class 패키지 안에 student 패키지 만들고 Student 클래스를 생성하세요. 
//	필드로는 String name, int age, String major를 갖게 하고 생성자는 기본생성자, name만 초기화하는 생성자,
//	name과 age를 초기화 하는 생성자, name, age, major 모두 초기화하는 생성자를 만드세요. 
//	메소드는 학생정보를 출력하는 메소드를 생성하세요.

	public String name; //클래스의 속성(필드)
	public String major; //클래스의 속성(필드)
	public int age; //클래스의 속성(필드)
	
	public Student() { // 기본생성자(매개변수가 없는 생성자)
	}
	
	public Student(String name) { // name만 초기화하는 생성자
		this.name = name;
	}
	public Student(String name, int age) { // name,age를 초기화하는 생성자
		this.name = name;
		this.age = age;
	}
	public Student(String name, int age, String major) { // name, age, major를 초기화하는 생성자
		this.name = name;
		this.major = major;
		this.age = age;
	}
	
	public void printStudentInfo() {
		// 생성자에서 this 객체가 생성된 객체를 의미한다면
		// 인스턴스 메소드에서 this 객체는 해당 메소드를 소유하고 있는 객체를 의미한다.
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("전공: " + this.major);
	}
	
//	public void studentInfo() { // 학생 정보를 출력하는 메소드, 리턴 값이 없기 때문에 void로 작성
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age);
//		System.out.println("전공: " + major);
}
	
	
	
	


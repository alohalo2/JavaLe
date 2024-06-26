package chap07_class.circle;

public class Circle {

//	chap07_class 패키지 안에 circle이라는 패키지 생성하고 Circle 이라는 클래스를 생성하세요. 
//	필드는 선언과 동시에 초기화된 상수 PI(3.14), int radius 두 개를 만들고
//	기본 생성자 하나랑 int 값을 받아서 radius 필드를 초기화하는 생성자를 만드세요. 
//	기능으로는 원의 둘레(2 * PI *  radius)를 계산해서 double 형으로 리턴하는 메소드와 
//	원의 넓이 (PI * radius * radius)를 계산해서 double 형으로 리턴하는 메소드를 만드세요.

	public final double PI = 3.14; // 상수는 final
	public int radius;
	
	public Circle() { // 기본생성자
	}

	public Circle(int radius) {   // 매개변수가 있는 생성자
		// 생성자를 호출하면 객체가 생성되는데 this는 생성된 객체를 받아온다.
		this.radius = radius;     // 다른 매개변수 radius 값이 들어가도 적용될 수 있도록 초기화함
	}
	
	public double round() {
		return 2 * PI * radius;
//		double result = 2 * PI * radius;
//		return result;
	}
	
	public double area () {
		return  PI * radius * radius;
//		double result = PI * radius * radius;
//		return result;
	}
	
}

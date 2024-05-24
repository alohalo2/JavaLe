package chap99_homework.homework12.basic02;

public class Circle {

//	5. 반지름을 속성으로 갖는 원클래스를 만들고 사용자가 입력한 반지름이 생성자를 통해 속성에 저장되며 원의 넓이와 둘레를 구해서 리턴하는 메소드를 각각 구현하세요.
	
	final static double Pi = 3.14;
	private int radius;
	
	
	public Circle (int radius) {
		this.radius = radius;
	}

	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	public static double round(int radius) {
		return Math.round((2*Pi*radius)*100)/100.0;
	}
	
	public static double area (int radius) {
		return Math.round((Pi*radius*radius)*100)/100.0;
	}
	
}

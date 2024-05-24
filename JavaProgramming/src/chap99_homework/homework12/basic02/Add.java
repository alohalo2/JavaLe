package chap99_homework.homework12.basic02;

public class Add {

	
//	7. Add라는 클래스를 만들고 정수형 매개변수 2개를 받아서 합을 리턴하는 add 메소드를 구현하세요. 
//    그리고 오버로딩을 통해 정수형 매개변수 세개를 받아서 각각의 제곱의 합을 리턴하는 add메소드도 구현하세요. 

	private int num1;
	private int num2;
	
	public Add (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	@Override
	public String toString() {
		return "Add [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int add(int num1, int num2, int num3) {
		return (num1*num1) + (num2*num2) + (num3*num3);
	}
	
}

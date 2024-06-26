package chap09_inherit.animal;

public class Tiger extends Animal {

	String skin;
	
	public Tiger() {
		// super();
	}
	
	public Tiger(int age, String size, boolean hasWing, String skin) {
		// 자식클래스에서 부모클래스를 호출할 수 있는 super 키워드
		// super(age, size, hasWing) == Animal(age, size, hasWing)
		super(age, size, hasWing); // 부모클래스의 생성자 호출
		this.skin = skin;
		
//		this.age = age;
//		this.size = size;
//		this.hasWing = hasWing;
		
	}
	
	//@Override: 원래 컴파일러가 자식클래스와 부모클래스를 비교하면서 해당 메소드가 오버라이드 됐는지를 비교한다.
	//@Override 사용하면 컴파일러에게 미리 이 메소드가 오버라이드된 메소드라는 것을 알린다.(컴파일 과정이 빨라짐)
	@Override // 메소드마다 달아줘야함
	public void eat() {
		// 인스턴스 메소드에서도 super 키워드를 사용할 수 있다.
		// 부모클래스에 정의되어 있는 eat() 메소드 실행
		super.eat();
		System.out.println("육식을 한다.");
	}
	@Override
	public void sleep() {
		super.sleep(); // public, protected만 사용 가능
		System.out.println("누워서 잔다.");
	}
	
	
}

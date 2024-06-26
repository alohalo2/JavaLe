package chap10_polymorphism;

import chap10_polymorphim.tv.Tv;

public class AppleTv extends Tv {

	@Override
	public void powerOn() {
		System.out.println("AppleTv");
		super.powerOn();
	}
	
	@Override
	public void powerOff() {
		System.out.println("AppleTv");
		super.powerOff();
	}
	
	
	// Tv와 AppleTv가 다른 패키지에 속해있기 때문에 default 접근제어자로 선언된 operate 메소드는 오버라이드 할 수 없다.
//	@Override
//	public void operate(int channel) { // default 접근제어자여서 다른 패키지에서 사용할 수 없음.
//		
//	}
	
	public void testTv() {
		super.powerOn();
		
		super.powerOff();
		
//		super.operate(11);
//		
//		super.channelUp();
		
	}
	
	
}

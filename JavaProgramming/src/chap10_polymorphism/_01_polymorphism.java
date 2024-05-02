package chap10_polymorphism;

import chap10_polymorphim.tv.LgTv;
import chap10_polymorphim.tv.SamsungTv;
import chap10_polymorphim.tv.Tv;

public class _01_polymorphism {

	public static void main(String[] args) {
		
		// 1. 다형성을 이용하여 Tv 객체 바꾸며 사용하기
		Tv tv = new LgTv();
		
		tv = new SamsungTv();
		
		tv.powerOn();
		
		tv = new LgTv();
		
		tv.channelDown();
		
		tv = new SamsungTv();
		
		tv.channelDown();

	}

}

package chap12_interface.device;

public class LgTv implements Tv {

	@Override
	public void showDisplay() {
		
		System.out.println("엘지티비 화면을 보여줍니다.");
	}

	@Override
	public void powerOn() {
		
		System.out.println("엘지티비 전원을 켭니다.");
	}

	@Override
	public void powerOff() {
	
		System.out.println("엘지티비 전원을 끕니다.");
	}

	@Override
	public void sound() {

		System.out.println("엘지티비 소리를 틉니다.");
		
	}

	@Override
	public void changeChannel(int channel) {
	
		System.out.println("엘지티비" + channel + "로 이동합니다.");
	}
	@Override
	public void reset() {
		
		System.out.println("엘지티비 재부팅합니다.");
		
	}
	
}

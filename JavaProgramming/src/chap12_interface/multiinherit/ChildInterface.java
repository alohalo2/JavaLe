package chap12_interface.multiinherit;

public class ChildInterface implements MotherInterface, FatherInterface {

	@Override
	public void repair() {
		
		System.out.println("잘 고친다");

	}

	@Override
	public void calm() {
		
		System.out.println("침착하다");

	}

}

package chap99_homework.homework05.basic;

public class HybridCar implements ElectronicCar, FuelCar {

	@Override
	public void speedUp() {
		System.out.println("속도를 올린다.");

	}

	@Override
	public void speedDown() {
		System.out.println("속도를 낮춘다.");

	}

	@Override
	public void addFuel() {
		System.out.println("연료를 충전한다.");

	}

	@Override
	public void charge() {
		System.out.println("베터리를 충전한다.");

	}

	public static void main(String[] args) {

	}

}

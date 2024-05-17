package chap23_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import chap23_stream.car.HyundaiCar;

public class _16_CountingMethodEx {

	public static void main(String[] args) {
		
		// List<HyundaiCar> 생성하고
		// 아반떼, 3000
		// 아반떼, 3500
		// 아반떼, 2500
		// 소나타, 4000
		// 그랜저, 5000
		// 제네시스, 6000
		
		// 스트림처리를 통해서 가격이 최대값인 객체하나와
		// 가격이 최소값인 객체 하나를 찾아서 출력하세요. carInfo()

		List<HyundaiCar> carList = new ArrayList<>();
		
		carList.add(new HyundaiCar("아반떼", 3000));
		carList.add(new HyundaiCar("아반떼", 3500));
		carList.add(new HyundaiCar("아반떼", 2500));
		carList.add(new HyundaiCar("소나타", 4000));
		carList.add(new HyundaiCar("그랜저", 5000));
		carList.add(new HyundaiCar("제네시스", 6000));
		
/*int로 뽑아내는 것이 아니고 객체 안에서 값을 꺼내오기 때문에 객체의 변수로 만듦*/ 		
		HyundaiCar max =carList.stream() // price만 있는 것들을 모아서 새로운 stream을 만드는게 아니라 
										 // HyundaiCar 객체에서 price만 비교 후 값을 꺼내와야하기 때문에 mapToInt를 사용하지 않는다.
				 		.max(Comparator.comparing(num -> num.getPrice()))
				 		.get();
		
		max.carInfo();
		
		HyundaiCar min =carList.stream() // Comparator는 제네릭 타입에 필요한 내용을 정확히 입력하면 
							   .min(Comparator.<HyundaiCar, Integer>comparing(num -> num.getPrice()))
							   .get();

		min.carInfo();

		
	}

}

package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap23_stream.card.CreditCard;

public class _04_PipeLine {

	public static void main(String[] args) {

		/*
		 * 
		 * List<CreditCard> 생성
		 * 
		 * 카카오, 라이언카드, 1000
		 * 삼성카드, 탭탭오, 2000
		 * 신한카드, 드림카드, 3000
		 * 삼성카드, ID카드, 5000
		 * 현대카드, 더블랙, 10000
		 * 아멕스, 블랙카드, 100000
		 * 
		 * 
		 * 
		 * */
		// 1. 스트림 파이프라인을 통해서 최대한도가 5000이상인 카드정보를 출력
		// (최종처리로 forEach 사용, cardInfo 메소드 호출)
		
		List<CreditCard> creditcardList = new ArrayList<>();
		List<CreditCard> bigCardList = new ArrayList<>();
		
		creditcardList.add(new CreditCard("카카오", "라이언카드", 1000)); //CreditCard는 객체이기 때문에 인스턴스화로 불러와야 한다.
		creditcardList.add(new CreditCard("삼성카드", "탭탭오", 2000));
		creditcardList.add(new CreditCard("신한카드", "드림카드", 3000));
		creditcardList.add(new CreditCard("삼성카드", "ID카드", 5000));
		creditcardList.add(new CreditCard("현대카드", "더블랙", 10000));
		creditcardList.add(new CreditCard("아멕스", "블랙카드", 100000));
		
		// 파이프라인 없이 스트림 처리
		// creditcardList를 Stream으로 변환 -> List<creditcardList> -> Stream<Creditcard>
//		Stream<CreditCard> creditcardStream = creditcardList.stream();
		
		// 한도가 5000이상인 CreditCard만 모아서 새로운 Stream 생성
		// Stream<CreditCard>
		
//		Stream<CreditCard> overFiveCardStrem = creditcardStream.filter(card -> card.getLimit() >= 5000);
		
//		filter 메서드 사용 예시filter 메서드는 스트림의 각 요소에 대해 주어진 조건을 검사하고, 
//		그 조건을 만족하는 요소들만 포함하는 새로운 스트림을 반환합니다. (조건에 true인 것들만 모아준다)
		
		
//		언제 filter 메서드를 사용할지
//		1. 컬렉션이나 배열의 요소들 중 특정 조건을 만족하는 요소들만 추출하고 싶을 때
//		2. 필터링된 데이터를 기반으로 후속 작업(예: 매핑, 집계 등)을 수행하고 싶을 때
//		3. 코드의 가독성을 높이고, 복잡한 조건을 간단하게 표현하고자 할 때

		// forEach로 출력, forEach는 리턴값이 없다.
//		overFiveCardStrem.forEach(card -> card.cardInfo());
		
		// 1-2. 파이프라인으로 구성, 파이프라인은 여러개의 메소드를 한번에 불러서 사용할 수 있으므로 구성할 때는 구조를 잘 짜서 만들어야 한다.
		creditcardList.stream() // Stream<CreditCard>
						// 최대한도가 5000이상인 CreditCard 객체만 모은 Stream<CreditCard>
						.filter(card -> card.getLimit() >= 5000)
						// 최종단계 메소드
						// forEach로 출력
						.forEach(card -> card.cardInfo());
	
//		Stream<CreditCard> cardListStream = cardListStream.filter(
//				card -> {
//			
//					if(card.getLimit() >= 5000) {
//						bigCardList = card.getLimit().toList();
//					}
//					
//				});
				
//				hCar -> hCar.getModel().equals("아반떼"));
		
//		List<HyundaiCar> avanteList = avanteStream.toList();
	}

}

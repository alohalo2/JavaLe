package chap99_homework.homework10.basic;

import java.util.Scanner;

import chap99_homework.homework10.answer.COUNTRY;

public class Basic {

	public static void main(String[] args) {
		

//		1. 멤버변수로 private T t를 가지면서 getT(), setT() 메소드를 갖는 제네릭클래스 GenericCla를 생성하세요.

		class GenericCla<T> {
			
			private T t;
			
			public T getT() {
				return this.t;
			}
			
			public void setT(T t) {
				this.t = t;
			}
		}
		
		// 2.
		
		System.out.println(add(2,7));
		System.out.println(add('A','B'));
		System.out.println(add("A","B"));
		
		// 4. 
		
		String[] strArr = {"가","나","다"};
		int[] intArr = {1,2,3};
		Integer[] integerArr = new Integer[intArr.length];
		
		printArr(strArr);
		printArr(integerArr);
		
		
		// 7.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("한국, 중국, 일본, 미국 중 하나를 입력하세요.");
		String country = sc.nextLine();
		RepresentativeFood[] countryArr = RepresentativeFood.values();
		
		for(RepresentativeFood r : countryArr) {
			r.notifyFood(country);
		}

		sc.close();
		
//		RepresentativeFood rf = new RepresentativeFood();
//		
//		rf.notifyFood("중국");
		
	}
	
	
//		2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
//		   매개변수로 어떤 값이 들어오던 문자열 결합연산이 돼서 스트링값으로 리턴하도록 만드세요.
		
		public static <T> String add(T t1, T t2) {
		
			return t1.toString() + t2.toString();
		}

		
		
		
//		3. public static Integer sum(List<?> list) 와일드 카드를 이용하여 리스트의 총합을 구하는 메소드를 구현하세요.
		
//		public static Integer sum(List<?> list) {
//			
//			Integer sumList;
//			
//			for(int i = 0; i <list.size(); i++) {
//				sumList += list.get(i);
//			}
//			
//			return sumList;
//			
//		}
		
	
		
//		4. 어떤 배열이던지 받아서 인덱스가 3의 배수인 요소만 출력하는 메소드 void printArr을 구현하세요.
		
		public static <T> void printArr(T[] arr){
			
			for(int i = 1; i < arr.length; i++ /* i+=3 */) {
				if(i % 3 == 0) {
					System.out.println(arr[i]);
				} else {
					break;
				}
			}
		}
		
		
		
//		5. Number를 상속받은 클래스타입의 배열만 받아서 배열의 최소값을 구해서 리턴하는 메소드 getMin을 구현하세요.
		
		
		
		
//		6. Map을 어떤형태로든 받아서 value를 String으로 변경했을 때 길이가 10이상되는 key를 출력하는 메소드 void printOverTen을 구현하세요.
		
		
		
		
//		7. KOR, CHI, JAP, USA 네 개의 상수를 갖는 enum을 생성하고 첫 번째 값은 "나라 한글명"이고 두 번째 값은 "대표음식"으로 지정한다. 
//		   public void notifyFood(String country) 메소드를 만들고 country 값과 동일한 한글명인 나라의 음식을 다음과 같이 출력하도록 구현하세요. 
//		   country에 "중국"이 들어오면 "중국의 대표음식은 짜장면입니다."라고 나오도록 하세요. (각 국의 음식은 한국=불고기, 중국=짜장면, 일본=초밥, 미국=햄버거)

		
		
		

}
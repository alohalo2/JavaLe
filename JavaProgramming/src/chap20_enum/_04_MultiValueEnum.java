package chap20_enum;

import chap20_enum.enums.MultiValueMonth;

public class _04_MultiValueEnum {

	public static void main(String[] args) {
		
		MultiValueMonth january = MultiValueMonth.JAN; // enum 소환
		
		System.out.println(january + "는 " + january.getMonthValue() + "월입니다.");
		System.out.println(january + "의 풀네임은 " + january.getMonthFullName() + "입니다.");
	}

}

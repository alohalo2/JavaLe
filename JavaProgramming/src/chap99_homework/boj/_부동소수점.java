package chap99_homework.boj;

import java.io.UnsupportedEncodingException;

public class _부동소수점 {

	public static void main(String[] args) {

//		double a = 0.1;
//		double b = 0.2;
//		double c = 0.1;
//
//		if(a + b == c) {
//			System.out.println("Equal");
//		} else {
//			System.out.println("Not Equal");
//		}
//		
//		System.out.println(a + b);
		
        try {
            String text = "한";
            byte[] encoded = text.getBytes("EUC-KR");

            // 16진수로 출력
            StringBuilder hexResult = new StringBuilder();
            for (byte b : encoded) {
                // 0xFF로 마스킹하고, 16진수 문자열로 변환
                hexResult.append(String.format("%02X ", b & 0xFF));
            }

            System.out.println("EUC-KR 인코딩 (16진수): " + hexResult.toString());

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
		
	}

}

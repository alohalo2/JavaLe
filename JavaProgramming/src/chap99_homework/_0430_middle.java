package chap99_homework;

public class _0430_middle {
	
//		1. int 배열 한 개를 매개변수로 받아서 역순으로 저장된 새로운 배열을 리턴하는 메소드를 구현하세요.  
//		   실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. 
//		   static의 위치는 접근제어자와 리턴타입 사이입니다. 
//		   (예시 public static void add(int a, int b) { return a + b; })
		
		public static int[] reverse(int[] arr) {
			
			int [] arr2 = new int[arr.length];
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = (arr.length) - 1; j >= 0; j--) {
				arr2[j] = arr[i];
				}
			}	
			return arr2;
		}
		
//
//		2. char 배열 한 개를 매개변수로 받아서 소문자는 대문자로, 대문자는 소문자로 변환하는데 
//		   대문자로 변환된 값은 뒤로 하나 이동한 문자를 소문자로 변환된 값은 앞으로 하나 이동한 문자를 저장한 배열을 리턴하는 메소드를 구현하세요. 
//		   매개변수로 전달되는 char 배열에는 알파벳 대소문자만 존재합니다. 
//		   {'y', 'B', 'c', 'D'} 배열이 전달되면 {'Z', 'a', 'D', 'c'}가 리턴돼야 합니다. 
//		   그리고 만약 'z'가  입력되면 'A'가 'a'가 입력되면 'Z' 리턴돼야 합니다(알파벳 범위내에서만 이동할수 있도록). 
//		   실행클래스의 메인메소드 아래에 static 메소드로 선언하세요. static의 위치는 접근제어자와 리턴타입 사이입니다. 
//		   (예시 public static void add(int a, int b) { return a + b; })

//		public static char[] chr(char[] chrArr) {
//			
//			char[] chrArr2 = new char[chrArr.length];
//			
//			for(int i = 0; i < chrArr.length; i++) {
//				
//				if(65 <= chrArr[i] && chrArr[i] < 91) {
//					chrArr2[i] = chrArr[i].toLowerCase(); 
//				} 
//				
//				if(97 <= chrArr[i] && chrArr[i] < 123) {
//					if(chrArr[i] == 97 || chrArr[i] == 122) {
//						
//						chrArr2[i] = chrArr[i].toLowerCase(); 
//						
//					} else{
//						(char)(chrArr[i] - 57);
//					}
//					chrArr2[i] = chrArr.toUpperCase(char<chrArr[]>); 
//				}
//				
//			}
//			return chrArr2;
//		}
		
		
		
}



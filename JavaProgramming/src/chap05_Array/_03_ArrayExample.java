package chap05_array;

public class _03_ArrayExample {

	public static void main(String[] args) {
		
		// 3. chArr의 요소 중 소문자는 대문자로, 대문자는 소문자로 변환하여 convertArr에 저장하세요.
		char[] chArr = {'b', 'i', 't', 'c'};
		//{'B', 'I', 'T', 'C'}
		char[] convertArr = new char[4];
		
		for(int i = 0; i < chArr.length; i++) {
			if(chArr[i] >= 'A' && chArr[i] <= 'Z') {
				convertArr[i] = (char)(chArr[i] + 32);
				// convertA[i] = character.toLowerCase(chArr[i]));
			} else {
				convertArr[i] = (char)(chArr[i] - 32);
				// convertA[i] = character.toUpperCase(chArr[i]));
			}

			System.out.println(convertArr[i]);
		}
	}
}

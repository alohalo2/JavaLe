package chap99_homework.boj;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class _1978 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String firstLine = br.readLine();
			int N = Integer.parseInt(firstLine);
			
			String secondLine = br.readLine();
			String[] strArr = secondLine.split(" ");
			
			int[] numArr = new int[N];
            int primeCount = 0; // 소수 개수 카운트

            // 입력된 숫자를 배열에 저장
            for (int i = 0; i < N; i++) {
                numArr[i] = Integer.parseInt(strArr[i]);
            }

            // 소수 판별 및 출력
            for (int i = 0; i < N; i++) {
                if (isPrime(numArr[i])) {
                    primeCount++;
                }
            }

            bw.write(primeCount + "\n");
            
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 소수 판별 함수
	public static boolean isPrime(int num) {
	    if (num < 2) return false; // 2보다 작은 수는 소수가 아님
	    for (int i = 2; i <= num / 2; i++) { // 숫자의 절반까지만 확인
	        if (num % i == 0) return false; // 나누어 떨어지면 소수가 아님
	    }
	    return true; // 소수일 경우 true 반환
	    /*
	     * 반복문(for 루프):
	     * 이 반복문은 i가 2부터 시작해서 num / 2까지 증가하며 반복됩니다.
	     * num / 2까지만 반복하는 이유는, 어떤 수의 절반을 초과하는 수는 그 수를 나누어 떨어뜨릴 수 없기 때문입니다. 
	     * 예를 들어, num이 16이라면 16의 약수는 2, 4, 8이며, 이 값들은 모두 16의 절반 이하입니다. 
	     * 따라서 절반 이상의 수로 나누어 떨어질 가능성은 없으므로, 연산을 최적화하기 위해 반복을 num / 2까지만 수행합니다.
	     * 
	     * 나누어 떨어지는지 확인 (if 조건문):
	     * 반복문 안에서 num % i == 0이 참인지를 확인합니다. 이 조건은 num이 i로 나누어 떨어지는지 여부를 확인하는 것입니다.
	     * num % i는 num을 i로 나눈 나머지를 반환합니다. 이 값이 0이라면, num은 i로 나누어 떨어지며 i는 num의 약수가 됩니다.
	     * 만약 num이 i로 나누어 떨어진다면, 이는 num이 소수가 아니라는 의미이므로 false를 반환합니다.
	     * 
	     * */
	}
}


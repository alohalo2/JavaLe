package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class _9012_괄호 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int T = Integer.parseInt(br.readLine());

			while (T-- > 0) {
				String str = br.readLine();

				if (isVPS(str)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isVPS(String str) {
		Stack<Character> stack = new Stack<>();

		// () 짝이 맞아야 VPS가 되기 때문에 
		// '(' 나오면 push를 하고 ')' 나오면 pop으로 제거함
		// 그래서 중간에 ')' 나왔는데 stack이 비어 있을 경우에는 false를 리턴하고
		// for문을 다 돌고 최종적으로 stack이 비어 있어야 true를 리턴함
		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}

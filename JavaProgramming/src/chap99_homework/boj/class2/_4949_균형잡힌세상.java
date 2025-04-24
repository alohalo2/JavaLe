package chap99_homework.boj.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class _4949_균형잡힌세상 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			while (true) {
				String str = br.readLine();

				if (str.equals("."))
					break;

				if (isBalanced(str)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();

		// stack 자료구조로 여는 괄호 여부에 따라서 넣고 빼고 한다.
		// string을 char 배열로 변경해서 탐색
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')') {
				if (stack.isEmpty() || stack.peek() != '(') {
					return false;
				}
				stack.pop();
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.peek() != '[') {
					return false;
				}
				stack.pop();
			}
		}

		return stack.isEmpty();
	}

}

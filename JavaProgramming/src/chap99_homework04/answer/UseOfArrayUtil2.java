package chap99_homework04.answer;

public class UseOfArrayUtil2 {

	public static void main(String[] args) {
		
		int[] arr = ArrayUtility2.remove(new int [] {1, 2, 3, 4, 5, 1, 2, 3,},
				new int[] {1, 1, 1, 1, 2, 2, 1, 3, 2, 1, 3, 2});
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}

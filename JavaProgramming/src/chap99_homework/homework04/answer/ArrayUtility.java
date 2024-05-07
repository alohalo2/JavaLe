package chap99_homework.homework04.answer;

public class ArrayUtility {
	public static double[] intToDouble(int[] source) { // int[] -> double[]로 형변환
		double[] returnArr = new double[source.length];
		
		for(int i = 0; i < source.length; i++) {
			returnArr[i] = source[i];
		}
		
		return returnArr;
	}
	
	public static int[] doubleToInt(double[] source) { // double[] -> int[]로 형변환
		int[] returnArr = new int[source.length];
		
		for(int i = 0; i < source.length; i++) {
			returnArr[i] = (int)source[i];
		}
		
		return returnArr;
	}
}

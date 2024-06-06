package chap99_homework.objectarraytest;

public class Main {

	public static void main(String[] args) {
		
		//1차원 배열
		Student[] students = new Student[5];
		
		
		for(int i =0; i < students.length; i++) {
			students[i] = new Student("" + (i+1),"홍길동" + (i+1),"남자",Math.round(((Math.random()*100)+1)*100)/100.0);
		}
		for(int i = 0; i < students.length; i++) {
			System.out.println("-----------------------");
			students[i].show();
		}
		
		System.out.println("==========================================");
		
		Student[][] students2 = new Student[3][];
		
		students2[0] = new Student[2];
		students2[1] = new Student[3];
		students2[2] = new Student[1];
		
		for(int i = 0; i < students2.length; i++) {
			for(int j= 0; j < students2[i].length; j++) {
				students2[i][j] = new Student("" + (i+1), "홍길동" + (i+1), "남자" , Math.round(((Math.random()*100)+1)*100)/100.0);
			}
		}
		for(int i = 0; i < students2.length; i++) {
			for(int j = 0; j < students2[i].length; j++) {
				System.out.println("---------------------------");
				students2[i][j].show();
			}
		}
	}
}

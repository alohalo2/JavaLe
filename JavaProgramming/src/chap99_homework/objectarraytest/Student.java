package chap99_homework.objectarraytest;

public class Student {

	private String studentId;
	private String studentName;
	private String studentGender;
	private double studentCredit;
	
	public Student(String studentId, String studentName, String studentGender, double studentCredit) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentCredit = studentCredit;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	public double getStudentCredit() {
		return studentCredit;
	}
	public void setStudentCredit(double studentCredit) {
		this.studentCredit = studentCredit;
	}
	
	public void show() {
		System.out.println("학생 번호: " + getStudentId());
		System.out.println("학생 이름: " + getStudentName());
		System.out.println("학생 성별: " + getStudentGender());
		System.out.println("학생 학점: " + getStudentCredit());
	}
	
}

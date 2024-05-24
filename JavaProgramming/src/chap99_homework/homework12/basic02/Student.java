package chap99_homework.homework12.basic02;

public class Student {

//	1. 학생의 이름, 학번, 학과를 속성으로 가지고 학생의 정보를 저장하는 메소드와 학생의 정보를 출력하는 메소드를 갖는 학생 클래스를 생성하세요.
	
	private String sname;
	private int sno;
	private String major;
	
	
	public Student(String sname, int sno, String major) {
		this.sname = sname;
		this.sno = sno;
		this.major = major;
		
	}
	

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sno=" + sno + ", major=" + major + "]";
	}
	
	public void saveInfo(String sname, int sno, String major) {
		this.sname = sname;
		this.sno = sno;
		this.major = major;
		
	}
	
	
	public void studentInfo() {
		System.out.println("학생 이름은 " + this.sname);
		System.out.println("학생 학번은  " + this.sno);
		System.out.println("학생 학과는 " + this.major);
	}
	
	
}

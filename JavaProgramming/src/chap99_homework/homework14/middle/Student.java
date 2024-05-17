package chap99_homework.homework14.middle;

public class Student {

	int sno;
	String sName;
	int score;
	String grede;
	
	
	

	public int getSno() {
		return sno;
	}



	public void setSno(int sno) {
		this.sno = sno;
	}



	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public String getGrede() {
		return grede;
	}



	public void setGrede(String grede) {
		this.grede = grede;
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sName=" + sName + ", score=" + score + ", grede=" + grede + "]";
	}


	public Student(int sno, String sName, int score) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
		
	}



	public Student(int sno, String sName, int score, String grede) {
		this.sno = sno;
		this.sName = sName;
		this.score = score;
		this.grede = grede;
	}
	
	
	
	
}

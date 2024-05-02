package chap99_homework.homework03;

public class UserBook {

	
//	1. UserBook 클래스를 생성하세요.
//	basic 3번 문제에서 만든 User클래스 타입의 값을 100개 저장할 수 있는 
//	배열과 현재 배열에 위치를 저장하는 index를 필드로 생성합니다.
//	매개변수로 username과 password를 받아서 User 객체를 생성하여 
//	배열에 저장하는 메소드 saveUserInfo를 구현하세요. 이 때 User의 id는
//	index + 1로 지정합니다.
	
	User user = new User();
	
	User[] users = new User[100];
	int index = 0;
	
	public void saveUserInfo(User username, User password, User id) {
		
//		userbook [index] = new User(index + 1,username, password);
		
		
		users [index] = username;
		users [index] = password;
		users [index + 1] = id;
		index++;

	}
	
	public void printUserInfo(int index) {
		if(users[index] != null) {
			System.out.println("id: " + users[index].getId()
					+ ", username: " + users[index].getUserName()
					+ ", password: " + users[index].getPassword());
		}
	}
	 
	
	
	
	
	
	
	
	
}

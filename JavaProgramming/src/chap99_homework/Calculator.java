package chap99_homework;

//java.awt와 javax.swing 패키지에서 필요한 클래스들을 가져옵니다. 이 클래스들은 GUI 컴포넌트를 만들기 위해 필요합니다.
import javax.swing.*; // 운영체제에 상관없이 java에서 제공하는 기능을 가져옴
import java.awt.*; // 운영체제에 따른 화면구성을 도와줌
import java.util.ArrayList;

public class Calculator extends JFrame { // JFrame을 상속받음

//	GUI: 
//	GUI는 그래픽 사용자 인터페이스를 의미합니다. 
//	명령을 입력하거나 텍스트 기반의 입력을 하는 것이 아니라, 사용자가 아이콘, 메뉴, 버튼, 창 등의 그래픽 요소를 사용하여 
//	컴퓨터, 스마트폰, 기타 디지털 기기 등 전자 기기와 상호 작용할 수 있도록 하는 시각적 인터페이스를 말합니다.  
//	GUI의 목적은 기술 사용을 보다 직관적이고 사용자 친화적으로 만들어 사용자가 복잡한 시스템이나 응용 프로그램을 쉽게 탐색하고 작동할 수 있도록 하는 것입니다. 
//	GUI는 현대 컴퓨팅의 필수 요소가 되었으며 운영 체제, 웹 브라우저, 소프트웨어 애플리케이션 및 모바일 장치에서 널리 사용됩니다.
	
	public static void main(String[] args) {
		    new Calculator();
		
//	변수 생성: JTextField 변수, 계산식의 숫자를 담을 변수, 작동 기억하는 변수, 숫자와 연산 기호를 구분해서 담을 변수

//	private JTextField inputSpace;는 자바의 Swing 라이브러리를 사용하여 GUI를 구성할 때 텍스트 입력 필드를 선언하는 코드입니다. 이 코드의 의미를 자세히 설명하면 다음과 같습니다:
	JTextField inputSpace;
    String num = ""; //계산식의 숫자를 담음
    String prev_operation = ""; // 작동 기억하도록 변수 하나 생성
    ArrayList<String> equation = new ArrayList<String>();// 숫자와 연산 기호를 구분해서 담음
	
//    기본 레이아웃 관리자를 제거하면 컨테이너 내부에 있는 컴포넌트들의 위치와 크기를 프로그래머가 직접 지정할 수 있게 됩니다. 
//    이는 종종 특정한 레이아웃을 만들기 위해 필요합니다.
//
//    기본 레이아웃 관리자 제거 방법:
//    기본 레이아웃 관리자를 제거하려면 컨테이너(예: JFrame, JPanel)의 레이아웃을 null로 설정합니다. 
//    이렇게 하면 컨테이너는 더 이상 자동으로 컴포넌트의 크기와 위치를 조정하지 않습니다. 
//    대신, 프로그래머가 setBounds 메서드를 사용하여 각 컴포넌트의 위치와 크기를 명시적으로 지정해야 합니다.
//
//    기본 레이아웃 관리자 제거의 역할과 쓰임:
//    
//    1. 정확한 위치와 크기 설정:
//    - null 레이아웃을 사용하면 컴포넌트의 위치와 크기를 픽셀 단위로 정확하게 설정할 수 있습니다.
//    - 이는 종종 그래픽 디자인, 게임 인터페이스, 맞춤형 대시보드와 같은 정확한 배치가 필요한 애플리케이션에서 사용됩니다.
//    
//    2. 유연하지 않은 레이아웃:
//    - 자동으로 조정되지 않기 때문에, 윈도우 크기가 변경되거나 다른 해상도에서 실행될 때 레이아웃이 제대로 보이지 않을 수 있습니다.
//    - 이런 문제를 해결하기 위해, 윈도우 크기 변경 이벤트를 처리하여 컴포넌트의 위치와 크기를 재조정해야 합니다.
//    
//    3. 간단한 인터페이스:
//    - 간단한 애플리케이션이나 테스트 목적으로 빠르게 UI를 구성할 때 유용합니다.
//    - 그러나, 실제 배포할 애플리케이션에서는 일반적으로 더 유연하고 반응형 레이아웃 관리자를 사용하는 것이 좋습니다.
    
//    요약:
//    - 기본 레이아웃 관리자를 제거하면 컴포넌트의 위치와 크기를 직접 지정할 수 있지만, 창 크기 변경에 대한 유연성이 떨어집니다.
//    - null 레이아웃을 사용하면 특정한 레이아웃을 만들기 쉬워지지만, 유지보수가 어려워질 수 있습니다.
//    - 대부분의 경우, 반응형 레이아웃을 제공하는 레이아웃 관리자를 사용하는 것이 권장됩니다.
    
    
    JPanel panel = new JPanel();
    panel.setLayout(null); // 기본 레이아웃 관리자 제거
	
//	public static void main(String[] args) {
//		// 이 줄은 이벤트 디스패치 스레드에서 작업을 예약합니다. invokeLater는 GUI 생성을 스레드 안전하게 수행하도록 보장합니다.
//		javax.swing.SwingUtilities.invokeLater(new Runnable() {
//			
//			// 이 줄은 Runnable 인터페이스의 run 메서드의 구현을 시작합니다. 이 메서드 안의 코드는 이벤트 디스패치 스레드에 의해 실행됩니다.
//			@Override
//			public void run() {
//				
//				// 이 줄은 "Calculator"라는 제목을 가진 새로운 JFrame 객체를 생성합니다. JFrame은 제목, 테두리, 닫기, 최소화, 최대화 버튼 등을 가진 창입니다.
//				JFrame frame = new JFrame("Calculator"); 
//				// 이 줄은 JFrame의 기본 닫기 동작을 EXIT_ON_CLOSE로 설정합니다. 이는 창을 닫을 때 애플리케이션이 종료됨을 의미합니다.
//				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				// 이 줄은 JFrame의 선호 크기를 너비 800픽셀, 높이 300픽셀로 설정합니다.
//				frame.setPreferredSize(new Dimension(400, 600));
//				
//				// JFrame, JLabel, SwingConstants는 javax.swing 패키지에 속하며, 
//                // 창(JFrame), 텍스트 레이블(JLabel), 레이블 내 텍스트 정렬(SwingConstants)을 만드는데 사용됩니다.
//				// 이 줄은 "hello world!"라는 텍스트를 가지고, 텍스트를 가로로 가운데 정렬하는 SwingConstants.CENTER를 사용하여 새로운 JLabel 객체를 생성합니다.
//				JLabel label = new JLabel("hello world!", SwingConstants.CENTER); 
//				// 이 줄은 JLabel을 JFrame의 컨텐트 팬에 추가합니다.
//				frame.getContentPane().add(label);
//				
//				// Dimension과 Toolkit은 java.awt 패키지에 속하며, 컴포넌트의 크기를 처리하고 화면 크기 정보를 얻는 데 사용됩니다.
//				// 이 줄은 기본 디스플레이의 화면 크기(너비와 높이)를 얻어서 dim이라는 Dimension 객체에 저장합니다.
//				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//				// 이 줄은 JFrame의 위치를 화면 중앙으로 설정합니다. 이 좌표는 창이 가운데 오도록 계산됩니다: dim.width/2-800/2 및 dim.height/2-300/2.
//				frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);
//				
//				// 이 줄은 창의 크기를 서브 컴포넌트의 선호 크기와 레이아웃에 맞추도록 합니다.
//				frame.pack();
//				// 이 줄은 JFrame을 화면에 보이도록 설정합니다.
//				frame.setVisible(true);
//			}
//		});
//	}

//	public void setHour(int hour) {
//        if(hour < 0 || hour > 23) return; 
//        this.hour = hour;
//  }
//	public void setMinute(int minute) {
//        if(minute < 0 || minute > 59) return;
//        this.minute = minute;
//  }
//	public void setSecond(int second) {
//	       if(second < 0 || second > 59) return;
//	       this.second = second;
//	}
	
//	void 반환형을 가진 메서드에서 return 문은 값을 반환하지 않지만, 메서드의 실행을 즉시 종료하는 역할을 합니다. 
//	이는 특정 조건에서 메서드의 실행을 중단하고 메서드를 빠져나가기 위해 사용됩니다.
//			
//  조건문: if (hour < 0 || hour > 23)
//
//	이 조건문은 입력받은 hour 값이 0보다 작거나 23보다 큰지를 검사합니다. 
//	즉, 시간 값이 유효한 범위(0 ~ 23) 안에 있는지 확인합니다.
	
//	return 문: if (hour < 0 || hour > 23) return;
//
//	만약 hour 값이 유효하지 않다면 (hour < 0 또는 hour > 23인 경우), return 문이 실행됩니다.
//	이 return 문은 메서드를 즉시 종료시키며, 이후의 코드는 실행되지 않습니다. 
//	즉, this.hour = hour; 구문이 실행되지 않습니다.
//	
//	void 반환형에서 return의 의미
//	메서드 종료: void 반환형을 가진 메서드에서 return 문은 메서드를 종료시키는 역할을 합니다. 
//	반환값은 없지만, 더 이상 메서드 내의 코드를 실행하지 않고 메서드를 빠져나갑니다.
//	조건부 실행: 특정 조건이 만족될 때 메서드의 나머지 부분을 실행하지 않도록 제어할 수 있습니다. 
//	이는 메서드가 잘못된 데이터를 처리하지 않도록 하거나, 특정 상황에서는 작업을 수행하지 않도록 하기 위해 사용됩니다.
//
//	따라서, return 문은 메서드가 특정 조건에서 실행을 멈추게 하고, 잘못된 데이터를 인스턴스 변수에 할당하지 않도록 하는 중요한 역할을 합니다.

	}

}

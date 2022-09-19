package ch08.book.s0802;

public class RemoteControlExample {
	public static void main(String[] args) {
//		RemoteControl rc;    		// 인터페이스로 구현 객체인 Television과 Audio를 사용하려면 
//		rc = new Television();	// RemoteControl 타입 변수 rc를 선언하고 구현 객체를 대입.
//		rc = new Audio();
		
//		RemoteControl rc = new RemoteControl() {  //익명구현객체 
//			public void turnOn() { /* 실행문 */ }
//			public void turnOff() { /* 실행문 */ }
//			public void setVolume(int volume) { /* 실행문 */ }
//		};
		
		RemoteControl rc = null;		// 인터페이스 변수 선언
		
		rc = new Television();			// Television 객체를 인터페이스 타입에 대입
		rc.turnOn(); 						// 인터페이스의 turnOn(), turnOff() 호출 
//		rc.turnOff();
		rc.setMute(true);// 디폴트 메소드 사용 
		
		rc = new Audio();				// Audio 객체를 인터페이스 타입에 대입 
		rc.turnOn();						// 인터페이스의 turnOn(), turnOff() 호출 
//		rc.turnOff();
		rc.setMute(true);//디폴트 메소드 사용 
	}
}

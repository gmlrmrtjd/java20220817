package ch08.book.s0802;

public interface RemoteControl {
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메소드 : 메소드 선언부만 작성
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디볼트 메소드 : 실제 내용까지 작성 
	default void setMute(boolean mute) {   		// 무음처리 기능 
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
		else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBatterty() {					//배터리 교환기능
		System.out.println("건전지를 교환합니다.");
	}
}

package ch08.book.s0802;
// 구현 클래스 
public class Audio implements RemoteControl{
	//필드
	private int volume;
	private boolean mute;
	
	//turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	//setVolum() 추상 메소드의 실체 메소드
	public void setVolume(int volume) {							// 인터페이스 상수를 이용해
		if(volume>RemoteControl.MAX_VOLUME) {				// volume 필드의 값을 제한 
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	@Override  // 디폴트 메소드 재정의
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 무음 처리");
		}
		else {
			System.out.println("오디오 무음 해제");
		}
	}
}

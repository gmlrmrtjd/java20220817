package ch08.book.s0802;

public class SmartTelevision implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("TV on");
	}
	public void setVolme(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {				// RemoteControl의 추상 메소드에 대한 실체 메소드 
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	public void search(String url) {  								// Searchable의 추상 메소드에 대한 실체 메소드 
		System.out.println(url + "을 검색합니다. "); 				// search() 추상 메소드는 매개값으로 URL을 받는다. 
	}
}

package ch08.book.s0805;

public class HankookTire implements Tire {
	@Override
	public void roll() { 		// Tire 인터페이스 구현 
		System.out.println("한국 타이어가 굴러갑니다.");  
	}
}

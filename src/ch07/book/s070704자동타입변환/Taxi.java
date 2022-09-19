package ch07.book.s070704자동타입변환;

public class Taxi extends Vehicle {

	@Override
	public void run() {
//		super.run();   //부모클래스 메소드 호츨 
		System.out.println("택시가 달립니다.");
	}
	
}

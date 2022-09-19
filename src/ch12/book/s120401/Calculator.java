package ch12.book.s120401;
// 공유 객체 
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}
		
	public void setMemory(int Memory) {			// 계산기 메모리에 값을 저장하는 메소드
		this.memory = memory;						// 매개값을 memory 필드에 저장 
		try {											// 스레드를 2초간 일시 정지시킴 
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}									// 스레드의 이름 							메모리 
}
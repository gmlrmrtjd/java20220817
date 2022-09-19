package ch07.book.s070804;

public abstract class Animal {
	public String kind;
	
	public void brathe() {
		System.out.println("숨을 쉽니다.");
	}
	public abstract void sound() ;
}


package ch13.book.s1304;
// 제네릭 타입 
public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t = t; }
}

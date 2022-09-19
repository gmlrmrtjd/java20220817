package ch13.book.s1302;
// Box 클래스 
//public class Box {
//	private Object object;
//	public void set(Object objec) {this.object = object; }
//	public Object get() { return object; }

public class Box<T> {
	private T t;
	public T get() { return t; }
	public void set(T t) { this.t  = t; }
}

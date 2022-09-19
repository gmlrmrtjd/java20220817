package ch13.book.s1302;

public class BoxExample {
	public static void main(String[] args) {
//		Box box = new Box();
//		box.set("홍길동");						// String -> Object (자동 타입 변환)
//		String name = (String) box.get();		// Object -> String (강제 타입 변환)
//		
//		box.set(new Apple());					// Apple -> Object (자동 타입 변환)
//		Apple apple = (Apple) box.get();		// Object -> Apple (강제 타입 변환)
		
		Box<String> box1 = new Box<String>();
		box1.set("hello");
		String str = box1.get();
		
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);;
		int value = box2.get();
	}
}

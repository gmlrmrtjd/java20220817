package ch13.book.s1304;

// 제네릭 메소드 호출 
public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int intValue = box1.get();
		
		Box<String> box2 = Util.boxing("홍길동");
		String StrValue = box2.get();
	}
}

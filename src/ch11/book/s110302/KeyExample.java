package ch11.book.s110302;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		String alue = hashMap.get(new Key(1));
		System.out.println(value);
	}
}

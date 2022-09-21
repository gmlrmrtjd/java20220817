package ch16.lecture.p02stream;

import java.util.function.Function;

public class LamdaStreamNGS2 {
	public static void main(String[] args) {
		// supplier 는 입력X, 출력O
		// 입력이 없는 MyClass를 생성만 한다.
		
//		Function<Integer, int[]> f = new int[x]; 	//람다식
//		Function<Integer, int[]> f2 = int[]::new;	// 메서드 참조 
		
//		Supplier<MyClass> s = () -> new MyClass();
//		Supplier<MyClass> s = 클래스이름::메서드이름;
//		Supplier<MyClass> s =	MyClass::new;		
		
//		MyClass mc = s.get();	// MyClass객체 반환 
//		System.out.println(mc);
//		System.out.println(s.get()); 	// supplier가 만든 객체가 반환한 것을 얻어옴 
		
		
		Function<Integer, MyClass> f = (i) -> new MyClass(i);	// i를 받고 MyClass를 받는다 
//		Function<Integer, MyClass> f = MyClass::new;
		MyClass mc = f.apply(100);		// apply: function에서 쓰는 얻기
		System.out.println(mc.iv);
		// ==
		System.out.println(f.apply(200).iv);
		
		
		// 배열 만들기 
		Function<Integer, int[]> f2 = (i) -> new int[i];  // 배열생성은 function으로 (배열의 길이를 줘야하기 떄문)
//		Function<Integer, int[]> f2 = int[i] new;	// 메서드 참조 
		int[] arr = f2.apply(100); 
		
		System.out.println(f2.apply(100).length);
	}
}

class MyClass {
	int iv;
	
	MyClass(int iv) {
		this.iv = iv;		// 이제 iv에 뭘 줘야함 
	}
}
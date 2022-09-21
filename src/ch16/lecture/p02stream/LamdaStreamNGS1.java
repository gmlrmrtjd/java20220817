package ch16.lecture.p02stream;

import java.util.function.Function;

public class LamdaStreamNGS1 {
	public static void main(String[] args) {
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//		Function<String, Integer> f = 클래스이름::메서드이름;
		Function<String, Integer> f =  Integer::parseInt;	// 메서드 참조 
		Function<String, Integer> f =  (String s) -> Integer.parseInt(s);	// 메서드 참조 

		System.out.println(f.apply("100")+200);
	}
}

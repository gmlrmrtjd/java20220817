package ch16.lecture.p02stream;

import java.util.Optional;
import java.util.OptionalInt;

public class Optional2 {
	public static void main(String[] args) {
		Optional<String> optStr = Optional.of("abcde");
		Optional<Integer> optInt = optStr.map(String::length);
		System.out.println("optStr=" + optStr.get());
		System.out.println("optInt=" + optInt.get());
		
		int result1 = Optional.of("123")
							.filter(x->x.length() >0)
							.map(Integer::parseInt).get();
							
		int result2 = Optional.of("")
							.filter(x->x.length() >0)
							.map(Integer::parseInt).orElse(-1);
		
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		
		Optional.of("456").map(Integer::parseInt)
							  .ifPresent(x -> System.out.printf("result3=%d%n" ,x));
		
		OptionalInt optInt1 = OptionalInt.of(0);	// 0을 저장
		OptionalInt optInt2 = OptionalInt.empty();	// 빈 개체를 저장
		
		System.out.println(optInt1.isPresent());	//true
		System.out.println(optInt2.isPresent());	// false
		
		System.out.println(optInt1.getAsInt()); 	// 0
		
	}
}

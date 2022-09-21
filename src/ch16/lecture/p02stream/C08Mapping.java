package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class C08Mapping {
	public static void main(String[] args) {
		String res = IntStream.of(3, 5, 9, 1, 0)
				.boxed()
				.sorted((a, b) -> b - a)
				
				.forEach((e) -> System.out.println(e));
		System.out.println(res);
	}
}

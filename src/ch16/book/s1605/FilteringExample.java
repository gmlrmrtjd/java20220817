package ch16.book.s1605;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "신용권", "감자바", "신용권", "신민철");

		names.stream()
				.distinct() // 중복 제거
				.forEach(n -> System.out.println(n));
		System.out.println();

		names.stream()	// 필터링 
				.filter(n -> n.startsWith("신"))
				.forEach(n -> System.out.println(n));
		System.out.println();

		names.stream()
				.distinct()	//중복 제거 후 필터링 
				.filter(n -> n.startsWith("신"))
				.forEach(n -> System.out.println(n));
	}
}

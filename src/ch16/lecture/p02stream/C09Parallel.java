package ch16.lecture.p02stream;

import java.util.List;

public class C09Parallel {
	public static void main(String[] args) {
		List<String> list1 = List.of("java", "spring", "css", "jsp", "html");
		
		// 병렬 스트림 순서 없음 
		list1.parallelStream()
		.forEach((e) -> System.out.println(e));
		
		System.out.println();
		
		// 순서 고정 
		list1.parallelStream()
		.forEachOrdered((e) -> System.out.println(e));
	}
}

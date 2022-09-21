package ch16.lecture.p02stream;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C20Collect {
	public static void main(String[] args) {
		String res = IntStream.of(9, 7, 1, 0)
				.boxed()
				.map(String::valueOf) // integer를 string으로 맵화 
				.collect(Collectors.joining(", "));  // 적절한 Collector를 넣어서 
		
		System.out.println(res);  // "9, 7, 1, 0"
	}
}

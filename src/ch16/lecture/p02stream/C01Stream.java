package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;


public class C01Stream {
	public static void main(String[] args) {
		List<String> list = List.of("java", "css", "spring", "js", "html"); //리스트 
		Stream<String> stream1 = list.stream(); // stream() 메소드를 사용하여 list로부터 stream을 생성  
		stream1.forEach(System.out::print); // forEach()는 최종연산 : 스트림이 닫힘 
		
		Set<String> set = Set.of("ironman", "hangman", "batman", "superman", "iceman");
		Stream<String> stream2 = set.stream();
		
		String[] arr = {"rm", "jimin", "v", "jungkuk"};
		Stream<String> stream3 = Arrays.stream(arr);
		
		Stream<String> stream4 = Stream.of("captain", "widow", "panther");
		
	}
}









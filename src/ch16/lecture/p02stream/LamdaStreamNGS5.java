package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class LamdaStreamNGS5 {
	public static void main(String[] args) {
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"abc", "ef", "jkl"},
				new String[] {"ABC", "GHI", "JKL"}				
				);
		
//		Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm
			.map(String::toLowerCase)	// 스트림의 요소를 모두 소문자로 변경 
			.distinct()		// 중복제거 
			.sorted()		// 정렬 
			.forEach(System.out::println);
		System.out.println();
		String[] lineArr = {
				"Belive or not It is true",
				"Do or do nt There is no try",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))	// (" +") : 하나 이상의 공백을 나타내는 정규식  
			.map(String::toLowerCase)	// 소문자변환 
			.distinct()	//중복제거 
			.sorted()// 정렬 
			.forEach(System.out::println);
				
	}
}

package ch16.lecture.p02stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamNGS {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1,2,3,4,5);
//		Stream<Integer> intStream = list.stream(); // list를 stream으로 변환
//		intStream.forEach(System.out::print); // forEach() 최종연산
//		
//		// stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
//		intStream = list.stream(); // list로 부터 stream을 생성
//		intStream.forEach(System.out::print);
//		
//		String[] strArr = new String[] {"a","b","c","d"};
//		Stream<String> strStream = Stream.of(strArr);
//		strStream.forEach(System.out::println);
		
		String[] strArr = new String[] {"a","b","c","d"};
//		Stream<String> strStream = Stream.of(strArr);
//		Stream<String> strStream1 = Stream.of(new String[] {"a","b","c","d"});
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);  //기본형 배열일 때는 IntStream 쓰는게 편리 
		intStream.forEach(System.out::println);
//		System.out.println("count=" + intStream.count());
//		System.out.println("sum=" + intStream.sum());
		System.out.println("average=" + intStream.average());
		
//		Integer[] intArr1 = {1,2,3,4,5};
////		Integer[] intArr1 = new Integer[] {1,2,3,4,5};
//		Stream<Integer> intStream1 = Arrays.stream(intArr1);
////		intStream1.forEach(System.out::println);
//		System.out.println("count=" + intStream.sum());
		
	}
}

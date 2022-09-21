package ch16.lecture.p02stream;

import java.util.stream.Stream;

public class StreamNGS4 {
	public static void main(String[] args) {
		
		// 람다식이 들어간 스트림 
		// iterate(T seed, UnaryOperator f) 단항 연산자 : 입력 하나 결과 하나 
//		Stream<Integer> intStream = Stream.iterate(0, n-> n+2); 	// 0부터 2플러스 =짝수 
//		Stream<Integer> intStream = Stream.iterate(2, n-> n+2); 	// 2부터 2플러스 
		Stream<Integer> intStream = Stream.iterate(1, n-> n+2); 	// 1부터 2플러스= 홀수  

		intStream.limit(10).forEach(System.out::println);	// 10개만 뽑기 
		
		
		// generate(Supplier s) : 주기만 하는것 입력x , 출력o
		Stream<Integer> oneStream = Stream.generate(()->1);	// 무한 스트림 
		oneStream
		.limit(10)
		.forEach(System.out::println);
		
		
	}
}

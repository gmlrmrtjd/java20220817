package ch16.lecture.p02stream;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamNGS2 {
	public static void main(String[] args) {
		IntStream intStream = new Random().ints(); // 무한스트림  
		intStream
		.limit(5)	// 5개 자르기 
		.forEach(System.out::println);
		
		IntStream intStream1 = new Random().ints(5); // 5개 자르기   
		IntStream intStream2 = new Random().ints(5, 10); // 범위 지정하기   
		IntStream intStream3 = new Random().ints(10 ,5, 20); // 범위속 10개만 자르기   
 
		
	}
}

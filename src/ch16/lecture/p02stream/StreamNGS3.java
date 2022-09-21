package ch16.lecture.p02stream;

import java.util.stream.IntStream;

public class StreamNGS3 {
	public static void main(String[] args) {
		
		IntStream intStream = IntStream.range(1, 5); // 1,2,3,4,
		IntStream intStream1 = intStream.rangeClosed(1,5) // 1,2,3,4,5
	}
}

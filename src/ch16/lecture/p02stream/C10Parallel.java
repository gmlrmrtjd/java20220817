package ch16.lecture.p02stream;

import java.util.stream.*;
// 병렬 스트림이 순차 스트림보다 빠르다 
public class C10Parallel {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();  // 시작 시간 기록 
		double avg1 = IntStream.range(1, Integer.MAX_VALUE)
				.filter((n) -> n%2 == 0)
				.average()
				.getAsDouble();
		long end = System.currentTimeMillis();  // 종료 시간 기록 
		
		System.out.println(avg1);
		System.out.println("순차스트림 걸린시간:" + (end - start) + "ms");
		
		
	
		start = System.currentTimeMillis();
		double avg2 = IntStream.range(1, Integer.MAX_VALUE)
				.parallel()	// 병렬 스트림 변환 
				.filter((n) -> n % 2 == 0)
				.average()
				.getAsDouble();
		end = System.currentTimeMillis();
		
		System.out.println("병렬스트림 걸린시간:" + (end - start) + "ms");
				
				
	}
}

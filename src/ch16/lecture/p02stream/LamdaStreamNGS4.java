package ch16.lecture.p02stream;

import java.io.File;
import java.util.stream.Stream;

public class LamdaStreamNGS4 {
	public static void main(String[] args) {
		File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")
		};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		// map()으로 Stream<File>을 Stream<String>으로 변환
		Stream<String> filenameStream = fileStream.map(File::getName);
		filenameStream.forEach(System.out::println); // 모든 파일의 이름을 출력
		
		fileStream = Stream.of(fileArr); // 스트림을 다시 생성
		
		fileStream.map(File::getName)	 	// Stream<File> -> Stream<String>
			.filter(s -> s.indexOf('.') != -1)	// 확장자가 없는 것은 제외
			.peek(s -> System.out.printf("filename=%s%n", s))	// 중간중간 이상없는지 확인용 
			.map(s -> s.substring(s.indexOf('.')+1))	// 확장자만 추출
			.peek(s -> System.out.printf("extension=%s%n", s))
			.distinct()							// 중복 제거
			.forEach(System.out::println);	// JAVABAKTXT
		
		System.out.println();
	}
}

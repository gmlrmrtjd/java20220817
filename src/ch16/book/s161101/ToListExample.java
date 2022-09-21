package ch16.book.s161101;

import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE),
				new Student("김수애", 6, Student.Sex.FEMALE),
				new Student("신용권", 10, Student.Sex.MALE),
				new Student("수미 ", 6, Student.Sex.FEMALE)
				);
		
		// 남학생들만 묶어 List 생성
		List<Student> maleList = totalList.stream()
				.filter(s->s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream()
			.forEach(s -> System.out.println(s.getName()));
			
		System.out.println();
		
		
		
	}
}

package ch16.book.s161103;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//성별로 그룹핑하기 
public class GroupingByExample {
	public static void main(String[] args) {
		List<Student> totalList = Arrays.asList(
				new Student("홍길동", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("김수애", 6, Student.Sex.MALE, Student.City.Seoul),
				new Student("신용권", 10, Student.Sex.MALE, Student.City.Seoul),
				new Student("박수미", 6, Student.Sex.MALE, Student.City.Seoul));

		Map<Student.Sex, List<Student>> mapBySex = totalList.stream()
				.collect(Collectors.groupingBy(Student::getSex));

		System.out.println("[남학생] ");
		mapBySex.get(Student.Sex.MALE).stream()
				.forEach(s -> System.out.print(s.getName() + " "));

		System.out.println("\n[여학생] ");
		mapBySex.get(Student.Sex.FEMALE).stream()
				.forEach(s -> System.out.print(s.getName() + " "));

		System.out.println();

		Map<Student.City, List<String>> mapByCity = totalList.stream()
				.collect(
						Collectors.groupingBy(
								Student::getCity,
								Collectors.mapping(Student::getName, Collectors.toList())
								)
						);
		
		System.out.println("\n[서울] ");
		mapByCity.get(Student.City.Seoul).stream().forEach(s->System.out.print(s + " "));

	}
}

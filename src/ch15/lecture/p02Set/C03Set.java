package ch15.lecture.p02Set;

import java.util.HashSet;
import java.util.Set;

public class C03Set {
	public static void main(String[] args) {
		// Set만들기
		Set<String> set1 = new HashSet<>(); // 수정가능한 set
		set1.add("bob");
		set1.add("hangman");
		set1.add("goose");
		
		set1.remove("goose");
		
		System.out.println(set1);
		
		System.out.println();
		
		//수정 불가능한 Set
		Set<String> set2 = Set.of("thor", "hulk", "batman");
		
		System.out.println(set2);
	}
}

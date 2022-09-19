package ch15.lecture.p02Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		//전체 탐색 방법
		Set<String> set  = new HashSet<>();
		set.add("java");
		set.add("spring");
		set.add("jsp");
		set.add("css");
		set.add("html");
		set.add("java");
		
		System.out.println("<향상된 for 문>");
		for(String element : set) {
			System.out.println(element);
		}
		System.out.println();
		
		System.out.println("<Iterator 사용>");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());  //next() : 꺼내고 커서 옮김 
		}
		System.out.println();
		
		System.out.println("<forEach 메소드 사용");
		set.forEach((e) -> System.out.println(e));
	}
}

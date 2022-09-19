package ch15.lecture.p01List;

import java.util.List;
import java.util.Vector;
// Vector : thread-safe 를 원한다면 써라 
public class C05Vector {
	public static void main(String[] args) {
		List<String> list = new Vector<>();
		list.add("java");
		list.add("css");
		System.out.println(list);
		
		list.remove(0);
		System.out.println(list);
		
		list.add(0, "spring");
		System.out.println(list);
		
		for (String item : list) {
			System.out.println(item);
		}
	}
}

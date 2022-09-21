package ch16.lecture.p02stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class C12Collet {
	public static void main(String[] args) {
		List<Integer> list1 = IntStream.range(1, 100)
				.parallel()
				.filter(n -> n %2 == 0)
				.collect(() -> new ArrayList<>(), (r, e) -> r.add(e), (r1,r2) -> r1.addAll(r2));
				// new ArrayList로 r리스트 생성 및 e 원소를 r1, r1리스트에 넣은 후 r2를 모두 r1에 넣음 
		
		System.out.println(list1);
	}
}

package ch15.lecture.p04sortedSet;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class C02SortedSet {
	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
	
		set.add(300);
		set.add(100);
		set.add(88);
		set.add(1000);
		set.add(-1);
		
		System.out.println(set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		System.out.println(set.headSet(100));	// 100보다 작은 것 
		System.out.println(set.tailSet(500));		// 500 보다 큰 것 
		
		NavigableSet<Integer> nset = (NavigableSet<Integer>) set;
		
		System.out.println(nset.lower(99));  // 99보다 작은것
		System.out.println(nset.floor(99));  // 99포함 작은것
		System.out.println(nset.higher(99)); // 99 포함 큰것
		System.out.println();
		System.out.println(nset.ceiling(99)); // 99보다 큰것  하나 
	}
}

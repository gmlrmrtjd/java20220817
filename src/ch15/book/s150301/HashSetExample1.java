package ch15.book.s150301;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");								//"Java"는 한번만 저장됨 
		set.add("jdbc");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		Iterator<String> iterator = set.iterator();	//반복자 얻기
		while(iterator.hasNext()) {					//객체 수만큼 루핑
			String element = iterator.next();		//한 개의 객체를 가져온다.
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size()); 	// 저장된 객체 수 얻기 
		
		iterator = set.iterator();								//반복자 얻기 
		while(iterator.hasNext()) {							// 객체 수만큼 루핑
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.clear();											// 모든 객체를 제거하고 비움 
		if(set.isEmpty()) {System.out.println("비어 있음"); }
		
		
		for(String element: set) {
			System.out.println(element);
		}
	}
}

package ch15.book.s150401;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("ehdwkdrnjs", 80);
		map.put("홍길동", 95);	// 중복되지 않음 
		System.out.println("총  Entry 수: "+ map.size()); 	// 저장된 총 entry  수 얻기 
		
		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동"));	// 이름(키)으로 점수(값)를 검색 
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();		// key Set얻기 
		Iterator<String> keyIterator = keySet.iterator();	// 반복해서 키를 얻고 값을 Map에서 얻어냄 
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
			
		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();	// Map.Entry Set 얻기 
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {	// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄 
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		// 객체 전체 관리
		map.clear();	// 모든 Map.Entry 삭제 
		System.out.println("총 Entry 수 : "+ map.size());

		}
		
}


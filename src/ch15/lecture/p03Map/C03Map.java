package ch15.lecture.p03Map;
// leetCoding : 1748, 1512, 2006, 2206 , 2215
import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		Map<String, String> map1 = new HashMap<>();
		map1.put("korea", "seoul");
		map1.put("japan", "tokyo");
		map1.put("us", "new youk");
		map1.put("uk", "london");
		map1.put("france", "paris");	
		
		System.out.println(map1);
		
		
		//of 메소드 사용 (수정 불가능, 랜덤정렬)
		Map<String, String> map2 = Map.of("seoul", "korea", "busan", "korea", "osaka", "japan", "newyouk", "ul");
		System.out.println(map2);
		
//		map2.put("london", "uk");
//		map2.put("busan", "china");
//		map2.remove("osaka");
		
		System.out.println(map2.size());
		System.out.println(map2.containsKey("seoul"));
		System.out.println(map2);
	}
}

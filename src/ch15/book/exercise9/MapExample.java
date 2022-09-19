package ch15.book.exercise9;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null; 	// 최고 점수를 받은 아이디 저장
		int maxScore = 0; 	// 최고 점수 저장
		int totalScore = 0;	// 점수 합계 저장 
		
		System.out.println(map);
//		System.out.println(map.values());
		// 작성 위치 
		
		// 평균 점수
		int allsc = 0;
		for(int key : map.values()) {
			allsc += key;
		}
		int arg = allsc / map.size();
		System.out.println("평균점수: " + arg);
		
		// 최고 점수
		int maxsc = 0;
		String maxclr;
		for(int key : map.values()) {
			maxsc = Math.max(maxsc, key);
			maxclr = 
		}
		System.out.println("최고점수 : " + maxsc);
		
		
	}
}

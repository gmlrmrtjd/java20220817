package ch04.lecture;

public class C06 {
	public static void main(String[] args) {
		
		System.out.println(1);
		
		// 실행흐름
		// 1 -> 2 -true-> 3 -> 5 -반복-> 2
		//             -false-> for문 종
		for ( int i = 1 ;    // 1. 초기값 
				i <= 3 ;    // 2. 조건식
				
				     // 4. 증감식
				i++ ) {   // 3. 실행문(코드블럭)
			System.out.println(2);
			System.out.println(3);
		}
		
	}
}

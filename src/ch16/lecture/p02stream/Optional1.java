package ch16.lecture.p02stream;

import java.util.Optional;
// null일때 출력 
public class Optional1 {
	public static void main(String[] args) {
		int[] arr = {};
		System.out.println("arr.length=" + arr.length);

//		int[] arr1 = null;	// 예외발생 
		int[] arr1 = new int[0];
		System.out.println("arr.length=" + arr1.length);
		
		System.out.println();
		
//		Optional<String> opt = null; // 실행되지만 바람직X
		Optional<String> opt = Optional.empty();
		Optional<String> opt1 = Optional.of("abc");
		System.out.println("opt= " + opt);
		System.out.println("opt1= " + opt1);
		
		System.out.println();
		
		// 내부 원소 얻기 
//		System.out.println("opt= " + opt.get()); // 값이 없어서 예외발생, get잘 안씀 
		System.out.println("opt1= " + opt1.get());
		// get 대신 쓰는법 
		String str = "";  // 초기화 후 
		String str1 = "";
//		try {				 
//			str = opt.get();	// 예외 처리:surround With->try catch block 선택
//		} catch (Exception e) {
//			str = "";  // 예외가 발생하면 빈문자열("")로 초기화 
//		} // 예외발생
		
		str = opt.orElse("EMPTY"); 	// Optional에 저장된 값이 null 이면 "" 반환 
		str1 = opt1.orElse("EMPTY");
		str = opt.orElseGet( ()-> new String());	// 람다식으로 
		str = opt.orElseGet( String::new);	// 메소드 참조식으로 

		System.out.println("str=" + str);
		System.out.println("str1=" + str1);

		
		
		

		
		
	}
}

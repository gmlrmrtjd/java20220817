package ch04.lecture.p01control;

import java.util.Scanner;     // java.util 패키지 내에 있는 Scanner 클래스 사용하겠다는 의미 

public class C15Scanner {
	public static void main(String[] args) {
		String src = "hello my javascript";		// 문자열 src 할당 
		Scanner scanner = new Scanner(src);
		// Scanner라는 타입의 scanner 객체를 만들고, new 여산자를 통해 Scanner 생성자를 호출 
		
		String t1 = scanner.next();   // 객체.next() : 처음 띄어쓰기 전까지 스캔 
		System.out.println(t1);
		
		String t2 = scanner.next();
		System.out.println(t2);
		
		String t3 = scanner.next();
		System.out.println(t3);
		
		
		String src2 = "123 456 789";
		scanner = new Scanner(src2);
		String t4 = scanner.next();
		System.out.println(t4);
		
		int i1 = Integer.valueOf(t4);  // int타입으로 변
		System.out.println(i1);
		System.out.println(i1 * 2);
		
		int i2 = scanner.nextInt();
		System.out.println(i2);
		
		String src3 = "hello world\nhello java\nhello spring" ;  // \n : new line
		System.out.println(src3);
		
		scanner = new Scanner(src3);
		
		String line1 = scanner.nextLine();    // nextLine() : 새로운 줄이 나올 떄 까지 읽음
		System.out.println(line1);
		
		String line2 = scanner.nextLine();
		System.out.println(line2);
		
		String line3 = scanner.nextLine();
		System.out.println(line3);
		
		
		System.out.println("사용자 입력받기");
		scanner = new Scanner(System.in);    // System.in : 콘솔로부터 데이터를 입력받는다.(stream)
		
		String input1 = scanner.next();
		
		System.out.println("입력한 첫번째 토큰 : " + input1);
		
		int input2 = scanner.nextInt();
		
		System.out.println("입력한 두번쨰 토큰 (정수): " + input2);
		
		
		
	}
}

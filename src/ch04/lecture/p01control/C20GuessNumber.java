package ch04.lecture.p01control;

import java.util.Scanner;

public class C20GuessNumber {
	public static void main(String[] args) {
		int com = (int) (Math.random() * 100) + 1;

		Scanner scanner = new Scanner(System.in);
		
		int user = 0;
		
		do {
			System.out.println("(1~100) 입력 : ");
			
			user = scanner.nextInt();
			
			if( com == user) {
				System.out.println("정답");
				
			}
			else if (com > user) {
				System.out.println("큰값입력 ");
				
			}
			else {
				System.out.println("작은값입력 ");
			}
		}while (com != user);
		scanner.close();
		System.out.println("프로그램 종료");
		
	}
}

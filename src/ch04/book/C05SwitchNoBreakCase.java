package ch04.book;

public class C05SwitchNoBreakCase {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;		// 8<=~~~<=11사이의 정수 뽑기 (break없을때)
		System.out.println("[현재시간: " + time + " 시]");
		
		switch(time) {
			case 8:
				System.out.println("춤근합니다.");
			case 9:
				System.out.println("회의를 합니다.");
			case 10:
				System.out.println("업무를 보니다.");
			default:
				System.out.println("외근을 나갑니다.");
		}
	}
}

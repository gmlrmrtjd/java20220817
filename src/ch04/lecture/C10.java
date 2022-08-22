package ch04.lecture;

public class C10 {
	public static void main(String[] args) {
		System.out.println("====================");
		System.out.println("====================");
		for ( int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("====================");
		for ( int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		System.out.println("=====================");
		for ( int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("=====================");
		for ( int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				System.out.print(j-1);
			}
			System.out.println();
		}
		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);
			}
			System.out.println("");
		}
		System.out.println("====================");
		for (int i = 1; i <=5; i ++) {
			for (int j = 1; j <= 5-i; j ++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= i; a++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("====================");
		for (int i = 5; i >=1; i --) {
			for (int j = 1; j <= 5-i; j ++) {
				System.out.print(" ");
			}
			for (int a = 1; a <= i; a++) {
			System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("====================");
		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			// * 출력
			for (int l = 5; l > i; l--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------");
		for (int i = 0; i < 5; i++) {
			// space 출력
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			
			// * 출력
			for (int l = 0; l <= i; l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("--------------------------");
		int l = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((l++) % 10);
			}
			System.out.println();
	}
	}}

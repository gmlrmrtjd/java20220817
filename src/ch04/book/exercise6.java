package ch04.book;

public class exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <=5; i ++) {
			for (int j = 1; j <= 5-i; j ++) {
				System.out.print("");
			}
			for (int a = 1; a <= i; a++) {
			System.out.print("*");
			}
			System.out.println("");
		}
	}
}

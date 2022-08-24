package ch04.lecture.p01control;

public class forPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) {
			for(int y=1; y<=5-i; y++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int x=1; x<i; x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
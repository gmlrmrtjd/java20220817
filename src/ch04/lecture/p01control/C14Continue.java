package ch04.lecture.p01control;

public class C14Continue {
	public static void main(String[] args) {
		System.out.println(1);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("zzz"+i);
			
			if(i <1) {
				continue;
			}
			
			System.out.println("continue next");
		}
		
		System.out.println(4);
		
		
	}
}

package ch04.lecture.p02method;

public class C10method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long a = max(3, 5);
		System.out.println(a);  // 5
		
		long b = max(5, 3);
		System.out.println(b);  // 5
		
		long c = max(-100, 100); // 100
		System.out.println(c);
		
		long d = max(100, 200); // 200
		System.out.println(d);
	}	

	public static long max(long a, long b) {
		long score = (a >= b) ? a : b;
		return score;
//		if (a >= b) {
//			return a;
//		}
//		else if (a < b) {
//			return b;
//		}
//		}
	}
}

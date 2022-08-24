package ch04.lecture.p02method;

public class C12OverLoading {
	public static void main(String[] args) {
		double a = half(5.0);
		System.out.println(a); //2.5
		
		int b = half(5);
		System.out.println(b); // 2
		
//		double c = half(5);
//		System.out.println(c); // 2
		
		
	}
	public static double half(double a) {
		return a / 2;
	}
	public static int half(int a) {
		return a / 2;
	}
//	public static double half(int a) {
//		return a / 2;
//	}
}

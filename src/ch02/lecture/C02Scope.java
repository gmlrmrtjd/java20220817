package ch02.lecture;

public class C02Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수는 선언 된블럭 [] 내에서만 사용 가능
		int a = 3;
		
		if (true) {
			int a = 5; // x
			int b = 4;
			System.out.println(b);
			System.out.println(a);
		}
		System.out. println(b); // x
	}

}

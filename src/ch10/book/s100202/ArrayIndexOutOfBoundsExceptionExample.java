package ch10.book.s100202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		
		if (args.length == 3) {
			String data1 = args[0];
			String data2 = args[1];

			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
			System.out.println(args[2]);
//			System.out.println(args[3]);  // 배열을 넘어선 경우 에러 문구 확
		} else {
			System.out.println("[실행 방법]");
			System.out.println("java ArrayIndexOutOfBoundsExceptionExample    ");
			System.out.println("값1   값2");
		}
		System.out.println("시스템 종료 ");
	}
}

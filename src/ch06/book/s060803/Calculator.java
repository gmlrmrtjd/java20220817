package ch06.book.s060803;
// 클래스 내부에서 메소드 호출 
public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		System.out.println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}

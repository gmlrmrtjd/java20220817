package practice.InterfaceApp;
interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}
interface Printable{
	void print();
}
class RealCal implements Calculable, Printable{
	public int sum(int v1, int v2) {
		return v1+v2;
	}
	public void print() {
		System.out.println("This is RealCal!!");
	}
}
class AdvencedPrint implements Printable{
	public void print() {
		System.out.println("This is RealCal!!!");
	}
}
//class DummyCal implements Calculable{
//	public int sum(int v1, int v2) {
//		return 3;
//	}
//}

public class InterfaceApp {
	public static void main(String[] args) {
		// 더하기 기능이 있는 클래스 만들기
		Printable c = new AdvencedPrint();
		c.print();
	}
}

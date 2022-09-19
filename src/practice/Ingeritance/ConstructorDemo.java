package practice.Ingeritance;

//public class ConstructorDemo {
// 객체 생성시 생성자는 자동으로 생성
//    public static void main(String[] args) {
//        ConstructorDemo  c = new ConstructorDemo();
//    }
//}

//public class ConstructorDemo {
//    public ConstructorDemo(int param1) {}  
//    // 매개변수를 포함한 생성자는 기본 생성자가 아니므로 에러
//    public static void main(String[] args) {
//        ConstructorDemo  c = new ConstructorDemo();
//    }
//}

public class ConstructorDemo {
	public ConstructorDemo() {} 
	public ConstructorDemo(int param1) {}
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
	}
}

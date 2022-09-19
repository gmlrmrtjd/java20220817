package ch08.book.s0805;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
//		myCar.frontLeftTire = new KumhoTire();
//		myCar.frontRightTire = new KumhoTire();

		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
		
		myCar.run();
	}
}

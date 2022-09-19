package ch07.book.s070704자동타입변환;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);  // bus: bus.run() 실행 
		// 원래 vehicle타입을 받는 run() 이었지만 자동타입변환 됨. 
		driver.drive(taxi);  // taxi: bus.run() 실행 
		
	}
}

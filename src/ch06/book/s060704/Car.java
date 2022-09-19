package ch06.book.s060704;
// 생성자의 오버로딩 
public class Car {
	// 필드 
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	
	// 생성자 
	Car() {													//  1 생성자 
	}
	
	Car(String model) {									// 2 생성자 
		this.model = model;
	}
	
	Car(String model, String color) {					// 3 생성자 
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed) {	// 4 생성자 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

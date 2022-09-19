package ch06.book.s060705;
// 다른 생성자를 호출해서 중복 코드 줄이기 
public class Car {
	// 필드 
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 
	Car() {
	}
	
	Car(String model) {									// 호출 
		this(model, "은색", 250);
//		this.model = model;
	}
	
	Car(String model, String color) {					// 호출 
		this(model, color, 250);
//		this.model = model;
//		this.color = "은색";
	}
	
	Car(String model, String color, int maxSpeed) {	// 공통 실행 코드 
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
//		this.model = model;
//		this.color = "은색";
//		this.maxSpeed = 250;
	}
}






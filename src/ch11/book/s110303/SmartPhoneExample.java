package ch11.book.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj =myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);    //myPhone.toString()을 자동 호출해서 리턴값을 얻은 후 출력 
	}
}

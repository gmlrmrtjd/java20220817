package ch02.book;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 -10;
			
		}
		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	}
}

//v2 변
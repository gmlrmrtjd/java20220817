package ch03.book.Excercise;

public class p0Practice {
	public static void main(String[] args) {
		//2번 
//		int x = 10;
//		int y = 20;
//		int z = (++x) + (y--);
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
//		
		//3번 
//		int score = 85;
//		String result = (!(score>90))? "가":"나";
//		System.out.println(result);
		
		
		//4번 
//		int pencils = 534;
//		int students = 30;
//		
//		// 학생 한명이 가지는 연필 수 
//		int pencilsPerStudent = pencils / students;
//		System.out.println(pencilsPerStudent);
//		
//		// 남은 연필 수 
//		int pencilsLeft = pencils % students;
//		System.out.println(pencilsLeft);
		
		// 5번 
//		int value = 356;
//		System.out.println(value - (value % 300));
		
		// 6번 
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom ) /2.0 * height);
		// 2.0을 double로 계산하면 double로 출력됨 
		System.out.println(area);
	}
}

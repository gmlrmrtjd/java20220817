package ch05.book.p01array;
// 배열의 최대값 구하기
public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= max) {
				max = 0;
				max += array[i];
				continue;
			}
		}
		
		
		System.out.println("max: " + max);
		
	}
}

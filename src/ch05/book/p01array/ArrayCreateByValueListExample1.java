package ch05.book.p01array;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		
		int sum = 0;
		
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		
		System.out.println("합:" + sum);
		double avg = sum / 3.0;
		System.out.println("평균:" + avg);
	}
}







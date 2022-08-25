package ch05.book.p01array;

public class ArrayLength {
	public static void main(String[] args) {
		int[] scores = {83, 90, 87};
		int sum = 0;
		for(int i= 0; i<scores.lenth; i++) {
			sum += scores[i];

		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.lenth;
		System.out.println('평균 : " +avg);
	}
}

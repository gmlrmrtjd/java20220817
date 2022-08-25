package ch05.lecture.p02reference;

public class C05Reference {
	public static void main(String[] args) {
		int[] a = {99, 88, 77};
		
		changeItem(a);
		
		System.out.println(a[0]); //3
		
		int[] b = {7, 6};
		changeItem(b);
		System.out.println(b[0]); //3
	}

	private static void changeItem(int[] a) {
		// TODO Auto-generated method stub
		a[0] = 3;
	}
}

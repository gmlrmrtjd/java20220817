package ch05.lecture.p02reference;

public class C07Reference {
	public static void main(String[] args) {
		int[] a = {9,8,7};
		System.out.println(a[0]); //9
		
		a =changeItems(a);  // 9
		
		System.out.println(a[0]);  // 3
	}

	private static int[] changeItems(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(arr[0]);
		arr = new int[] {3, 4, 5};
		return arr;
	}
}

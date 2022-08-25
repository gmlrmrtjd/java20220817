package ch05.lecture.p02reference;

public class C06Reference {
	public static void main(String[] args) {
		int[] a = new int[] {9 , 8};
		changeItem(a); //9
		
		System.out.println(a[0]);  //9
	}

	private static void changeItem(int[] arr) {
		// TODO Auto-generated method stub
		System.out.println(arr[0]);
		arr = new int[] {3, 4};
		
		
	}
	
	
}

package ch05.lecture.p02reference;

public class C09Reference {
	// 04문자배열.pnp
	public static void main(String[] args) {
		int[] a = { 4, 5, 6};
		
		int[][] b; // 각 item 타입이 int[](참조타입)
		b = new int[][] {{1, 2}, {100, 200}, {5,6}};
		
		System.out.println(b[0][0]);//1
		System.out.println(b[0][1]);//2
		System.out.println(b[1][0]);//100
		System.out.println(b[1][1]);//200
		System.out.println(b[2][0]);//5
		System.out.println(b[2][1]);//6
		
	}
}

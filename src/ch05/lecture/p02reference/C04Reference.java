package ch05.lecture.p02reference;

public class C04Reference {
	public static void main(String[] args) {
		int a = 3;
		printVar(a);   //3 
		int b = 5;
		printVar(b);   //5
		
		int[] c = {9,1,2}; //9
		prinfArray(c);
		
		int[] d= { 99,88,77}; //99
		prinfArray(d);
	}

	private static void prinfArray(int[] c) {
		// TODO Auto-generated method stub
		System.out.println(c[0]);
	}

	private static void printVar(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}
}

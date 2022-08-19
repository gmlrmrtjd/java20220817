package ch03.lecture.p2binary;

public class C07Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리 연산자
		// and : &&, &
		// or : ||, |
		// xor : ^
		// not : !
		// 피연사자 : boolean
		// 결과 : boolean
		
		// and : true && true -> true
		//          true && false -> false
		//			false && true -> false
		//			false && false -> false
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println();
		
		// or : true || true -> true
		//          true || false -> true
		//			false || true -> true
		//			false || false -> false
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println();

		// xor : true ^ true -> false		(같으면 false)
		//          true ^ false -> true		(다르면 true)
		//			false ^ true -> true
		//			false ^ false -> false
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
	}

}

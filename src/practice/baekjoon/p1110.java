package practice.baekjoon;

import java.util.Scanner;

public class p1110 {
	public static void main(String[] args) {
		// if x< 10 -> 0x -> x+0=x -> xx ------> x가 몇번만에 나오는지

		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		System.out.println(num);
		int fstNum = num;

		int cnt= 0;
		int sum = 0;
//		int nNum = 0;
		while(true) {
			cnt+=1;
			System.out.println("cnt = " + cnt);
			
			sum = num%10 + num /10;
			System.out.println("sum = " + sum);
			
			int Num1 = num%10;
			int Num2 = sum%10;
			System.out.println("Num1 = " + Num1 + ", Num2 = " + Num2);
			
			String strNewNum =String.valueOf(Num1)  + String.valueOf(Num2);
			System.out.println("strNewNum = " + strNewNum);
		      num = Integer.parseInt(strNewNum);
			
			if (fstNum == num) {
				System.out.println(cnt);
				break;
			}
			else {
				System.out.println("num = " + num);
				continue;
			}
		}
	}
		
		
		
		
//		int scNum; 
//		int zrNum= 0;
//		scNum = scanner.nextInt();
//		System.out.println(scNum);
//		
//		String stNum;;
//		if (0 <= scNum && scNum <= 99) {
//			stNum = String.valueOf(scNum);
//			if(num < 10) {
//				zeroNum = 0+String.valueOf(num); 
//				System.out.println(zeroNum);
//				while(true) {
//					zeroNum.charAt(num)
//				}
//			}}



//		List<Integer> lst1 = new ArrayList<>();
//		
//		lst1.add(x);
//		lst1.add(y);
//		
//		
//		if (0 <= x && )
		
	

}

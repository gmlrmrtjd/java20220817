package practice.baekjoon;

import java.util.Scanner;

public class p3052 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr1= new int[10];
		int[] arr2= new int[10];
		
		for(int i=0; i < 10; i++) {
			int num = scanner.nextInt();
			arr1[i] = num;
		}
		
		int cnt = 10;
		for(int i=0; i < 10; i++) {
			arr2[i] = arr1[i] % 42;
		}
		
		for(int i=0; i < 10; i++) {
			for(int j=0; j < i; j++) {
				if(arr2[i] == arr2[j]) {
					cnt--;
				}
			}
		}
		System.out.println(cnt);
	}
}

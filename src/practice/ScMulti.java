package practice;

import java.util.Scanner;

public class ScMulti {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String s[]= scanner.nextLine().split(" ");
		
		int [] a = new int[999];
		
		for(int i =0 ;i < s.length;i++){
		    a[i]= Integer.parseInt(s[i]);
		}
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}

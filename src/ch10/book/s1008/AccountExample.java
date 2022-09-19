package ch10.book.s1008;

import ch10.book.s100701.BalanceInsufficientException;
import ch10.book.s100702.Account;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		// 예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000);
		}
		catch(BalanceInsufficientException e) {
			String message = e.getMessage(); // 예외 메세지 얻기 
			System.out.println(message);  
			System.out.println();
			e.printStackTrace();				// 예외 추적 후 출력  , 오류 찾을 때 사용 
		}
	}
}

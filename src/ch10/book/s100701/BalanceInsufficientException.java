package ch10.book.s100701;
// exception 만들기 
public class BalanceInsufficientException extends Exception{		// check exception 만들기 
	public BalanceInsufficientException() {}							//4 or 5 라인 만드는건 선택 
	public BalanceInsufficientException(String message) {
		super(message);
	}

}

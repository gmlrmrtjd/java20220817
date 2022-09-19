package ch12.book.exercise;

public class ThreadExample {
	public static void amin(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(   );
		thread2.start();
	}
}

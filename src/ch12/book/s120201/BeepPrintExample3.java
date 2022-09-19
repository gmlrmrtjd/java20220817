package ch12.book.s120201;
// 람다식으로 
import java.awt.Toolkit;

public class BeepPrintExample3 {
//	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
//		thread.start();									// BeepRunnable
		
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});
	}
//}

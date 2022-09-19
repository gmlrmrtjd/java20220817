package ch12.book.s120201;

import java.awt.*;

// 메인 스레드만 이용한 경우 
public class BeepPrintExample1 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();				// Toolkit 객체 얻기 
		for(int i=0; i<5; i++) {
			toolkit.beep();											// 비프음 발생 
			try { Thread.sleep(500); } catch(Exception e) {}		// 0.5초간 일시 정지 
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}		// 0.5초간 일시 정지 
		}
	}
}

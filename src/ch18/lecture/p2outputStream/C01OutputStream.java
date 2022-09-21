package ch18.lecture.p2outputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01OutputStream {
	public static void main(String[] args) throws Exception {
		// OutputStream : 바이트 단위로 출력하는 스트림
		// 주요 메소드 : write
		
		String name = "/Users/sunggyu-lim/Desktop/무제 폴더/output2.txt";
		OutputStream os = new FileOutputStream(name);
		
//		 writhe() : 한바이트 출력 메소드
		os.write(2);
		os.write(127);
		os.write(-128);
		
		
		os.close();
	}
}

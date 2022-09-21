package ch18.lecture.p3exception;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class C01Exception {
	public static void main(String[] args) throws Exception {
		
		String name = "/Users/sunggyu-lim/Desktop/무제 폴더/output5.txt";
		OutputStream os = new FileOutputStream(name);
		
		os.write(99);	// 만약 exception 발생시 close코드까지 실행되지못함 
		os.write(88);
		
		os.close();// 꼭 해야함
		
		// 안전하지 않음 
		
	}

}

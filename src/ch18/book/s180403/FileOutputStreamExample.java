package ch18.book.s180403;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String[] args) throws Exception{
		String originalFileName = 
				"/Users/sunggyu-lim/Desktop/무제 폴더/common.jpeg";
				String targetFileName = " /Users/sunggyu-lim/Desktop/무제 폴더/common1.jpeg";
				
				FileInputStream fis = new FileInputStream(originalFileName);
				FileOutputStream fos = new FileOutputStream(targetFileName);
				
				int readByteNo;
				byte[ ] readBytes = new byte[100];
				while ((readByteNo = fis.read(readBytes)) != -1) {
					fos.write(readBytes, 0, readByteNo);
				}
				
				fos.flush();
				fos.close();
				fis.close();
				
				System.out.println("복사가 잘 되었습니다.");
		
	}
}

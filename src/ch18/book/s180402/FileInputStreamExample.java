package ch18.book.s180402;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"/src/ch18/book/s180402/FileInputStreamExample.java");
		
			int data;
			while ( (data = fis.read() ) != -1 ) {
				System.out.println(data);
			}
			fis.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

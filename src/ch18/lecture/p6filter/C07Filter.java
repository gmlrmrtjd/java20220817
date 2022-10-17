package ch18.lecture.p6filter;

import java.io.*;


public class C07Filter {
	public static void main(String[] args) {
		String src = "/Users/sunggyu-lim/Desktop/무제 폴더/output12.txt";
		String dec = "/Users/sunggyu-lim/Desktop/무제 폴더/output13.txt";
		
		try(
			FileInputStream fis = new FileInputStream(src); // 파일 이름 읽기
			InputStreamReader isr = new InputStreamReader(fis); // 문자 단위로 읽기
			BufferedReader br = new BufferedReader(isr); // 버퍼처리하여 읽기
	
			FileOutputStream fos = new FileOutputStream(dec);	//  파일 만들기 
			OutputStreamWriter osw = new OutputStreamWriter(fos);		// 파일 쓰기 
			BufferedWriter bw = new BufferedWriter(osw);	// 버퍼처리 후 쓰기 
		) {
			char[] cbuf = new char[1000]; 	// 복사 코드 
			int len = 0;
			
			while((len = br.read(cbuf)) != -1) {
				bw.write(cbuf, 0, len);
			}
			
			System.out.println("복사 완료");
		}
			catch (Exception e) {	// exception 제외 코드 
				e.printStackTrace();
			}
	}		
}
package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C06Filter {
	public static void main(String[] args) {
		String name = "/Users/sunggyu-lim/Desktop/무제 폴더/output12.txt";

		try (
				InputStream is = new FileInputStream(name); // 파일 이름 읽기
				InputStreamReader isr = new InputStreamReader(is); // 문자 단위로 읽기
				BufferedReader br = new BufferedReader(isr); // 버퍼처리하여 읽기
		) {
			String Line = null;

			while ((Line = br.readLine()) != null) {
				System.out.println(Line);
			}

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

//		is.close();		// try를 써서 필요 없어짐
//		isr.close();
//		br.close();

	}
}

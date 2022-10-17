package ch18.lecture.p6filter;

import java.io.*;

public class C08PrintStream {
	public static void main(String[] args) throws Exception {
		String name = "/Users/sunggyu-lim/Desktop/무제 폴더/output14.txt";

		try (
				FileOutputStream fis = new FileOutputStream(name);
				PrintStream ps = new PrintStream(fis);) 
		{
			ps.write(97);
			ps.print(97);
			
			ps.println(3.14);
			ps.println("가");
			ps.println(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

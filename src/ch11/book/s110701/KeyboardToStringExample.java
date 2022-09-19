package ch11.book.s110701;

import java.io.IOException;

public class KeyboardToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];   // 읽은 바이트를 저장하기 위한 배열 생성
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);   // 	배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		
		String str = new String(bytes, 0, readByteNo-2);   // 배열을 문자열로 변환, mac은 엔터가 1바이트라 하나 덜 출력됨. 윈도우는 엔터가 2바이트 
		System.out.println(str);
	}
}

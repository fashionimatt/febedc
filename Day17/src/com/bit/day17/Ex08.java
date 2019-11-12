package com.bit.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex08 {

	public static void main(String[] args) {
		//io(inputStream,outputStream) → 통신
		//입력스트림만 사용하는 것들 : 마우스, 키보드
		//출력스트림만 사용하는 것들 : 모니터, 프린터
		//inputStream을 통해서 읽어들이고 outputStream을 통해서 기록한다.
		
		File file;
		file = new File("test01.bin");
		
		OutputStream os;
		// Stream의 기본 단위는 1byte 이다.
		byte[] by = "한글".getBytes();
		try {
			os = new FileOutputStream(file);
			for(int i=0; i<by.length; i++){
				os.write(by[i]);
			}
			os.close();
			System.out.println("작성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

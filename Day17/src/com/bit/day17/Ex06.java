package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		File file;
		try {
			file = File.createTempFile("abcdefg", "bit");
			//임시파일을 생성할때는 파일이름의 앞과 뒤만 내가 생성할 수 있고
			//중간에 있는 숫자는 중복방지를 위해 랜덤으로 생성됨
			System.out.println("임시파일이 생성되었습니다");
			System.out.println(file.exists());
			System.out.println(file.getCanonicalPath());
			//temp 디렉토리에는 우리가 이용하는 프로그램의 임시 자료들을 저장하는 디렉토리이다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

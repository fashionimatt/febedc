package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	
	public static void main(String[] args) {
		File file;
		file = new File("test01.bin");
		//test03.bin은 실제 파일이 아니라 객체이기 때문에 없는 파일일지라도 실행은 가능
		//test04 처럼 확장자 없이 이름만 입력할 경우 확장자 없는 '파일'이 만들어짐
		//test06\\test11처럼 할 경우 상위폴더가 미리 생성되있지 않으면 mkdir로는 생성 불가.
		//이런 경우 mkdirs를 사용해야함.
		
		try {
			if(file.createNewFile()){
				System.out.println("파일을 생성했습니다.");
//				file.mkdir();
//				System.out.println("디렉토리를 생성했습니다.");
			} else{
				System.out.println("파일이 이미 존재합니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

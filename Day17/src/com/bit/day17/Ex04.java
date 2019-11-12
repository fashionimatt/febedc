package com.bit.day17;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		File file = new File("newName2.bin");
		//test06\\test11 처럼 되있을 경우 하위 경로가 남아있으면 상위 경로를 삭제할 수 없다.
		
		if(file.exists()){
			file.delete();
			System.out.println("파일이 삭제되었습니다.");
		}
		
		System.out.println(file.exists());
	}

}

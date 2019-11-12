package com.bit.day17;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		//file
		//경로(상대,절대)
		//절대 경로 : c:\java\Day17\test01.bin ← 요런식
		//상대 경로 : 현재 나를 기준으로 표현하는 방식!
		java.io.File file1 = null;
		file1 = new File(".\\..\\day17");
		//폴더라는 개념은 윈도우에서만 사용하는 개념
		//윈도우 이외의 OS에서는 디렉토리라는 명칭 사용
		
		System.out.println("존재하는 지 알려줘! " + file1.exists());
		System.out.println("디렉토리인지 알려줘! " + file1.isDirectory());
		System.out.println("파일인지 알려줘! "+ file1.isFile());
		System.out.println("경로는? " + file1.getPath());
		System.out.println("절대경로는? " + file1.getAbsolutePath());
		
		try {
			System.out.println("절대경로는? " + file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("이름은? " + file1.getName());
		System.out.println("상위 경로는? " + file1.getParent());
		System.out.println("R읽기 권한이 있나요? " + file1.canRead());
		System.out.println("W쓰기 권한이 있나요? " + file1.canWrite());
		System.out.println("X실행 권한이 있나요 ? " + file1.canExecute());
		System.out.println("파일의 사이즈는? " + file1.length()+ "byte");
		System.out.println(new Date(file1.lastModified()));
		String[] msg = file1.list();
		System.out.println(Arrays.toString(msg));
		//최종 수정한 시간을 long값으로 뽑아냄.
	}

}

/*
 다른 운영체제들에 비해 윈도우는 별종 같은 존재임.
 권한에 대한 조종이 전혀 없는 운영체제.
 */

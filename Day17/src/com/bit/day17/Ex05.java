package com.bit.day17;
import java.io.File;
import java.io.IOException;


public class Ex05 {

	public static void main(String[] args) {
		File file;
		file = new File("test01.bin");
		
		File file2;
		file2 = new File("newName2.bin");
		
		System.out.println("이름바꾸기" + file.renameTo(file2));
		
	}

}

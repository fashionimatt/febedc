package com.bit.day17;

import java.io.File;

public class Ex04 {

	public static void main(String[] args) {
		File file = new File("newName2.bin");
		//test06\\test11 ó�� ������ ��� ���� ��ΰ� ���������� ���� ��θ� ������ �� ����.
		
		if(file.exists()){
			file.delete();
			System.out.println("������ �����Ǿ����ϴ�.");
		}
		
		System.out.println(file.exists());
	}

}

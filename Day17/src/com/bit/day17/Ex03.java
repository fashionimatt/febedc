package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	
	public static void main(String[] args) {
		File file;
		file = new File("test01.bin");
		//test03.bin�� ���� ������ �ƴ϶� ��ü�̱� ������ ���� ���������� ������ ����
		//test04 ó�� Ȯ���� ���� �̸��� �Է��� ��� Ȯ���� ���� '����'�� �������
		//test06\\test11ó�� �� ��� ���������� �̸� ���������� ������ mkdir�δ� ���� �Ұ�.
		//�̷� ��� mkdirs�� ����ؾ���.
		
		try {
			if(file.createNewFile()){
				System.out.println("������ �����߽��ϴ�.");
//				file.mkdir();
//				System.out.println("���丮�� �����߽��ϴ�.");
			} else{
				System.out.println("������ �̹� �����մϴ�.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

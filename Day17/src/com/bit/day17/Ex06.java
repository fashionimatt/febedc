package com.bit.day17;

import java.io.File;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		File file;
		try {
			file = File.createTempFile("abcdefg", "bit");
			//�ӽ������� �����Ҷ��� �����̸��� �հ� �ڸ� ���� ������ �� �ְ�
			//�߰��� �ִ� ���ڴ� �ߺ������� ���� �������� ������
			System.out.println("�ӽ������� �����Ǿ����ϴ�");
			System.out.println(file.exists());
			System.out.println(file.getCanonicalPath());
			//temp ���丮���� �츮�� �̿��ϴ� ���α׷��� �ӽ� �ڷ���� �����ϴ� ���丮�̴�.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

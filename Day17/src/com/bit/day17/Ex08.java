package com.bit.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex08 {

	public static void main(String[] args) {
		//io(inputStream,outputStream) �� ���
		//�Է½�Ʈ���� ����ϴ� �͵� : ���콺, Ű����
		//��½�Ʈ���� ����ϴ� �͵� : �����, ������
		//inputStream�� ���ؼ� �о���̰� outputStream�� ���ؼ� ����Ѵ�.
		
		File file;
		file = new File("test01.bin");
		
		OutputStream os;
		// Stream�� �⺻ ������ 1byte �̴�.
		byte[] by = "�ѱ�".getBytes();
		try {
			os = new FileOutputStream(file);
			for(int i=0; i<by.length; i++){
				os.write(by[i]);
			}
			os.close();
			System.out.println("�ۼ� �Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package com.bit.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class EX14 {

	public static void main(String[] args) {
		//����
		// \r
		// \n
		// \r\n = �������� ����
		
		String msg = "�̷��� �ۼ� �����մϴ�. �� ����?\n1234\nabcd ";
		String menu = "1.�Է� 2.���� 0.���� > ";
		File file;
		file = new File("test01.bin");
		File file2;
		file2 = new File("test02.bin");
		InputStream is;
		OutputStream os;
		//IO�� �ϳ��� �̹� Stream�� ������ ���� �ٸ� �ʿ��� ������ �Ұ��ϴ�.(���� �������� �Ұ��ϴ�)
//		byte[] buff = msg.getBytes();
		byte[] by = msg.getBytes();
		byte[] buff = new byte[5];
		try {
			file2.createNewFile();
			is = new FileInputStream(file);
			os = new FileOutputStream(file2);
			while(true){
				int su = is.read(buff);
				if(su==-1){break;}
				os.write(buff,0,su);				
			}
			os.flush();
			//flush�� �ʹ� �����ϰ� �Ǹ� buffer�� ȿ���� ����� ������ ����
			os.close();
			is.close();
			//close�� �ϱ� ������ ������ ���� ���� ���� �ƴϱ� ������
			//�������� �����ս��� ���Ⱑ �����
			//�� �ۼ��� �� �˰� ����ϰ� �ִ� ����!
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}

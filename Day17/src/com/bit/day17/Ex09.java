package com.bit.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {
		File file;
		file = new File("test01.bin");
		
		InputStream is;
		byte[] buf = new byte[4];
		int cnt=0;
		try {
			is = new FileInputStream(file);
			while(true){
				//�о���̴� ���忡���� ��� �ݺ��ؼ� �о������ ��
				//�׷��� �̷� ��� while�� ���� ���� �� ����
				int su = is.read();
				if(su==-1){break;}
				buf[cnt++]=(byte)su;
			}
			System.out.print(Arrays.toString(buf)+" ");
			System.out.print(new String(buf));
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
//��� ���α׷��� �⺻ ���̽��� �����ս��� ���� io�� �ִ�.
//Stream�� ���� �����Ϸ��� ���� ����Ʈ�ϰ� ���� �����غ���!

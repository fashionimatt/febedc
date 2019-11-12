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
				//읽어들이는 입장에서는 몇번 반복해서 읽어야할지 모름
				//그래서 이런 경우 while을 쓰는 것이 더 좋음
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
//모든 프로그램의 기본 베이스와 퍼포먼스는 전부 io에 있다.
//Stream을 쉽게 공부하려면 가장 라이트하게 놓고 제작해보기!

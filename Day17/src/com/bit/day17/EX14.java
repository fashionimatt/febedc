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
		//개행
		// \r
		// \n
		// \r\n = 윈도우의 개행
		
		String msg = "이렇게 작성 가능합니다. 참 쉽죠?\n1234\nabcd ";
		String menu = "1.입력 2.보기 0.종료 > ";
		File file;
		file = new File("test01.bin");
		File file2;
		file2 = new File("test02.bin");
		InputStream is;
		OutputStream os;
		//IO는 하나가 이미 Stream을 연결한 순간 다른 쪽에서 연결이 불가하다.(다중 엑세스가 불가하다)
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
			//flush를 너무 남발하게 되면 buffer의 효과를 제대로 누리지 못함
			os.close();
			is.close();
			//close를 하기 전에는 동작이 아직 끝난 것이 아니기 때문에
			//정상적인 퍼포먼스를 보기가 힘들다
			//더 작성할 줄 알고 대기하고 있는 상태!
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}

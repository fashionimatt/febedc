package com.bit.day16;

import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		Random ran = new Random();
		
//		System.out.println(ran.nextInt());
//		//������ Integer�� MIN���� MAX����!
//		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(45)+1); //0~(�Ű�����-1)��ŭ ��ȯ �޴´�
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1);
		
	}

}

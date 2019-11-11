package com.bit.day16;

import java.util.Random;

public class Ex16 {

	public static void main(String[] args) {
		Random ran = new Random();
		
//		System.out.println(ran.nextInt());
//		//범위는 Integer의 MIN부터 MAX까지!
//		System.out.println(ran.nextDouble());
		System.out.println(ran.nextInt(45)+1); //0~(매개변수-1)만큼 반환 받는다
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1); 
		System.out.println(ran.nextInt(45)+1);
		
	}

}

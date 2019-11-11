package com.bit.day16;

public class Ex08 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = sb1;
		//옅은 복사 shallow copy
		StringBuilder sb3 = new StringBuilder(sb1);
		//깊은 복사 deep copy
		sb1.append("ADD");
		//sb1에 제어가 들어갈 시, sb1의 객체와 같은 객체를 가리키는 sb2는 변화가 생기나
		//깊은 복사가 들어간 sb3엔 변화가 없다.
		
		System.out.println(sb3);

	}

}

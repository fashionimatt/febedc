package com.bit.day16;

public class Ex02 {

	public static void main(String[] args) {
		String msg = "javaWeb";
		char[] chs = msg.toCharArray();
//		String msg = new String(65); 
		//디폴트 버퍼값 제어는 String에서는 안 됨 
		StringBuilder build1 = new StringBuilder("문자열");
		StringBuffer buf1 = new StringBuffer(build1);
		System.out.println(buf1);
		for(int i=0; i<16; i++){
			buf1.append('a');
//			buf1.trimToSize();
			System.out.println(buf1.length() + ":");
			System.out.println(buf1.capacity());
			//문자열에 이미 뭐가 들어가있을 때는 들어가있는 만큼의 + 16을 한 값이 default buffer가 된다.
		}
		
		
	}

}

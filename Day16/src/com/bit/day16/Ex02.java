package com.bit.day16;

public class Ex02 {

	public static void main(String[] args) {
		String msg = "javaWeb";
		char[] chs = msg.toCharArray();
//		String msg = new String(65); 
		//����Ʈ ���۰� ����� String������ �� �� 
		StringBuilder build1 = new StringBuilder("���ڿ�");
		StringBuffer buf1 = new StringBuffer(build1);
		System.out.println(buf1);
		for(int i=0; i<16; i++){
			buf1.append('a');
//			buf1.trimToSize();
			System.out.println(buf1.length() + ":");
			System.out.println(buf1.capacity());
			//���ڿ��� �̹� ���� ������ ���� ���ִ� ��ŭ�� + 16�� �� ���� default buffer�� �ȴ�.
		}
		
		
	}

}

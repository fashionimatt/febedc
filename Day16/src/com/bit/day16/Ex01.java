package com.bit.day16;

public class Ex01 {

	public static void main(String[] args) {
		String msg0 = "java" + "Web";
		String msg1= "java".concat("Web");
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer msg2 = new StringBuffer("Buffer");
//		StringBuffer msg3 = "buffer class"; //������ �����ڸ� ���ؼ� �Է��� �ؾ���!
		
		StringBuffer msg3 = new StringBuffer(" class");
		StringBuffer msg4 = new StringBuffer("�� +");
		System.out.println(msg0=="javaWeb");
		System.out.println(msg1=="javaWeb");
		System.out.println("----------------------------");
		System.out.println(sb);
		System.out.println(msg2.append(msg3).append(msg4));
		System.out.println("----------------------------");
		System.out.println(msg2); 
		
		//String Ŭ������ ��� �� ������ ��� ���ο� ��ü�� �����ؾ� ������
		//StringBuffer/StringBuilder�� ������ ��ü ������ ������ �̷����. ��� �ϴ� ���� �ٲ�.
		//StringBuffer/StringBuilder�� String���� �ٸ� ���� ������ ������ �ֱ� ������
		//�ͼ������� ���� �ð��� �� �ɸ�
		//Ex)���� ó�� ���α׷��� ��� �л��� 3-4���� ���� �׷��� ũ�� ����� ������
		//�л��� õ ��,�� ���� �Ǹ� String�� �̿��� ��, �Ź� ��ü�� �����ؾ� �ϱ� ������ �ڿ� �Ҹ� �ʹ� ũ��.
	}

}

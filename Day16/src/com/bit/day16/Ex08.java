package com.bit.day16;

public class Ex08 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = sb1;
		//���� ���� shallow copy
		StringBuilder sb3 = new StringBuilder(sb1);
		//���� ���� deep copy
		sb1.append("ADD");
		//sb1�� ��� �� ��, sb1�� ��ü�� ���� ��ü�� ����Ű�� sb2�� ��ȭ�� ���⳪
		//���� ���簡 �� sb3�� ��ȭ�� ����.
		
		System.out.println(sb3);

	}

}

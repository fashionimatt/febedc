package com.bit.day17;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class Ex01 {

	public static void main(String[] args) {
		//file
		//���(���,����)
		//���� ��� : c:\java\Day17\test01.bin �� �䷱��
		//��� ��� : ���� ���� �������� ǥ���ϴ� ���!
		java.io.File file1 = null;
		file1 = new File(".\\..\\day17");
		//������� ������ �����쿡���� ����ϴ� ����
		//������ �̿��� OS������ ���丮��� ��Ī ���
		
		System.out.println("�����ϴ� �� �˷���! " + file1.exists());
		System.out.println("���丮���� �˷���! " + file1.isDirectory());
		System.out.println("�������� �˷���! "+ file1.isFile());
		System.out.println("��δ�? " + file1.getPath());
		System.out.println("�����δ�? " + file1.getAbsolutePath());
		
		try {
			System.out.println("�����δ�? " + file1.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("�̸���? " + file1.getName());
		System.out.println("���� ��δ�? " + file1.getParent());
		System.out.println("R�б� ������ �ֳ���? " + file1.canRead());
		System.out.println("W���� ������ �ֳ���? " + file1.canWrite());
		System.out.println("X���� ������ �ֳ��� ? " + file1.canExecute());
		System.out.println("������ �������? " + file1.length()+ "byte");
		System.out.println(new Date(file1.lastModified()));
		String[] msg = file1.list();
		System.out.println(Arrays.toString(msg));
		//���� ������ �ð��� long������ �̾Ƴ�.
	}

}

/*
 �ٸ� �ü���鿡 ���� ������� ���� ���� ������.
 ���ѿ� ���� ������ ���� ���� �ü��.
 */

package com.bit.day16;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex04 {
	static Ex04 me;
	
	public static void func01(){
		System.out.println("my func01...");
	}
	
	public static void main(String[] args) {
		//System
		
		InputStream var2 = System.in;
		//System Ÿ���� Ŭ�������� in�̶�� �޼ҵ带 ���ڷ� �� ��
		Ex04.me.func01();
		
		PrintStream var1 = System.out;
		//System Ÿ���� Ŭ�������� out�̶�� �޼ҵ带 ���ڷ� �� ��
		var1.println("���");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		long sec = System.currentTimeMillis();
		//currentTimeMillis�� ���� ������ ���꿡 ����! ��Ȯ�� �ð��� ���� ���� ���� �ƴ�
		//�ҿ�ð� ���� ��꿡 ����
		//�ý����� Ŭ������ ���¸�ŭ �ý��ۿ� ��������. �ü���� �ð��� �ٲ�� ��ġ�� �ٲ�.
		System.out.println(sec);
		System.out.println(Long.MAX_VALUE);
		//�Ϸ�� 24�ð��ε� 1�ð��� 60�� 1���� 60�ʸ� �������� �Ͽ� ������ �ٸ��� ������
		//��ǻ�ʹ� ��¥ ����ϴ� ���� ������Ѵ�.
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Map<String,String> env = System.getenv();
		Set<String> keys = env.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(key + " : " + env.get(key));
		}
		//���� �ý��� ȯ���� �� �� �ְԲ� ���ִ� �ڵ�
		System.out.println(System.nanoTime());
		
		
		//currenTimeMills�� ����� 1970��� 1�����͸� �������� �Ѵ�.(������� ���⸦ ������ 0���� �ƴ�!)(
	}

}

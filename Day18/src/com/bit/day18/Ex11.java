package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex11 extends Frame{

	public Ex11() {
		Panel p = new Panel();
		p.setLayout(null);
		//��ġ�����ڸ� ������� �ʰڴٴ� �ǹ̷�. default�� absolute�̴�.
		//������ ���� ũ��� ��ġ�� �ʼ������� �����ؾ� �Ѵ�.
		Button btn1 = new Button("��ư1");
		btn1.setSize(100,100);
		btn1.setLocation(384-100,361-100);
		p.add(btn1);
		add(p);
		//��ġ �Է��� ���� ��, setLocation�� default ���� (0,0)���� ������ �ȴ�.
		setBounds(200,200,400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}

}

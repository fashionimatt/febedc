package com.bit.day17;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Panel;

public class Ex18 {

	public static void main(String[] args) {
//		FlowLayout layout = new FlowLayout();
//		GridLayout layout = new GridLayout(2,2);
		CardLayout layout = new CardLayout();
		Frame frame = new Frame();
		frame.setLayout(layout);
		
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();
		Panel p4 = new Panel();
		
		Button btn1 = new Button("Button 1");
		Button btn2 = new Button("Button 2");
		Button btn3 = new Button("Button 3");
		Button btn4 = new Button("Button 4");
		
		p1.add(btn1);
		p2.add(btn2);
		p3.add(btn3);
		p4.add(btn4);
		
		
		frame.add(p1);
		frame.add(p2);
		frame.add(p3);
		frame.add(p4);
		
		frame.setLocation(300,250);
		frame.setSize(400,450);
		frame.setVisible(true);
		
		layout.next(frame);
		//ù ȭ��, �α����� �Ǹ� ���� ȭ������ �Ѿ
		layout.next(frame);
		//ȣ���� �޴� ���� �� ���� ȭ���� �Ѿ
		layout.next(frame);
		//�ٸ� ȣ���� �޴� ���� �� ���� ȭ������ �Ѿ
		layout.next(frame);
		//�̷� ���� ������Ʈ���� ����ϴ� ���
		
		
		
	}

}

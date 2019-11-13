package com.bit.day18;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Ex01 extends Frame {

	public Ex01(){
		Font font = new Font(Font.SANS_SERIF,Font.BOLD,20);

		setLayout(new BorderLayout());
		Panel top = new Panel();
		
		java.awt.TextField tf = new TextField("ȭ�鿡 ���",15);
		//TextField�� �����ڿ� �ִ� int a �� ���� ���� �ǹ��Ѵ�.
		//int a�� �Է��� ���ڼ���ŭ '���' ����
		//���ڸ� Ÿ���� �� �ִ� ������Ʈ���� ���� ���ڿ� ���� ����� �����Ȱ��� �Ѵ�.
		
		tf.setFont(font);
//		tf.setText("ȭ�鿡 ���");
		//�ؽ�Ʈ�ʵ忡 String s �� �Է��ص� ä�� ����
//		tf.setEditable(true);
		//������������ ����
//		tf.setVisible(false);
//		tf.setEnabled(false);
		//setEditable�� ���ڴ� Ȱ���Ǿ������� setEnabled�� �̹��� ���ϸ��� �������� ��Ȱ��ȭ
		tf.setColumns(20);
		//�ؽ�Ʈ�ʵ��� ���� ������ �ۿ����� ����
		tf.setEchoChar('#');
		top.add(tf);
		add(top,BorderLayout.NORTH);
		//�ؽ�Ʈ�ʵ�� ����� ���� �������� ����
		
		Panel p1 = new Panel();
		GridLayout layout = new GridLayout(4,3);
		p1.setLayout(layout);
		
		Button[] btns = new Button[12];
		String[] nums = {"7","8","9","4","5","6","1","2","3","*","0","#"};
		for(int i=0; i<btns.length; i++){
			btns[i] = new Button();
			btns[i].setLabel(nums[i]);
			btns[i].setFont(font);
			p1.add(btns[i]);
		}
		
		add(p1,BorderLayout.CENTER);
		add(p1);
		setLocation(200,200);
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}

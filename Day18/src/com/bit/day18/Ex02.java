package com.bit.day18;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex02 {

	public static void main(String[] args) {
		Panel p1 = new Panel();
		Frame frame = new Frame();
		Font font = new Font("���ְ��",1,16);
		
		TextArea ta = new TextArea("Default",10,25,TextArea.SCROLLBARS_NONE);
		ta.setFont(font);
//		TextArea ta = new TextArea();
//		ta.setColumns(15);
//		ta.setRows(2);
//		ta.setText("�ʱⰪ");
//		ta.setVisible(false);
//		ta.setEditable(false);
		//������ �Ұ��ϰ� �ϴ� ��
//		ta.setEnabled(false);
		//�ش� ������ ��Ȱ��ȭ�ϴ� ��
		
		
		
		p1.add(ta);
		frame.add(p1);
		frame.setLocation(200,200);
		frame.setSize(400,300);
		frame.setVisible(true);
		
	}

}

package com.bit.day18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame {

	public Ex03(){
		
		Panel p1 = new Panel();
		
		CheckboxGroup cbg = new CheckboxGroup();
		//üũ�ڽ��� �׷��� ���� �ڽ�
		//���� �ڽ���? üũ�ڽ��� ����ϳ� ������ �� �ϳ��� ���� ����
		
		Checkbox box1 = new Checkbox("Item1",false,cbg);
		Checkbox box2 = new Checkbox("Item2",true,cbg);
		box2.setState(true);
		Checkbox box3 = new Checkbox("Item3",true,cbg);
		//�ΰ��� true�� ������ ���, ���� ���������� true�� ���ִ� �ְ�!
		box3.setState(true);
		
		
		p1.add(box1);
		p1.add(box2);
		p1.add(box3);
		add(p1);
		setLocation(200,200);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}

package com.bit.day18;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class Ex03 extends Frame {

	public Ex03(){
		
		Panel p1 = new Panel();
		
		CheckboxGroup cbg = new CheckboxGroup();
		//체크박스의 그룹이 라디오 박스
		//라디오 박스란? 체크박스와 비슷하나 선택지 중 하나만 선택 가능
		
		Checkbox box1 = new Checkbox("Item1",false,cbg);
		Checkbox box2 = new Checkbox("Item2",true,cbg);
		box2.setState(true);
		Checkbox box3 = new Checkbox("Item3",true,cbg);
		//두개가 true로 설정된 경우, 제일 마지막으로 true로 되있는 애가!
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

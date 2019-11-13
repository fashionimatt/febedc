package com.bit.day18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex11 extends Frame{

	public Ex11() {
		Panel p = new Panel();
		p.setLayout(null);
		//배치관리자를 사용하지 않겠다는 의미로. default는 absolute이다.
		//구성에 대한 크기와 위치를 필수적으로 설정해야 한다.
		Button btn1 = new Button("버튼1");
		btn1.setSize(100,100);
		btn1.setLocation(384-100,361-100);
		p.add(btn1);
		add(p);
		//위치 입력이 없을 시, setLocation의 default 값인 (0,0)으로 설정이 된다.
		setBounds(200,200,400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}

}

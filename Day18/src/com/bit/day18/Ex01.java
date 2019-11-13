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
		
		java.awt.TextField tf = new TextField("화면에 출력",15);
		//TextField의 생성자에 넣는 int a 는 글자 수를 의미한다.
		//int a에 입력한 글자수만큼 '출력' 가능
		//글자를 타입할 수 있는 엘리먼트들은 보통 글자에 따라서 사이즈가 결정된가나 한다.
		
		tf.setFont(font);
//		tf.setText("화면에 출력");
		//텍스트필드에 String s 를 입력해둔 채로 시작
//		tf.setEditable(true);
		//수정가능유무 조정
//		tf.setVisible(false);
//		tf.setEnabled(false);
		//setEditable은 글자는 활성되어있으나 setEnabled는 이미지 파일마냥 글자조차 비활성화
		tf.setColumns(20);
		//텍스트필드의 길이 조절은 밖에서도 가능
		tf.setEchoChar('#');
		top.add(tf);
		add(top,BorderLayout.NORTH);
		//텍스트필드는 사이즈를 전혀 조종받지 않음
		
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

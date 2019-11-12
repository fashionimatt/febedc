package com.bit.day17;

import java.awt.Frame;

import javax.swing.JFrame;

public class Ex16 {

	public static void main(String[] args) {
		java.awt.Frame frame1 = new Frame();
		javax.swing.JFrame frame2 = new JFrame();
		
		frame1.setVisible(true);
		frame2.setVisible(true);
		//초기 자바는 UI 컴포넌트를 제공하지 않았다.
		//자바는 여러 플랫폼을 활용하게끔 하는 언어이기 때문에.....
		//awt & swing만 적용할 예정 -> 잘 할 필요는 없는거시다...
		//UI를 하면서 객체 지향에 대한 학습이 원활하게 이루어질 수 있으며, awt와 swing을 통해 학습하기 좋기 때문에
		//학습하는 것
		//awt = 자바가 가장 최초에 제공하단 UI 컴포넌트, 자바가 제공하는 것이 아닌 운영체제에 종속적
		//		창이 필요하면, 운영체제에 요구하는 방식
		//swing = 그 후에 사용자들의 건의가 많아져서 만들게 된 컴포넌트, 자바를 통해서 직접 만들어냄
		//		
	}

}

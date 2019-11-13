package com.bit.day18;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class Ex13 {

	public static void main(String[] args) {
		Frame frame = new Frame("제목 없음 - Windows 메모장");
		
		
		///////////////////전체 메뉴 구성///////////////////

		Menu[] mns = new Menu[5];
		String[] msg = {"파일(F)", "편집(E)", "서식(O)", "보기(V)", "도움말"};
		for(int i=0; i<mns.length; i++){
			mns[i] = new Menu(msg[i]);
		}
		
		MenuBar mb = new MenuBar();
		for(int i=0; i<mns.length; i++){
			mb.add(mns[i]);
		}
		
		/////////////////////////////////////////////////
		
		String[][] filemi = {{"새로 만들기(N) Ctrl+N","새 창(W) Ctrl+Shift+N", 
			"열기(O)... Ctrl+O", "저장(S) Ctrl+S", "다른 이름으로 저장(A) Ctrl+Shift+S"},
			{"페이지 설정(U)...", "인쇄(P)... Ctrl+P"},
			{"끝내기(X)"}};
		MenuItem[][] file = new MenuItem[filemi.length][];
		for(int i=0; i<filemi.length; i++){
			file[i] = new MenuItem [filemi[i].length];
			for(int j=0; j<filemi[i].length; j++){
				if(filemi[i][j]==null){
					file[i][j]=null;
				}else{
					file[i][j]=new MenuItem(filemi[i][j]);
				}
			}
		}
		for(int i=0; i<file.length; i++){
			for(int j=0; j<file[i].length; j++){
				mns[0].add(file[i][j]);
			}
			if(i==file.length-1){break;}
			else{mns[0].addSeparator();}
		}
		
		/////////////////////////////////////////////////
		
		String[][] editmi = {{"실행 취소(U) Ctrl+Z"},
				{"잘라내기(T) Ctrl+X","복사(C) Ctrl+C","붙여넣기(V) Ctrl+V", "삭제(L) Del"}, 
				{"Bing으로 검색(S) Ctrl+E", "찾기(F)... Ctrl+F",
				"다음 찾기(N) F3","이전 찾기(V) Shitft+F3","바꾸기(R)... Ctrl+H", "이동(G)... Ctrl+G"},
			{"모두 선택(A) Ctrl+A", "시간/날짜(D) F5"}};
		MenuItem[][] edit = new MenuItem[editmi.length][];
		for(int i=0; i<editmi.length; i++){
			edit[i] = new MenuItem [editmi[i].length];
			for(int j=0; j<editmi[i].length; j++){
				if(editmi[i][j]==null){
					edit[i][j]=null;
				}else{
					edit[i][j]=new MenuItem(editmi[i][j]);
				}
			}
		}
		for(int i=0; i<edit.length; i++){
			for(int j=0; j<edit[i].length; j++){
				mns[1].add(edit[i][j]);
			}
			if(i==edit.length-1){break;}
			else{mns[1].addSeparator();}
		}
		/////////////////////////////////////////////////////////////////////
		
		MenuItem form1 = new MenuItem("자동 줄 바꿈(W)");
		MenuItem form2 = new MenuItem("글꼴(F)...");
		mns[2].add(form1);
		mns[2].add(form2);
		
		/////////////////////////////////////////////////////////////////////
		
		Menu viewmi1 = new Menu("확대하기/축소하기");
		MenuItem viewmi1_1 = new MenuItem("확대(I)                                                  Ctrl+더하기");
		MenuItem viewmi1_2 = new MenuItem("축소(O)                                                    Ctrl+빼기");
		MenuItem viewmi1_3 = new MenuItem("확대하기/축소하기 기본값 복원                Ctrl+O");
		viewmi1.add(viewmi1_1);
		viewmi1.add(viewmi1_2);
		viewmi1.add(viewmi1_3);
		
		MenuItem viewmi2 = new CheckboxMenuItem("상태 표시줄(S)");
		mns[3].add(viewmi1);
		mns[3].add(viewmi2);
		
		////////////////////////////////////////////////////////////////////////

		MenuItem[] help = new MenuItem[3];
		String[] helpmi = {"도움말 보기(H)", "피드백 보내기(F)", "메모장 정보(A)"};
		for(int i=0; i<help.length; i++){
			help[i] = new MenuItem(helpmi[i]);
			mns[4].add(help[i]);
			if(i==1){
				mns[4].addSeparator();
			}
		}
		
		///////////////////////////////////////////////////////////////////////////////
		
		TextArea ta = new TextArea(" ",15,20,0);
		
		frame.add(ta);
		frame.setMenuBar(mb);
		frame.setBounds(200,200,400,400);
		frame.setVisible(true);
	}

}

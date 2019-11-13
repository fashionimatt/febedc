package com.bit.day18;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class Ex13 {

	public static void main(String[] args) {
		Frame frame = new Frame("���� ���� - Windows �޸���");
		
		
		///////////////////��ü �޴� ����///////////////////

		Menu[] mns = new Menu[5];
		String[] msg = {"����(F)", "����(E)", "����(O)", "����(V)", "����"};
		for(int i=0; i<mns.length; i++){
			mns[i] = new Menu(msg[i]);
		}
		
		MenuBar mb = new MenuBar();
		for(int i=0; i<mns.length; i++){
			mb.add(mns[i]);
		}
		
		/////////////////////////////////////////////////
		
		String[][] filemi = {{"���� �����(N) Ctrl+N","�� â(W) Ctrl+Shift+N", 
			"����(O)... Ctrl+O", "����(S) Ctrl+S", "�ٸ� �̸����� ����(A) Ctrl+Shift+S"},
			{"������ ����(U)...", "�μ�(P)... Ctrl+P"},
			{"������(X)"}};
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
		
		String[][] editmi = {{"���� ���(U) Ctrl+Z"},
				{"�߶󳻱�(T) Ctrl+X","����(C) Ctrl+C","�ٿ��ֱ�(V) Ctrl+V", "����(L) Del"}, 
				{"Bing���� �˻�(S) Ctrl+E", "ã��(F)... Ctrl+F",
				"���� ã��(N) F3","���� ã��(V) Shitft+F3","�ٲٱ�(R)... Ctrl+H", "�̵�(G)... Ctrl+G"},
			{"��� ����(A) Ctrl+A", "�ð�/��¥(D) F5"}};
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
		
		MenuItem form1 = new MenuItem("�ڵ� �� �ٲ�(W)");
		MenuItem form2 = new MenuItem("�۲�(F)...");
		mns[2].add(form1);
		mns[2].add(form2);
		
		/////////////////////////////////////////////////////////////////////
		
		Menu viewmi1 = new Menu("Ȯ���ϱ�/����ϱ�");
		MenuItem viewmi1_1 = new MenuItem("Ȯ��(I)                                                  Ctrl+���ϱ�");
		MenuItem viewmi1_2 = new MenuItem("���(O)                                                    Ctrl+����");
		MenuItem viewmi1_3 = new MenuItem("Ȯ���ϱ�/����ϱ� �⺻�� ����                Ctrl+O");
		viewmi1.add(viewmi1_1);
		viewmi1.add(viewmi1_2);
		viewmi1.add(viewmi1_3);
		
		MenuItem viewmi2 = new CheckboxMenuItem("���� ǥ����(S)");
		mns[3].add(viewmi1);
		mns[3].add(viewmi2);
		
		////////////////////////////////////////////////////////////////////////

		MenuItem[] help = new MenuItem[3];
		String[] helpmi = {"���� ����(H)", "�ǵ�� ������(F)", "�޸��� ����(A)"};
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

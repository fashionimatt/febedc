package com.bit.day16;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// ���� ���� ���α׷� (ver 0.4.0)
		// usage of StringBuffer needed
		// 1.�Է� 2.���� 3.���� 4.���� 0.���� >
		Scanner sc = new Scanner(System.in);
		StringBuffer title = new StringBuffer("���� ���� ���α׷� (ver 0.4.0)");
		StringBuffer menu = new StringBuffer("<1>.�Է� <2>.���� <3>.���� <4>.���� <0>.���� > ");
		StringBuilder bar = new StringBuilder("������������������������������������������������������������������������������������������");
		String input = null;
		StringBuffer data = new StringBuffer("�й�\t������\t������\t������\t���հ�\t�����\t\n"+bar+"\n");
		int num = 190000;
		
		System.out.println(bar);
		System.out.println(title);
		System.out.println(bar);
		while(true){
			System.out.print(menu);
			input = sc.nextLine();
			int con = Integer.parseInt(input);
			if(con==0){break;}
			else if(con==1){
				num++;
				data.append(num+"\t��");
				System.out.println(num + "�� ���� ������? > ");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				data.append(input+"\t��");
				System.out.println(num + "�� ���� ������? > ");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				data.append(input+"\t��");
				System.out.println(num + "�� ���� ������? > ");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				data.append(input+"\t��");
				int total = kor + eng + math;
				double avg = total/3*100/100.0;
				String totals = Integer.toString(total);
				String avgs = Double.toString(avg);
				data.append(totals + "\t��").append(avgs + "\n");
			}else if(con==2){
				System.out.println(data);
			}else if(con==3){
				System.out.println("������ �й���? > ");
				input = sc.nextLine();
				int start = data.indexOf(input);
				int temp = Integer.parseInt(input)+1;
				int end = data.indexOf(Integer.toString(temp));
				try{
				data.delete(start,end);
				}catch(StringIndexOutOfBoundsException e){
				data.delete(start,data.length());	
				}
				data.insert(start,input+"\t��");
				System.out.println("���� ������? > ");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				data.insert(start,input+"\t��");
				System.out.println("���� ������? > ");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				data.insert(start,input+"\t��");
				System.out.println("���� ������? > ");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				data.insert(start,input+"\t��");
				int total = kor + eng + math;
				double avg = total/3*100/100.0;
				String totals = Integer.toString(total);
				String avgs = Double.toString(avg);
				data.insert(start,totals + "\t��" + avgs + "\n");
			}else if(con==4){
				System.out.println("������ �й���? > ");
				input = sc.nextLine();
				int start = data.indexOf(input);
				int temp = Integer.parseInt(input)+1;
				int end = data.indexOf(Integer.toString(temp));
				try{
				data.delete(start,end);
				}catch(StringIndexOutOfBoundsException e){
				data.delete(start,data.length());	
				}
			}else{
				System.out.println("��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��Ͽ��ּ���");
				continue;
			}
		}
		System.out.println("���õ� �����ϼ̽��ϴ� :)");
	}
}

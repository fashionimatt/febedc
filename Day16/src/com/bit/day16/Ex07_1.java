package com.bit.day16;

import java.util.Scanner;

public class Ex07_1 {

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
		int num = 19000; 
		String[] msgs = {"���� ������? > ","���� ������? > ", "���� ������? > "};
		int[] sum = new int[3];
		
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
				for(int i=0; i<msgs.length; i++){
					System.out.print(msgs[i]);
					input = sc.nextLine();
					int num1 = Integer.parseInt(input);
					if(num1>100||num1<0){
						System.out.println("�ء�0~100 ���� ���� �߿� �Է����ּ���ء�");
						i--;
						continue;
					}
					sum[i] = num1;
					data.append(input+"\t��");
				}
				int total = sum[0] + sum[1] + sum[2];
				double avg = total/3*100/100.0;
				String totals = Integer.toString(total);
				String avgs = Double.toString(avg);
				data.append(totals + "\t��"+ avgs + "\n");
			}else if(con==2){
				System.out.println(data);
			}else if(con==3){
				System.out.println("������ �й���? > ");
				input = sc.nextLine();
				int start = data.indexOf(input);
				int temp = Integer.parseInt(input)+1;
				int end = data.indexOf(Integer.toString(temp));
				String str = input;
				for(int i=0; i<msgs.length; i++){
					System.out.println(msgs[i]);
					input = sc.nextLine();
					int num1 = Integer.parseInt(input);
					sum[i] = num1;
					str+="\t��"+input;
				}
				int total = sum[0] + sum[1] + sum[2];
				double avg = total/3*100/100.0;
				String totals = Integer.toString(total);
				String avgs = Double.toString(avg);
				str+="\t��"+totals+"\t��"+avgs + "\n";
				try
				{data.replace(start,end,str);}
				catch(StringIndexOutOfBoundsException e){
					data.replace(start,data.length(),str);
				}
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

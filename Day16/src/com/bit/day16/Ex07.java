package com.bit.day16;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 성적 관리 프로그램 (ver 0.4.0)
		// usage of StringBuffer needed
		// 1.입력 2.보기 3.수정 4.삭제 0.종료 >
		Scanner sc = new Scanner(System.in);
		StringBuffer title = new StringBuffer("성적 관리 프로그램 (ver 0.4.0)");
		StringBuffer menu = new StringBuffer("<1>.입력 <2>.보기 <3>.수정 <4>.삭제 <0>.종료 > ");
		StringBuilder bar = new StringBuilder("─────────────────────────────────────────────");
		String input = null;
		StringBuffer data = new StringBuffer("학번\t│국어\t│영어\t│수학\t│합계\t│평균\t\n"+bar+"\n");
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
				data.append(num+"\t│");
				System.out.println(num + "번 국어 점수는? > ");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				data.append(input+"\t│");
				System.out.println(num + "번 영어 점수는? > ");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				data.append(input+"\t│");
				System.out.println(num + "번 수학 점수는? > ");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				data.append(input+"\t│");
				int total = kor + eng + math;
				double avg = total/3*100/100.0;
				String totals = Integer.toString(total);
				String avgs = Double.toString(avg);
				data.append(totals + "\t│").append(avgs + "\n");
			}else if(con==2){
				System.out.println(data);
			}else if(con==3){
				System.out.println("수정할 학번은? > ");
				input = sc.nextLine();
				int start = data.indexOf(input);
				int temp = Integer.parseInt(input)+1;
				int end = data.indexOf(Integer.toString(temp));
				try{
				data.delete(start,end);
				}catch(StringIndexOutOfBoundsException e){
				data.delete(start,data.length());	
				}
				data.insert(start,input+"\t│");
				System.out.println("국어 점수는? > ");
				input = sc.nextLine();
				int kor = Integer.parseInt(input);
				data.insert(start,input+"\t│");
				System.out.println("영어 점수는? > ");
				input = sc.nextLine();
				int eng = Integer.parseInt(input);
				data.insert(start,input+"\t│");
				System.out.println("수학 점수는? > ");
				input = sc.nextLine();
				int math = Integer.parseInt(input);
				data.insert(start,input+"\t│");
				int total = kor + eng + math;
				double avg = total/3*100/100.0;
				String totals = Integer.toString(total);
				String avgs = Double.toString(avg);
				data.insert(start,totals + "\t│" + avgs + "\n");
			}else if(con==4){
				System.out.println("삭제할 학번은? > ");
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
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력하여주세요");
				continue;
			}
		}
		System.out.println("오늘도 수고하셨습니다 :)");
	}
}

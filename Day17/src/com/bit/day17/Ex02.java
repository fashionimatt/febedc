package com.bit.day17;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Java\\day17";
		System.out.print("path > ");
		path = sc.nextLine();
		File file1 = new File(path);
		System.out.println ("C:\\JAVA ���͸�\n");
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd a hh:mm");
		if(file1.exists()){
			String[] data = file1.list();
			for(int i=0; i<data.length; i++){
				File file2 = new File(path + "\\" + data[i]);
				boolean dir = file2.isDirectory();
				Date date = new Date(file2.lastModified());
				String time = sdf.format(date);
				System.out.print(time);
				if(dir==true){
					System.out.print("\t<dir>\t\t");
				} else {
					System.out.print("\t\t" + file2.length() + "\t");
					}
				System.out.println("\t"+data[i]);
			}
		} else {
			System.out.println("��θ� Ȯ���Ͻ� �� �ٽ� �Է����ּ���");
		}
	}

}

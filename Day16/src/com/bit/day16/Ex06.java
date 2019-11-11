package com.bit.day16;

public class Ex06 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("java");
		StringBuilder sb2 = new StringBuilder("java");
		StringBuilder sb3 = new StringBuilder("java");
		StringBuilder sb4 = new StringBuilder("java");
		StringBuilder sb5 = new StringBuilder("java");
		char[] chs = {'A','B','C','D','E','F','G'};
		String st2 = "ABCDEFG";
		sb1.append(chs,2,4);
		// append(char[] str, int offset, int len)
		// str = 배열, offset = 배열의 어느 지점부터 추가할건지, len = offset으로부터 어느 길이만큼 복사할건지
		System.out.println(sb1);
		sb2.append(st2,2,6);
		// append(CharSequence s, int start, int end)
		// s = 문자열, start = 배열의 어느 지점부터 추가할건지, end = 배열의 어느지점까지 추가할건지
		System.out.println(sb2);
		System.out.println("-------------------------------------");
		sb3.getChars(1, 3, chs, 2);
		//.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		//srcBegin = 오리지날 어디서부터 srcEnd=어디까지 가져와서 
		//dst = 어떤 char배열의 dstBegin = 자리에 교체해서 넣을지
		for(int i=0; i<chs.length; i++){
			System.out.println(chs[i]);
		}
		sb4.insert(3, "Hello");
		System.out.println(sb4);
		sb5.replace(1,3,"AV");
		System.out.println(sb5);
	}

}

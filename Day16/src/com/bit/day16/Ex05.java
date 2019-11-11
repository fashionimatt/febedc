package com.bit.day16;

public class Ex05 {

	public static void main(String[] args) {
		int[] source = {1,3,5,7,8,9,13,23,45,67};
//		int[] source = {5,7,8,9,13};
		int[] target = new int[10];
		
		//
//		for(int i=0; i<target.length; i++){
//			target[i] = source[i];
//		}
		System.arraycopy(source, 0, target, 0, source.length);
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//src = 소스 배열, srcPos = 복사의 시작점 , dest = 복사받을 배열, 
		//destPos = 복사받을 배열의 시작점 , length = 얼마만큼 복사할지
		//arraycopy이기 때문에 배열이 2개는 있어야 함.
		//원하는 부분만 복사할 수도 있음
		source[3] = 6;
		for(int i = 0; i<target.length; i++){
			System.out.println(target[i]);
		}
	}

}

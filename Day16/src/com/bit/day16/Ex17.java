package com.bit.day16;

import java.util.Arrays;
import java.util.List;

public class Ex17 {

	public static void main(String[] args) {
		int[] arr1 = {1,3,6,23,7,5};
		int[] arr2 = {1,3,6,23,7,5};
		int[] arr3 = new int[7];
		
		Arrays.sort(arr1);
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(arr1.toString());
		//기본적으로 toString의 기능은 참조변수의 주소값을 가져오는 데에 있다.
		//그러나 Arrays나 Integer,Double 등의 클래스에서 오버라이딩 되어 우리가 원하는 결과값을
		//출력하는 것이다.
		System.out.println("index number : " + Arrays.binarySearch(arr1, 23));
		//Arrays.binarySearch는 기본 검색 방식이 2진트리 검색 방식이라 정렬 없이 쓰게 되면 엉뚱한 결과가 나와버림
		System.out.println(Arrays.toString(arr1));
		List<Integer> list1 = Arrays.asList(1,3,5,7,9);
		for(int i=0; i<list1.size(); i++){
		System.out.println(list1.get(i));
		}
		System.out.println("────────────────────────────────────────────────");
		Arrays.fill(arr3, 11);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOf(arr1, 6);
		System.out.println(Arrays.toString(arr4));
		int[] arr5 = Arrays.copyOfRange(arr1, 0, 10);
		//copyOfRange(Array[] original, int from, int to)
		//original = 복사하려는 대상배열 from = original의 어디에서부터 length = 복사받을 배열의 길이
		System.out.println(Arrays.toString(arr5));
		
		
	}
}

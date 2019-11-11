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
		//�⺻������ toString�� ����� ���������� �ּҰ��� �������� ���� �ִ�.
		//�׷��� Arrays�� Integer,Double ���� Ŭ�������� �������̵� �Ǿ� �츮�� ���ϴ� �������
		//����ϴ� ���̴�.
		System.out.println("index number : " + Arrays.binarySearch(arr1, 23));
		//Arrays.binarySearch�� �⺻ �˻� ����� 2��Ʈ�� �˻� ����̶� ���� ���� ���� �Ǹ� ������ ����� ���͹���
		System.out.println(Arrays.toString(arr1));
		List<Integer> list1 = Arrays.asList(1,3,5,7,9);
		for(int i=0; i<list1.size(); i++){
		System.out.println(list1.get(i));
		}
		System.out.println("������������������������������������������������������������������������������������������������");
		Arrays.fill(arr3, 11);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = Arrays.copyOf(arr1, 6);
		System.out.println(Arrays.toString(arr4));
		int[] arr5 = Arrays.copyOfRange(arr1, 0, 10);
		//copyOfRange(Array[] original, int from, int to)
		//original = �����Ϸ��� ���迭 from = original�� ��𿡼����� length = ������� �迭�� ����
		System.out.println(Arrays.toString(arr5));
		
		
	}
}

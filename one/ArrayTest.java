package com.java.one;

public class ArrayTest {

	public static void main(String[] args) {
		//�迭
		//�迭 ũ��5�� int����
		int arr[]=new int[5];
		//���
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("===================");
		//for���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}

}

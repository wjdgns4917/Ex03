package com.java.one;

public class ArrayTest3 {

	public static void main(String[] args) {
		//�迭
		//�迭 ũ��5�� int����
//		int arr[]=new int[5];
		//�Է�
//		arr[0]=100;
//		arr[1]=200;
//		arr[2]=300;
//		arr[3]=400;
//		arr[4]=500;
		
//		int arr[]= {100,200,300,400,500};
		
		double arr[]= {10,20,30,40,50};
		
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

package com.java.one;

public class ArrayTest2 {

	public static void main(String[] args) {
		//배열
		//배열 크기5개 int선언
		int arr[]=new int[5];
		//입력
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
//		//출력
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		
		System.out.println("===================");
		//for출력
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}

}

package com.java.one;

import java.util.Scanner;

public class ArrayAccess2 {

	public static void main(String[] args) {
		//max값 출력, min값 출력
		Scanner sc=new Scanner(System.in);
		
		int intArray[]=new int[5];
		int max=0;
		int min=101;
		System.out.println("정수 5개 입력");
		//for문으로 배열에 데이터 입력
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=sc.nextInt();
			//max 계산하기
			if (intArray[i]>max) {
				max=intArray[i]; //intArray[i]->max
			}
			if (intArray[i]<min) {
				min=intArray[i]; //intArray[i]->min
			}
		
		}
		
		//max출력
		System.out.println("max : "+max);
		//min출력
		System.out.println("min : "+min);
		//for문으로 배열의 데이터 출력
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}

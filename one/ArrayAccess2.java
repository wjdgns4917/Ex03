package com.java.one;

import java.util.Scanner;

public class ArrayAccess2 {

	public static void main(String[] args) {
		//max�� ���, min�� ���
		Scanner sc=new Scanner(System.in);
		
		int intArray[]=new int[5];
		int max=0;
		int min=101;
		System.out.println("���� 5�� �Է�");
		//for������ �迭�� ������ �Է�
		for (int i = 0; i < intArray.length; i++) {
			intArray[i]=sc.nextInt();
			//max ����ϱ�
			if (intArray[i]>max) {
				max=intArray[i]; //intArray[i]->max
			}
			if (intArray[i]<min) {
				min=intArray[i]; //intArray[i]->min
			}
		
		}
		
		//max���
		System.out.println("max : "+max);
		//min���
		System.out.println("min : "+min);
		//for������ �迭�� ������ ���
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}

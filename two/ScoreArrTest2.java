package com.java.two;

import java.util.Scanner;

public class ScoreArrTest2 {

	public static void main(String[] args) {
		
		//�ο� : 5��
		//���� : 
		//��� :
		//�߰����� �ֿܼ��� ������ �Է¹޾Ƽ�
		//���� �Է��� ���� 30~100�� ���� ����
		//�̿��� ������ �Է°����� ����
		//�� ������ ó���� �� �ֵ���
		
		//int [] arr= {50,60,70,90,100};
		Scanner sc=new Scanner(System.in);
		int tot=0;
		float avg=0.0f;
		
		int [] arr=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			if (arr[i]<30 || arr[i]>100) {
				System.out.println("�Է°�����");
				--i;
				continue;
			}
			
			tot +=arr[i];	
		}
		
		avg=tot/arr.length;
		
		System.out.println("�ο� : "+arr.length+"��");
		System.out.println("���� : "+ tot);
		System.out.println("��� : "+ avg);
	}

}

package com.java.one;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int count=0; // count�� �Էµ� ������ ����
		int sum=0; // sum�� ��
		int n;
		int n1,n2,n3,n4;
		int i[]=new int[10]; //array
		String sn;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� q�� �Է��ϼ���.");
		sn=sc.next();
//		int n =sc.nextInt(); //���� �Է�
		while (true) { // q�� �ԷµǸ� while�� ���
			if (sn.equals("q")) {
				break;
			}
			n=Integer.parseInt(sn);
			sum +=n; //sum=sum+n �Է��� ���� ����
			count++;
			sn=sc.next();
//			n=sc.nextInt(); //���� ��� �Է�
			
		}
		if (count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
			}
		else {
			System.out.println("������ ������ "+count+"���̸� ");
			System.out.println("����� " + (double)sum/count+"�Դϴ�.");
		}
		sc.close();

	}

}

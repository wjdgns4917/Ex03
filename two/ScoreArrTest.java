package com.java.two;

public class ScoreArrTest {

	public static void main(String[] args) {
		int []arr= {50,60,70,90,100};
		int tot=0;
		float avg=0.0f;
		
		//�ο� : 5��
		//���� : 
		//��� :
		//�� ������ ��µ� �� �ֵ���

		for (int i = 0; i < arr.length; i++) {
			tot +=arr[i];}
		avg=tot/arr.length;
		
		System.out.println("�ο� : "+arr.length+"��");
		System.out.println("���� : "+ tot);
		System.out.println("��� : "+ avg);
		
		
	}

}

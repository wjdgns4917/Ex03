package com.java.one;

public class WrapperTest {

	public static void main(String[] args) {
		String num1="100";
		String num2="200";
		//�μ��� ���ϱ� ���ڰ� ���յŹ�����.
//		System.out.println("���ϱ� : "+(num1+num2));
	
		//�μ��� ���ϱ�
		//��ȯ
		int cNum1=Integer.parseInt(num1);
		int cNum2=Integer.parseInt(num2);
		System.out.println("���ϱ� : "+(cNum1+cNum2));
		
	}

}

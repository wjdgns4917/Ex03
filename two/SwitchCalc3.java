package com.java.two;

import java.util.Scanner;

public class SwitchCalc3 {

	public static void main(String[] args) {
		//switch case�� ����
		Scanner sc=new Scanner(System.in);
		float num1=0;
		float num2=0;
		
		String oper="";
		
		//�Է¼��� ù��, ������, �μ�
		System.out.println("num1 �Է�");
		num1=sc.nextInt();
		
		System.out.println("������ �Է�(+,-,*,/)");
		oper=sc.next();
		
		System.out.println("num2 �Է�");
		num2=sc.nextInt();
		
	    switch (oper) {
		case "+":
			System.out.println("Plus : "+(num1+num2));
			break;
		case "-":
			System.out.println("Min : "+(num1-num2));
			break;
		case "*":
			System.out.println("MUlti : "+(num1*num2));
			break;
		case "/":
			System.out.println("Div : "+(float)((float)num1/num2));
			break;

		default:
			System.out.println("������ �߸��Է�");
			break;
	    }
	
		
	}

}

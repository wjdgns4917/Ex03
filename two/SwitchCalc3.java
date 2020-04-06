package com.java.two;

import java.util.Scanner;

public class SwitchCalc3 {

	public static void main(String[] args) {
		//switch case로 변형
		Scanner sc=new Scanner(System.in);
		float num1=0;
		float num2=0;
		
		String oper="";
		
		//입력순서 첫수, 연산자, 두수
		System.out.println("num1 입력");
		num1=sc.nextInt();
		
		System.out.println("연산자 입력(+,-,*,/)");
		oper=sc.next();
		
		System.out.println("num2 입력");
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
			System.out.println("연산자 잘못입력");
			break;
	    }
	
		
	}

}

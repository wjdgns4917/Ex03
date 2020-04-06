package com.java.one;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		int count=0; // count는 입력된 정수의 개수
		int sum=0; // sum은 합
		int n;
		int n1,n2,n3,n4;
		int i[]=new int[10]; //array
		String sn;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 q를 입력하세요.");
		sn=sc.next();
//		int n =sc.nextInt(); //정수 입력
		while (true) { // q가 입력되면 while문 벗어남
			if (sn.equals("q")) {
				break;
			}
			n=Integer.parseInt(sn);
			sum +=n; //sum=sum+n 입력한 숫자 누적
			count++;
			sn=sc.next();
//			n=sc.nextInt(); //정수 계속 입력
			
		}
		if (count == 0) {
			System.out.println("입력된 수가 없습니다.");
			}
		else {
			System.out.println("정수의 개수는 "+count+"개이며 ");
			System.out.println("평균은 " + (double)sum/count+"입니다.");
		}
		sc.close();

	}

}

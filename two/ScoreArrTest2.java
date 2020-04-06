package com.java.two;

import java.util.Scanner;

public class ScoreArrTest2 {

	public static void main(String[] args) {
		
		//인원 : 5명
		//총합 : 
		//평균 :
		//추가내용 콘솔에서 점수를 입력받아서
		//점수 입력의 제한 30~100점 사이 점수
		//이외의 점수는 입력값에서 제외
		//위 내용이 처리될 수 있도록
		
		//int [] arr= {50,60,70,90,100};
		Scanner sc=new Scanner(System.in);
		int tot=0;
		float avg=0.0f;
		
		int [] arr=new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			if (arr[i]<30 || arr[i]>100) {
				System.out.println("입력값제외");
				--i;
				continue;
			}
			
			tot +=arr[i];	
		}
		
		avg=tot/arr.length;
		
		System.out.println("인원 : "+arr.length+"명");
		System.out.println("총합 : "+ tot);
		System.out.println("평균 : "+ avg);
	}

}

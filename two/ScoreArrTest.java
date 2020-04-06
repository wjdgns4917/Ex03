package com.java.two;

public class ScoreArrTest {

	public static void main(String[] args) {
		int []arr= {50,60,70,90,100};
		int tot=0;
		float avg=0.0f;
		
		//인원 : 5명
		//총합 : 
		//평균 :
		//위 내용이 출력될 수 있도록

		for (int i = 0; i < arr.length; i++) {
			tot +=arr[i];}
		avg=tot/arr.length;
		
		System.out.println("인원 : "+arr.length+"명");
		System.out.println("총합 : "+ tot);
		System.out.println("평균 : "+ avg);
		
		
	}

}

package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요. : ");
		int korean = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요. : ");
		int english = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요. : ");
		int math = sc.nextInt();
		
		int total = korean + english + math;
		double average = total / 3.0;
		
		
		System.out.println("합계 : " + total);
		
		System.out.println("평균 : " + average);
		
		String result = korean >= 40 && english >= 40 && math >= 40 &&
				average >=60 ? "합격" : "불합격";
		
		System.out.println(result);
				
	}

}

package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요. : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요. : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요. : ");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		
		System.out.println("합계 : " + total);
		
		System.out.println("평균 : " + avg);
		
		String result = kor >= 40 && eng >= 40 && math >= 40 &&
				avg >=60 ? "합격" : "불합격";
		
		System.out.println(result);
				
	}

}

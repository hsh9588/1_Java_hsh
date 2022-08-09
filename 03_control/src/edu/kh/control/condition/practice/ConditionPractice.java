package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		
		if (input <= 0) {
			System.out.println("양수만 입력해주세요.");
		} else if (input % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}			
		
	}	
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		double avg = sum / 3.0;
		
		if (avg >= 60.0 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.printf("국어 : %d\n수학 : %d\n영어 : %d\n합계 : %d\n평균 : %.1f\n축하합니다, 합격입니다!\n", kor, mat, eng, sum, avg );
		} else {
			System.out.println("불합격입니다.");
		}
				
	}
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		// 1, 3, 5, 7, 8, 10, 12 = 31
		// 4, 6, 9, 11 = 30
		// 2 = 28
		switch (month) {
		case 1: case 3 : case 5 : case 7: case 8: case 10: case 12: 
			System.out.printf("%d월은 31일까지 있습니다.", month); 
			break;
			
		case 4: case 6 : case 9: case 11:  
			System.out.printf("%d월은 30일까지 있습니다.", month); 
			break;
			
		case 2: 
			System.out.printf("%d월은 28일까지 있습니다.", month); 
			break;
			
		default: 
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}		
		
	}
	
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double BMI = kg / (m * m);
		
		if (BMI < 18.5) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("저체중");
		} else if (BMI < 23) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("정상체중");
		} else if (BMI < 25) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("과체중");			
		} else if (BMI < 30) {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("비만");			
		} else {
			System.out.println("BMI 지수 : " + BMI);
			System.out.println("고도비만");			
		}	
		
	}
	
	
	public void practice5() {
		
//		중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 
//		Pass 또는 Fail을 출력하세요.
//		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
//		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
//		70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int a_point = sc.nextInt();
		
		System.out.print("기말 고사 점수 : ");
		int b_point = sc.nextInt();
		
		System.out.print("과제 점수 : ");
		int c_point = sc.nextInt();
		
		System.out.print("출석 횟수 : ");
		int d_point = sc.nextInt();
		
		double sum = (a_point * 0.2) + (b_point * 0.3) + (c_point * 0.3) + (d_point * 1.0);
	
		
		if (d_point <= 10) {
			System.out.printf("Fail [출석 횟수 부족 (%d/20)]", d_point);
		} else if (sum < 70) {
			System.out.println("중간 고사 점수(20) : " + (a_point * 0.2));
			System.out.println("기말 고사 점수(30) : " + (b_point * 0.3));
			System.out.println("과제 점수(30) : " + (c_point * 0.3));
			System.out.println("출석 점수(20) : " + (d_point * 1.0));
			System.out.println("총점 : " + sum);
			System.out.println("Fail [점수 미달]");
		} else {
			System.out.println("중간 고사 점수(20) : " + (a_point * 0.2));
			System.out.println("기말 고사 점수(30) : " + (b_point * 0.3));
			System.out.println("과제 점수(30) : " + (c_point * 0.3));
			System.out.println("출석 점수(20) : " + (d_point * 1.0));
			System.out.println("총점 : " + sum);
			System.out.println("Pass");
		}
		
		
		
		
	}

}

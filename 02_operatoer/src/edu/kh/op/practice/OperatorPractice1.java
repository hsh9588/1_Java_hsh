package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 입력 :");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 입력 : ");
		int candys = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (candys / people));
		System.out.println("남는 사탕 개수 : " + (candys % people));
		
		
	}

}

package edu.kh.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int input = sc.nextInt(); // 4

		for (int row = 1; row <= input; row++) {
			for (int col = 1; col <= input; col++) {
				if (row == 1 || row == input || col == 1 || col == input) {
					System.out.print("*");					
				} else {
					System.out.print(" ");	
				}
			}
			System.out.println();
		}
	}
}
/*
 * 필기
 * 
 * 지역변수 : 필드를 제외하고, {} 내에서 선언된 변수
 * 			해당 {} 내에서만 사용 가능하고, {} 종료 시 사용 불가
 * 
 *  필드( field ) -> 멤버 변수 ( 전역변수 같은 것 아님 )
 *  
 *  1. 인스턴스 변수 : static이 없는 변수
 *  				인스턴스 생성 시 heap 영역에 생성되는 변수
 *  
 *  2. 클래스 변수( static ) : static이 있는 변수
 *  						프로그램 실행 시 static 영역에 생성될 때
 *  						"클래스명.변수명" 으로 생성되는 변수 ex) Student.schoolName
 *  
 *  3. 매개 변수
 * 
 * 
 */
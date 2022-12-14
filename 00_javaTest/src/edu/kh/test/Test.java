package edu.kh.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int[] arr1 = new int[10];
		int[] arr2 = new int[20];
		
		arr1 = arr2;
		
		for (int row = 0; row < arr1.length; row++) {
			System.out.print(arr1[row] + " ");
		}

	}
}
/*
 * 필기 20220818
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
 * 필기 20220822
 * 
 * 객체 배열
 * 
 * 1차원 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
 * 2차원 배열 : 같은 1차원 배열 참조 변수를 하나의 묶음으로 다루는 것
 * 
 *  int -> User
 * 		  (class)
 * 
 * class = 사용자 정의 자료형
 * 
 * 상속
 * 
 * 상속의 장점
 * 1. 재사용성 증가
 * 2. 중복 제거
 * 3. 유지보수성 향샹(용이)
 * 
 * 
 * 필기 20220824
 * 
 *  interface : 접점을 만드는 용도
 *  
 *  인터페이스는 추상 클래스와 달리
 *  - 접점 의미 추가
 *  - 클래스 선언부 변경( class -> interface )
 *  - 필드/메서드 작성법이 고정
 *  
 *  
 *  
 *  20220806 필기
 *  
 *  <T> 제네릭
 *  향상된 for문 : for(참조변수 : 배열 또는 컬렉션) {}
 *  			Iterator(반복자)
 *  
 *  Collection : 자바의 자료구조 모음
 *  List : 순서 유지(인덱스o), 중복 데이터 o
 *  Set : 순서 x(인덱스 x). 중복 데이터 x
 *  	-> equals(), hashCode() 오버라이딩 필요
 *  Map : 
 *  
 *  Server : 서비스를 제공하는 컴퓨터(프로그램)
 *  Client : 서비스를 요청하는 컴퓨터(프로그램)
 */

package edu.kh.control.loop;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public class ForExample {

	/*
	 * for문 - 끝이 정해져 있는 경우 사용하는 반복문 (== 반복 횟수 지정되어 있는 경우 )
	 * 
	 * [ 작성법 ]
	 * 
	 * for ( 초기식; 조건식; 증감식 ) {
	 * 
	 * 조건식이 true일 때 반복 수행할 코드
	 * 
	 * }
	 * 
	 * 초기식 : for문을 제어하는 용도의 변수 선언
	 * 
	 * 조건식 : for문의 반복 여부를 지정하는 식 조건식이 true인 경우에 반복을 수행함 보통 초기식에 사용된 변수를 이용해서 조건식을
	 * 작성함.
	 * 
	 * 증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 보통 초기식에 사용된 변수를 증가/감소 시켜 조건식의 결과를 변화게 만듦.
	 * 
	 */

	public void ex1() {
		// for문 기초 사용법 1
		// 1 ~ 10 까지 반복 출력

		for (int i = 1; i <= 10; i++) {
			// 1) 초기식 ; 2) 조건식 ; 4)증감식

			// 3) 반복 수행할 코드
			System.out.println(i + "출력");

			// 1, 2, 3, 4 수행 후 -> 2, 3, 4 반복을 한다

			// 1출력
		}

	}

	public void ex2() {
		// for문 기초 사용법 2

		// 5 ~ 12 까지 1씩 증가하면서 출력

		for (int i = 5; i <= 12; i++) {
			// 1) 2) 4)

			// 3)
			System.out.println(i + "출력");

			// 1, 2, 3, 4 수행 후 -> 2, 3, 4 반복을 한다

		}

		System.out.println("========================");

		// 1 ~ 100 까지의 모든 정수의 합

		int sum = 0;
		// 합계 저장용 변수
		// 왜 0 으로 초기화 하는가?
		// -> 0 이라는 값은 더하거나 뺄 때 아무런 영향이 없고
		// 누적이 필요한 상황에서 기준점으로 사용하기 적합하다.

		for (int i = 1; i <= 100; i++) {

			// i 값이 1 ~ 100 에서 1씩 증가
			// -> i 값을 sum 변수에 계속 누적

			sum += i; // sum = sum + i;

		}

		System.out.println("1 ~ 100 까지의 합 : " + sum);

	}

	public void ex3() {
		// for문 기초 사용법 3

		// 두 수를 입력 받아
		// 두 정수 사이의 모든 정수 합을 출력
		// 단, 첫 번째 입력이 두 번째 입력 보다 작아야 한다.

		Scanner sc = new Scanner(System.in);

		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();

		int sum = 0; // 합계 저장용 변수

		for (int i = num1; i <= num2; i++) {
			sum += i;
		}

		System.out.printf("%d 부터 %d 까지의 합 : %d \n", num1, num2, sum);

	}

	public void ex4() {

		// for문 기초 사용법 4

		// 1 ~ 100 까지 3 씩 증가하며 출력

		for (int i = 1; i <= 100; i += 3) {

			// 1 씩 증가 == i++ == i = i + 1
			// 3 씩 증가 == i+=3 == i = i + 3

			System.out.print(i + " ");
		}

		System.out.println(
				"\n==========================================================================================================");

		// 10 부터 20 까지 0.5씩 증가

		for (double i = 10.0; i <= 20.0; i += 0.5) {

			System.out.print(i + " ");
		}

	}

	public void ex5() {

		// for문 + char + 강제 형변환 응용

		// A ~ Z 까지 출력

//		for ( int i = 'A' ; i <= 'Z' ; i++) {
//			
//			System.out.print((char)i + " ");
//		}

		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}

	}

	public void ex6() { // [ 응용 ]

		// 10 부터 1 까지 1 씩 감소하면서 출력

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}

	}

	public void ex7() { // [ 응용 ]

		// 입력, sum, for 응용

		// 정수 5개를 입력 받아서 합계 구하기

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for (int i = 1; i <= 5; i++) {

			System.out.print("입력 " + i + " : ");
			sum += sc.nextInt();
			// 입력 버퍼에서 다음 정수를 얻어와
			// sum 변수에 누적

		}
		System.out.println("합계 : " + sum);

	}

	public void ex8() { // [ 응용 ]

		// ex7 응용

		// 정수를 몇 번 입력 받을지 먼저 입력 받고
		// 입력된 정수의 합계를 출력

		// ex)
		// 입력 받을 정수의 개수 : 3
		// 입력 1 : 10
		// 입력 2 : 20
		// 입력 3 : 30
		// 합계 : 60

		// ex)
		// 입력 받을 정수의 개수 : 2
		// 입력 1 : 10
		// 입력 2 : 20
		// 합계 : 30

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 출력 갯수 입력 : ");
		int max = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= max; i++) {

			System.out.print("정수 " + i + " 입력 : ");
			sum += sc.nextInt();
		}

		System.out.println("합계 : " + sum);

		/*
		 * 풀이
		 * 
		 * System.out.print("입력 받을 정수의 개수 : "); int input = sc.nextInt();
		 * 
		 * int sum = 0; for ( int i = 1 ; i <= input ; i++) { System.out.print("입력 " + i
		 * + " : "); sum += sc.nextInt(); }
		 * 
		 * System.out.println("합계 : " + sum);
		 * 
		 */
	}

	public void ex9() { // [ 기초 ]

		// for, %(나머지), if-else

		// 1 부터 20 까지 1 씩 증가하며 출력하면서
		// 단, 5 의 배수에는 () 를 붙여서 출력

		// ex) 1 2 3 4 (5) 6 7 8 9 (10) 11 12 13 14 (15) 16 17 18 19 (20)

		for (int i = 1; i <= 20; i++) {

			if (i % 5 == 0) { // 5 의 배수인 경우 양쪽에 괄호를 붙히기
				System.out.print("(" + i + ") ");
			} else { // 5 의 배수가 아닌 경우 그냥 출력
				System.out.print(i + " ");
			}

		}

	}

	public void ex10() { // [ 응용 ]

		// for, if, Scanner, 논리연산자, print 매서드

		// 구구단 출력

		// 2 ~ 9 사이 수를 하나 입력 받아
		// 해당하는 수의 단을 출력
		// 단, 입력 받은 수가 2 ~ 9 사이가 아니라면
		// "잘못 입력 하셨습니다." 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("구구단( 2 ~ 9 ) 입력 : ");
		int dan = sc.nextInt();

		if (dan < 2 || dan > 9) { // dan 이 2 ~ 9 사이가 아니라면 단이 2보다 작거나 9보다 크다
			System.out.println("잘못 입력 하셨습니다.");
		} else {

			// 2 X 1 = 2
			// 2 X 2 = 4
			// 2 X 3 = 6
			// 2 X 4 = 8
			// ...
			// 2 X 9 = 18
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i, i * dan);

			}

			System.out.println("=========================");

			// 역순 출력
			// 2 X 9 = 18
			// 2 X 8 = 16
			// 2 x 7 = 14
			// 2 X 6 = 12
			// ...
			// 2 X 1 = 2

			for (int i = 9; i >= 1; i--) {
				System.out.printf("%d X %d = %d\n", dan, i, i * dan);
			}
		}

	}

	// ================================================================================================
	// ================================================================================================

	// [ 중첩 반복문 ]

	public void ex11() {

		// 12345
		// 12345
		// 12345
		// 12345

		for (int x = 1; x <= 4; x++) { // 4번 반복
			for (int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			System.out.println(); // 줄 바꿈 ( 개행 )
		}

	}
	
	public void ex12() {
		
		// 구구단 2단부터 9단까지 모두 출력
		
		// 2X1=2 2X2=4 2x3=6 ... 
		// 3X1=3 3X2=6 3x3=9 ... 
		// 4X1=4 4X2=8 4x3=12 ... 
		// ...
		// 9X1=9 9X2=18 4x3=27 ... 
		
//		for (int dan = 2 ; dan <= 9 ; dan++) {
//			for (int i = 1 ; i <= 9 ; i++) {
//				System.out.printf("%dX%d=%d ", dan, i, dan*i);
//			}
//			System.out.println();// 줄 바꿈
//		}
		
		for (int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%dX%d=%2d ", i, j, i*j);
				// %2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			}
			System.out.println(); // 줄 바꿈
		}
	}

}

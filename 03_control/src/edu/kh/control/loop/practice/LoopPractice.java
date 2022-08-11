package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {

	// 실습문제 1 ~ 13

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);

		System.out.print("1 이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input > 0) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= input; i++) {
			if (i < input) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
			sum += i;
		}
		System.out.print(sum);

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();

		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();

		// 8 4
		if (input1 > 0) {
			if (input2 > 0) {
				if (input1 > input2) {
					for (int i = input2; i <= input1; i++) {
						System.out.print(i + " ");
					}
				} else {
					for (int i = input1; i <= input2; i++) {
						System.out.print(i + " ");
					}
				}
			} else {
				System.out.println("1이상의 숫자를 입력해주세요.");
			}
		} else {
			System.out.println("1이상의 숫자를 입력해주세요.");
		}

		// 풀이
		// 시작에 앞서 헷갈릴 때에는 안되는 것부터 시작해보자.

		// 방법 1 :
//		if (input1 < 1 || input2 < 1) { // num1, num2 중에 0이 있는가?
//			System.out.println("1 이상의 숫자를 입력해주세요/");
//
//		} else { // 둘 다 0이 아니다
//
//			// input1 < input2
//			for (int i = input1; i <= input2; i++) {
//				System.out.print(i + " ");
//			} // input1 > input2
//			for (int i = input2; i <= input1; i++) {
//				System.out.print(i + " ");
//			}
//		}
		// 방법 2 :
//		if (input1 < 1 || input2 < 1) { // num1, num2 중에 0이 있는가?
//			System.out.println("1 이상의 숫자를 입력해주세요");
//
//		} else { // 둘 다 0이 아니다
//			int start = input1;
//			int end = input2;
//
//			if (input1 > input2) {
//				start = input2;
//				end = input1;
//			}
//			for (int i = start; i <= end; i++) {
//				System.out.print(i + " ");
//		}
//
//		}

		// 방법 3 :
		if (input1 < 1 || input2 < 1) { // num1, num2 중에 0이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요");

		} else { // 둘 다 0이 아니다

			if (input1 > input2) {

				int temp = input1;

				input1 = input2;

				input2 = temp;
			}

			for (int i = input1; i <= input2; i++) {
				System.out.print(i + " ");
			}
		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		System.out.println("===== " + dan + "단 =====");

		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int dan = sc.nextInt();

		if (dan < 2 || dan > 9) {
			System.out.println("2 ~ 9 사이의 숫자만 입력해주세요.");
		} else {
			for (int x = dan; x <= 9; x++) {
				System.out.println("===== " + x + "단 =====");
				for (int i = 1; i <= 9; i++) {
					System.out.println(x + " * " + i + " = " + x * i);
				}
			}
		}

		// 풀이
		/*
		 * if (dan >= 2 && dan <= 9) {
		 * 
		 * for (int i = dan ; i <= 9 ; i++) { System.out.println("===== " + i +
		 * "단 ====="); for (int x = 1 ; x <= 9 ; x ++) { System.out.println(x + " * " +
		 * i + " = " + x * i); } System.out.println(); // 단 사이 줄 바꿈 } } else {
		 * System.out.println("2 ~ 9 사이의 숫자만 입력해주세요."); }
		 */
	}

	public void practice7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int row = 1; row <= star; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int row = 1; row <= star; row++) {
			for (int col = row; col <= star; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

//		for (int row = star; row >= 1; row--) {
//			for (int col = 1; col <= star; col++) {
//				if (row <= col) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}

		for (int row = 1; row <= star; row++) {
			for (int col = 1; col <= star - row; col++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 풀이

		// ex.
		// 정수 입력 : 4
		// *
		// **
		// ***
		// ****

		// for 문을 이용한 풀이

//		for (int row = 1; row <= star; row++) {
//
//			for (int i = star - 1; i >= 1; i--) {
//
//				// for (int i = star-row ; i >= 1 ; i--) { // star == 4
//
//				System.out.print(" ");
//
//			}
//
//			for (int col = 1; col <= row; col++) {
//				System.out.print("*");
//
//			}
//
//			System.out.println(); // 줄 바꿈
//		}

		// if 문을 이용한 풀이

//		for (int row = 1; row <= star; row++) {
//			for (int col = 1; col <= star; col++) {
//
//				if (col <= star - row) {
//					System.out.print(" ");
//
//				} else {
//					System.out.print("*");
//
//				}
//			}
//			System.out.println(); // 줄 바꿈
//		}

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

//		System.out.print("정수 입력 : ");
//		int star = sc.nextInt();
//
//		for (int row = 1; row <= star; row++) {
//			for (int col = 1; col <= row; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		for (int row = 1; row <= star; row++) {
//			for (int col = row; col <= star - 1; col++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		// 풀이

//		정수 입력 : 3

//		*
//		**
//		***
//		**
//		*

//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//
//		// 위쪽 삼각형
//
//		for (int row = 1; row <= input; row++) {
//
//			for (int col = 1; col <= row; col++) {
//
//				System.out.print("*");
//			}
//			System.out.println(); // 줄 바꿈
//		}
//		// 아랫쪽 삼각형
//
//		for (int row = input - 1 ; row >= 1; row--) {
//
//			for (int col = 1; col <= row; col++) {
//
//				System.out.print("*");
//			}
//			System.out.println(); // 줄 바꿈
//		}

//		System.out.println("==========================");

		// 풀이
//		for (int row = 1; row <= input * 2 - 1; row++) {
//
//			if (row < input) {
//
//				for (int col = 1; col <= row; col++) {
//					System.out.print("*");
//				}
//			} else {
//				for (int col = input; col > row - input; col--) {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int row = 1; row <= star; row++) {
			for (int col = 1; col <= star - row; col++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= 2 * row - 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		System.out.print("정수 입력 : ");
//		int input = sc.nextInt();
//
//		// ex. // 정수 입력 : 4 // * // ** // *** // ****
//
//		// for 문을 이용한 풀이 아직 미완성
//
//		for (int row = 1; row <= input; row++) {
//
//			for (int i = input - 1; i >= 1; i--) {
//		// for (int i = star-row ; i >= 1 ; i--) { // star == 4
//				System.out.print(" ");
//			}
//
//			for (int col = 1; col <= row; col++) {
//				System.out.print("*");
//			}
//			System.out.println(); // 줄 바꿈
//		}

		// if문을 이용한 풀이
//		for (int row = 1; row <= input; row++) {
//
//			for (int col = 1; col <= input * 2 -1; col++) {
//				if (input - row >= col || input + row <= col) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}

	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int row = star; row >= 1; row--) {
			for (int col = 1; col <= star; col++) {
				if (col == 1 || col == star || row == 1 || row == star) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void practice13() {

		Scanner sc = new Scanner(System.in);

		System.out.print("자연수 하나를 입력하세요 : ");
		int input = sc.nextInt();

		int count = 0;

		// 2의 배수 또는 3의 배수인 경우 출력
		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");

				// 2와 3의 공배수 == 2로도 나누어 떨어지고. 3으로도 나누어 떨어진다.
				if (i % 6 == 0) {
					count++; // count 증가
				}
			}
		}
		System.out.println("\ncount : " + count);
	}

}

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

		for (int row = star; row >= 1; row--) {
			for (int col = 1; col <= star; col++) {
				if (row <= col) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void practice10() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int row = 1; row <= star; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int row = 1; row <= star; row++) {
			for (int col = row; col <= star - 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice11() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int row = star; row >= 1; row--) {
			for (int col = 1; col <= 2 * star; col++) {
				if (row >= col || 10-row <= col) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}		
	
//		for (int row = 1; row <= star; row++) {
//			for (int col = 0; col <= star - row; col++) {	
//				System.out.print(" ");
//			}
//			for (int i = 0 ; i < 2 * row - 1; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (int i = 1; i < star + 1; i++) {
//			for (int j = 0; j < star - i; j++) {
//				System.out.print("-");
//			}
//			for (int k = 0; k < 2 * i - 1; k++) {
//				System.out.print("+");
//			}
//			System.out.println();
//		}
//
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int star = sc.nextInt();

		for (int row = star; row >= 1; row--) {
			for (int col = 1; col <= star; col++) {
				if (col <= 1 || col >= star || row <= 1 || row >= star) {
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

		int sum = 0;
		int count = 0;

		for (int i = 1; i <= input; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if (i % 6 == 0) {
					count++;
				}
			}
		}
		System.out.println("\ncount : " + count);
	}

}

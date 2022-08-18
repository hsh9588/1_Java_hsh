package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	public void ex1() {

		int[] arr;

		arr = new int[9];

		int sum = 0;

		for (int row = 0; row < arr.length; row++) {
			arr[row] = row + 1;
			System.out.print(arr[row] + " ");

			if (row % 2 == 0) {
				sum += arr[row];
			}
		}
		System.out.print("\n짝수 번째 인덱스 합 : " + sum);
	}

	public void ex2() {

		int[] arr;

		arr = new int[9];

		int sum = 0;

		for (int row = arr.length - 1; row >= 0; row--) {
			arr[row] = row + 1;
			System.out.print(arr[row] + " ");

			if (row % 2 == 1) {
				sum += arr[row];
			}
		}
		System.out.print("\n홀수 번째 인덱스 합 : " + sum);
	}

	public void ex3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int lengh = sc.nextInt();

		int[] arr = new int[lengh];

		for (int row = 0; row < arr.length; row++) {
			arr[row] = row + 1;
			System.out.print(arr[row] + " ");
		}
	}

	public void ex4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력 0 : ");
		int arr0 = sc.nextInt();

		System.out.print("입력 1 : ");
		int arr1 = sc.nextInt();

		System.out.print("입력 2 : ");
		int arr2 = sc.nextInt();

		System.out.print("입력 3 : ");
		int arr3 = sc.nextInt();

		System.out.print("입력 4 : ");
		int arr4 = sc.nextInt();

		int[] arr = { arr0, arr1, arr2, arr3, arr4 };

		boolean flag = true;

		System.out.print("검색할 값 : ");
		int find = sc.nextInt();
		for (int row = 0; row < arr.length; row++) {
			if (find == arr[row]) {
				System.out.println("인덱스 : " + row);
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}

	public void ex5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next();

		System.out.print("문자 : ");
		char find = sc.next().charAt(0);

		int count = 0;

		char[] ch = new char[str.length()];

		System.out.print(str + " 에 " + find + "가 존재하는 위치(인덱스) : ");
		for (int row = 0; row < str.length(); row++) {
			ch[row] = str.charAt(row);
			if (find == ch[row]) {
				System.out.print(row + " ");
				count++;
			}
		}
		System.out.println("\n" + find + " 개수 : " + count);

	}

	public void ex6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int len = sc.nextInt();

		int sum = 0;

		int[] arr = new int[len];

		for (int row = 0; row < arr.length; row++) {
			System.out.print("배열 " + row + "번째 인덱스에 넣을 값 : ");
			arr[row] = sc.nextInt();
		}
		for (int col = 0; col < arr.length; col++) {
			System.out.print(arr[col] + " ");
			sum += arr[col];
		}
		System.out.println("\n총 합 : " + sum);
	}

	public void ex7() {

		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String pin = sc.next();

		char[] ch = new char[pin.length()];

		for (int row = 0; row < pin.length(); row++) {
			ch[row] = pin.charAt(row);
			if (row > 7) {
				ch[row] = '*';
			}
			System.out.print(ch[row]);
		}
	}

	public void ex8() {
		/*
		 * 3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고, 중간 이후부터 끝까지는 1씩 감소하여
		 * 내림차순으로 값을 넣어 출력하세요. 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고 다시 정수를 받도록
		 * 하세요.
		 */

		Scanner sc = new Scanner(System.in);

		boolean flag;

		do {
			System.out.print("정수 : ");
			int input = sc.nextInt();

			int[] arr = new int[input];

			flag = false;

			int count = 0;
			if (input >= 3 && input % 2 == 1) {

				for (int row = 0; row < input; row++) {
					if (row <= input / 2) {
						count++;
						arr[row] = count;
					} else {
						count--;
						arr[row] = count;
					}
					System.out.print(arr[row] + " ");
				}

			} else {
				System.out.println("다시 입력하세요.");
				flag = true;
			}

		} while (flag);

	}

	public void ex9() {

		int[] arr = new int[10];

		for (int row = 0; row < arr.length; row++) {
			int ran = (int) (Math.random() * 10);
			arr[row] = ran;
		}
		System.out.print("발생한 난수 : ");

		for (int row = 0; row < arr.length; row++) {
			System.out.print(arr[row] + " ");
		}
	}

	public void ex10() {

		int[] arr = new int[10];

		for (int row = 0; row < arr.length; row++) {
			int ran = (int) (Math.random() * 10 + 1);
			arr[row] = ran;
		}
		System.out.print("발생한 난수 : ");

		for (int row = 0; row < arr.length; row++) {
			System.out.print(arr[row] + " ");
		}

		int max = arr[0];
		int min = arr[0];

		for (int row = 0; row < arr.length; row++) {
			if (arr[row] > max) {
				max = arr[row];
			} else if (arr[row] < min) {
				min = arr[row];
			}
		}
		System.out.println();
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

	public void ex11() {

		int[] arr = new int[10];

		for (int row = 0; row < arr.length; row++) {
			int ran = (int) (Math.random() * 10 + 1);
			arr[row] = ran;
			for (int col = 0; col < row; col++) {
				if (arr[col] == ran) {
					row--;
					break;
				}
			}
		}
		for (int row = 0; row < arr.length; row++) {
			System.out.print(arr[row] + " ");
		}
	}

	public void ex12() {

		int[] lotto = new int[6];

		for (int row = 0; row < lotto.length; row++) {
			int ran = (int) (Math.random() * 45 + 1);
			lotto[row] = ran;
			for (int col = 0; col < row; col++) {
				if (lotto[col] == ran) {
					row--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void ex13() {		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		char[] ch = new char[str.length()];
		
		int count = 0;
		System.out.print("문자열에 있는 문자 : ");
		
		for (int row = 0; row < ch.length; row++) {
			
			boolean flag = true;
			
			for (int col = 0; col < row; col++) {
				if (ch[col] == str.charAt(row)) {
					flag = false;
					break;
				} 
			}			
			if (flag) {
				count++;
				ch[row] = str.charAt(row);
				if (row < ch.length - 1) {
					System.out.print(ch[row] + ", ");					
				} else {
					System.out.print(ch[row]);
				}
			}			
		}
		System.out.println("\n문자 개수 : " + count);
	
	}
	
	public void ex14() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		char yn;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr[i] = sc.next(); 
		}
		do {
		
			
		} while(false);
		
		
	}
	
	public void ex16() {
		
		int count = 0;
		
		int[][] arr = new int[4][4];
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				count++;
				arr[row][col]= count;
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
	}

}

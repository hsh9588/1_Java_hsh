package edu.kh.array.practice;

import java.lang.reflect.Array;
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
		sc.nextLine();
		
		boolean flag = false;

		String[] arr1 = new String[size];
		String[] arrTemp = arr1;

		char yn;

		for (int i = 0; i < arr1.length; i++) {
			System.out.print((i + 1) + "번째 문자열 : ");
			arr1[i] = sc.nextLine();
		}
		do {
			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			yn = sc.next().charAt(0);
			
			if (yn == 'y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int size2 = sc.nextInt();
				sc.nextLine();
				
				String[] arr2 = new String[arr1.length+size2];				
				
				arrTemp = arr1;
				arr1 = arr2;
				
				for (int row = arrTemp.length; row < arr1.length; row++) {
					System.out.print((row + 1) + "번째 문자열 : ");
					arr1[row] = sc.nextLine();
				}
				
				
				for (int row = 0; row < arrTemp.length; row++) {
					arr1[row] = arrTemp[row];
				}
				
				
				flag= true;
			} else {
				for (int row = 0; row < arr1.length; row++) {
					if (row == 0) {
						System.out.print("[" + arr1[row] + ", ");						
					} else if (row == (arr1.length-1)) {
						System.out.print(arr1[row] + "]");						
					} else {
						System.out.print(arr1[row] + ", ");						
					}
					flag= false;
				}
			}

		} while (flag);

	}

	public void ex15() {

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				System.out.printf("(%d, %d)", row, col);
			}
			System.out.println();
		}
	}

	public void ex16() {

		int count = 0;

		int[][] arr = new int[4][4];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				count++;
				arr[row][col] = count;
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.printf("%3d", arr[row][col]);
			}
			System.out.println();
		}
	}

	public void ex17() {

		int count = 16;

		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 4; col++) {
				System.out.printf("%3d", count);
				count--;
			}
			System.out.println();
		}
	}

	public void ex18() {

	}

	public void ex19() {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		System.out.print("열 크기 : ");
		int col = sc.nextInt();

		char[][] abc = new char[row][col];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {
				int ran = (int) ((Math.random() * 25) + 65);
				abc[r][c] = (char) ran;
				System.out.print(abc[r][c] + " ");
			}
			System.out.println();
		}
	}

	public void ex20() {

		Scanner sc = new Scanner(System.in);

		System.out.print("행 크기 : ");
		int row = sc.nextInt();

		int[][] abcArr = new int[row][];

		char abc = 'a';

		for (int r1 = 0; r1 < row; r1++) {
			System.out.print(r1 + "열의 크기 : ");
			int col = sc.nextInt();
			abcArr[r1] = new int[col];
		}

		for (int r2 = 0; r2 < row; r2++) {
			for (int c = 0; c < abcArr[r2].length; c++) {
				abcArr[r2][c] = abc;
				System.out.print((char) abcArr[r2][c] + " ");
				abc++;
			}
			System.out.println();
		}
	}

	public void ex21() {

		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] share1 = new String[3][2];
		String[][] share2 = new String[3][2];

		int count = 0;

		int temp = 0;

		for (int row = 0; row < share1.length; row++) {
			for (int col = 0; col < share1[row].length; col++) {
				share1[row][col] = students[count];
				count++;
				temp = count;
			}
		}

		for (int row = 0; row < share2.length; row++) {
			for (int col = 0; col < share2[row].length; col++) {
				share2[row][col] = students[temp];
				temp++;
			}
		}

		System.out.println("** 1분단 **");
		for (int row = 0; row < share1.length; row++) {
			for (int col = 0; col < share1[row].length; col++) {
				System.out.print(share1[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("** 2분단 **");
		for (int row = 0; row < share2.length; row++) {
			for (int col = 0; col < share2[row].length; col++) {
				System.out.print(share2[row][col] + " ");
			}
			System.out.println();
		}
	}

	public void ex22() {
		
		Scanner sc = new Scanner(System.in);

		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] share1 = new String[3][2];
		String[][] share2 = new String[3][2];

		int count = 0;

		int temp = 0;

		for (int row = 0; row < share1.length; row++) {
			for (int col = 0; col < share1[row].length; col++) {
				share1[row][col] = students[count];
				count++;
				temp = count;
			}
		}

		for (int row = 0; row < share2.length; row++) {
			for (int col = 0; col < share2[row].length; col++) {
				share2[row][col] = students[temp];
				temp++;
			}
		}

		System.out.println("** 1분단 **");
		for (int row = 0; row < share1.length; row++) {
			for (int col = 0; col < share1[row].length; col++) {
				System.out.print(share1[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("** 2분단 **");
		for (int row = 0; row < share2.length; row++) {
			for (int col = 0; col < share2[row].length; col++) {
				System.out.print(share2[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("===================================");

		System.out.print("검색할 학생의 이름을 입력하세요 : ");			
		String find = sc.next();
		
		for (int row = 0; row < share1.length; row++) {
			for (int col = 0; col < share1[row].length; col++) {
				if (share1[row][col].equals(find)) {
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 ", share1[row][col], (row + 1));
					
					if (col == 0) {
						System.out.print("왼쪽에 있습니다.");
					} else {
						System.out.println("오른쪽에 있습니다.");
					}
				}
			}
		}

		for (int row = 0; row < share2.length; row++) {
			for (int col = 0; col < share2[row].length; col++) {
				if (share2[row][col].equals(find)) {
					System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 ", share2[row][col], (row + 1));
					
					if (col == 0) {
						System.out.print("왼쪽에 있습니다.");
					} else {
						System.out.println("오른쪽에 있습니다.");
					}
				}
			}
		}
	}

	public void ex23() {

		Scanner sc = new Scanner(System.in);

		String[][] bingo = new String[6][6];

		for (int row = 1; row < bingo.length; row++) {
			for (int col = 1; col < bingo[row].length; col++) {
				bingo[row][col] = "  ";
//				System.out.print(bingo[row1][col1]);
			}
//			System.out.println();
		}
		
		bingo[0][0] = " ";
		bingo[0][1] = " 0";
		bingo[0][2] = " 1";
		bingo[0][3] = " 2";
		bingo[0][4] = " 3";
		bingo[0][5] = " 4";
		bingo[1][0] = "0";
		bingo[2][0] = "1";
		bingo[3][0] = "2";
		bingo[4][0] = "3";
		bingo[5][0] = "4";

		System.out.print("행 인덱스 입력 : ");
		int rowInput = sc.nextInt();

		System.out.print("열 인덱스 입력 : ");
		int colInput = sc.nextInt();

		for (int row = 0; row < bingo.length; row++) {
			for (int col = 0; col < bingo[row].length; col++) {

				if (row == (rowInput+1) && col == (colInput+1)) {
					bingo[row][col] = " X";
				}
				System.out.print(bingo[row][col]);
			}
			System.out.println();
		}

	}

	public void ex24() {
		
		Scanner sc = new Scanner(System.in);

		String[][] bingo = new String[6][6];

		for (int row = 0; row < bingo.length; row++) {
			for (int col = 0; col < bingo[row].length; col++) {
				bingo[row][col] = "  ";
			}
		}
		
		boolean flag = true;
		
		bingo[0][0] = " ";
		bingo[0][1] = " 0";
		bingo[0][2] = " 1";
		bingo[0][3] = " 2";
		bingo[0][4] = " 3";
		bingo[0][5] = " 4";
		bingo[1][0] = "0";
		bingo[2][0] = "1";
		bingo[3][0] = "2";
		bingo[4][0] = "3";
		bingo[5][0] = "4";

		do {
			System.out.print("행 인덱스 입력 : ");
			int rowInput = sc.nextInt();

			if (rowInput == 99) {
				System.out.println("프로그램 종료");
				break;
			}
			
			System.out.print("열 인덱스 입력 : ");
			int colInput = sc.nextInt();
			

			for (int row = 0; row < bingo.length; row++) {
				for (int col = 0; col < bingo[row].length; col++) {

					if (row == (rowInput+1) && col == (colInput+1)) {
						bingo[row][col] = " X";
					}
					System.out.print(bingo[row][col]);
				}
				System.out.println();
			}

		} while (true);
	}
	
	public void bingoGame() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("빙고판 크기 지정 : ");
		int size = sc.nextInt();
		
		int[] arrTemp = new int[(size * size)];
		
		int inputCount = 0;
		
		int[][] bingo = new int[size][size];
		
		
		for (int r = 0; r < arrTemp.length; r++) {
			
			int ran = ((int)(Math.random()* (size * size)) + 1) ;
			
			arrTemp[r] = ran;			
			
			for (int c = 0; c < r; c++) {
				if (arrTemp[c] == ran) {
					r--;
					break;
				}
				
			}
				
		}
		
		for (int r = 0; r < bingo.length; r++) {
			for (int c = 0; c < bingo[r].length; c++) {
				bingo[r][c] = arrTemp[inputCount];
				inputCount++;
			}
		}
		
		for (int r = 0; r < bingo.length; r++) {
			for (int c = 0; c < bingo[r].length; c++) {
				System.out.printf("%4d", bingo[r][c]);
			}
			System.out.println();
		}
		
		System.out.println("===== 빙고게임 시작 =====");
		
		System.out.print("정수를 입력하시오 : ");
		int input = sc.nextInt();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

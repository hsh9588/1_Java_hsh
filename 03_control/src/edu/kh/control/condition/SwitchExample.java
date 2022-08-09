package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {

	/* switch문
	 *  - 식 하나의 결과로 많은 경우의 수를 처리할 때 사용하는 조건문
	 *   -> 식의 결과로 얻은 값과 같은 case 구문이 수행된다. 
	 * 
	 * [ 작성법 ]
	 * 
	 *  // switch문의 식은 결과가 true / false 가 아닌 결과값이 나와야 한다.
	 * switch(일반식) {
	 * 
	 * case 결과1 : 수행코드1; break;
	 * case 결과2 : 수행코드2; break;
	 * case 결과3 : 수행코드3; break;
	 * ...
	 * 
	 * default : 모든 case가 만족하지 않을 경우 수행하는 코드;
	 * 
	 * }
	 * 
	 */
	
	public void ex1() {
		// 키보드로 정수를 입력 받아 
		// 1 이면 "빨강색"
		// 2 이면 "주황색"
		// 3 이면 "노란색"
		// 4 이면 "초록색"
		// 1 ~ 4 가 아니면 "흰색" 을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
//		if (input == 1) {
//			result = "빨강색";
//		} else if (input == 2) {
//			result = "주황색";			
//		} else if (input == 3) {
//			result = "노란색";
//		} else if (input == 4) {
//			result = "초록색";
//		} else {
//			result = "흰색";
//		}
//		
//		System.out.println(result);
		
		// 식 == 여러 값이 나오는 경우
		
		switch (input) {
		case 1: result = "빨강색"; break;
		case 2: result = "주황색"; break;
		case 3: result = "노란색"; break;
		case 4: result = "초록색"; break;
		default: result = "흰색";		
		}
		
		System.out.println(result);
		
	}
	
	
	public void ex2() {
		
		// 정수를 입력 받아 
		// 나머지가 1이면 "백팀"
		// 나머지가 2이면 "청팀"
		// 나머지가 3이면 "홍팀"
		// 나머지가 1 ~ 3이 아니면 "깍두기"
		
		Scanner sc = new Scanner(System.in);
		
		// [실행화면]
		// 정수 입력 : 1
		// 백팀 입니다.
		
		// 정수 입력 : 5
		// 깍두기 입니다.
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String result;
		
		switch (input % 5) {
		case 1: result = "백팀"; break;
		case 2: result = "청팀";	break;
		case 3: result = "홍팀";	break;
		default: result = "깍두기";
		}
		System.out.println(result + " 입니다.");		
		
	}
	
	public void ex3() {
		
		// switch문의 식 결과가 double 형인 경우 -> 안됨!
		// switch문의 식 결과가 String인 경우
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("김밥(3000) / 라면(4000) / 샌드위치(5000) / 짬뽕(10000)");
		
		System.out.print("메뉴 입력 : ");
		
		String input = sc.next();
		
		int result;
		
		switch (input) {
		case "김밥": result = 3000; break;
		case "라면": result = 4000; break;
		case "샌드위치": result = 5000; break;
		case "짬뽕": result = 10000; break;
		default: result = -1; // 잘못 입력하면 -1 이라고 의미 부여
		}
		
		if (result == -1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.printf("%s은 %d원 입니다.\n", input, result);
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

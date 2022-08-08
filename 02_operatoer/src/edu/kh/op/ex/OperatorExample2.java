package edu.kh.op.ex;

public class OperatorExample2 {
	
	public static void main(String[] args) {
		
		// 증감 연산자 : ++, --
		// -> 피연산자를 1증가 또는 감소 시키는 연산자
		
		// 전위 연산 : ++a , --a
		// -> a 를 먼저 1 증가 / 감소 시키고 다른 연산을 수행 	
		
		// 후위 연산 : a++, a--
		// -> 다른 연산을 먼저 다 수행한 후 마지막에 a 를 1 증가 / 감소 시킴
		
		int num1 = 10;
		int num2 = 10;
		
		num1++; // 11
		num2--; // 9
		
		System.out.println("num1++ : " + num1);
		System.out.println("num2-- : " + num2);
		
		System.out.println("-------------------");
		
		// 전위 연산
		System.out.println("++num1 + 10 : " + (++num1 + 10));
						// ++num1 : 12 + 10 = 22
		System.out.println("num1 : " + num1); // 12
		
		//  후위 연산
		System.out.println("num2-- + 10 : " +(num2-- + 10));
						// 9-- + 10 = 19
		System.out.println("num2 : " + num2); // 8
		
		// 연습문제
		int a = 3;
		int b = 5;
		int c = a++ + --b;
		
		// 최종적으로 a, b, c 는 각각 얼마인가 ?
		 
		// a = 4, b = 4, c = 7
		
		System.out.println("a, b, c : " + a + ", " + b + ", " + c);
		
	}

}

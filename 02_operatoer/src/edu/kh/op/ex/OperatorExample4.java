package edu.kh.op.ex;

public class OperatorExample4 {
	
	public static void main(String[] args) {
		
		// 논리 연산자 : &&( AND ), || ( OR )
		
		// && ( AND ) 연산자 : 둘 다 true 이면 true, 나머지 false
		
		// ~와, 그리고 ( ~이고 ), ~이면서 ( ~면서 ), ~부터 ~까지, ~사이
		
		int a = 101;
		
		// a는 100 이상 이면서 짝수인가?
		
		boolean result1 = a >= 100; // a 는 100 이상 result1 = true
		
		boolean result2 = a % 2 == 0; // a 는 짝수가 아니다 result2 = false
		
		System.out.println("a는 100 이상 이면서 짝수인가? " + (result1 && result2));
		
				
		int b = 5;
		
		// b 는 1부터 10 사이의 정수인가?
		
		boolean result3 = b >= 1; // true
		
		boolean result4 = b <= 10; // true
		
		System.out.println("b 는 1부터 10 사이의 정수인가? " + (result3 && result4));
		
		// || ( OR ) 연산자 : 둘 다 false 이면 false, 나머진 true ( AND의 반대 )
		
		// 또는, ~거나, ~이거나
		
		int c = 10;
		
		// c 는 홀수 이거나 10 을 초과한 수 인가?
		
		System.out.print("c 는 홀수 이거나 10 을 초과한 수 인가? ");
		System.out.println( (c % 2 == 1) || (c > 10) );
		
		int d = 20;
		
		// d 는 1 부터 100 사이 숫자 또는 음수인가?
		
		boolean result5 = d >= 1 && d <= 100 || b < 0;
		
		System.out.println(result5);
		
		System.out.println("-----------------------------");
		
		// 논리 부정 연산자 : ! ( NOT )
		
		System.out.println("!result5 : " + !result5); // !true -> false
		
		int e = 3;
		
		boolean result6 = e >= 1 && e < 5; // e 는 1 이상 5 미만 인가 ?
		
		// boolean e < 1 || e >= 5
		
		boolean result7 = e < 1 || e >= 5;
		
		// result6 와 result7 의 서로 반대
		
		System.out.println(!result6 == result7);
		// result6의 반대가 result7과 같은가?
		
		
	}

}

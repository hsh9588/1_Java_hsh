package edu.kh.variable.ex1;

public class VariableExample1 {

	public static void main(String[] args) {
		
	System.out.println("[변수 사용x]");
	System.out.println(2* 3.141592653589793 * 10);
	System.out.println(3.141592653589793 * 10 * 10);
	System.out.println(3.141592653589793 *10 *10 *20);
	System.out.println(4 * 3.141592653589793 * 10 * 10);
	
	System.out.println("=====================================================");
	
	System.out.println("[변수 사용O]");
	
	
	double pi = 3.141592653589793 ;
	int r = 10 , h =20 ;
	r=5;
	
	System.out.println(2 * pi * r); //원의 둘레
	System.out.println(pi * r *r); // 원의 넓이
	System.out.println(pi * r * r *h); //원기둥의 부피
	System.out.println(4*pi*r*r); //구의 겉넓이
	
//변수(Variable)
// - 메모리(RAM)에 값을 기록하는 공간(박스)
// -> 공간(박스)에 기록되는 값(data)이 변할 수 있어서 변수라고 함.
	
// - 값(Data)의 형태와 크기에 따라서 변수의 형태(자료형)는 달라져야 한다!
	
//변수 사용의 장점 1. 재사용성의 증가(한번 변수를 만들어 놓으면 쉽게 계속 사용 가능)
//변수 사용의 장점 2. 가독성 향상 ( = 읽기 편하다 )
//변수 사용의 장점 3. 코드 길이 감소
//변수 사용의 장점 4. 유지보수성 향상 (= 고치기 쉽다)
	
	
	
			
	
	
	
	}
}		
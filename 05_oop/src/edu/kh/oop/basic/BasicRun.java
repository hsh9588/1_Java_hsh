package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {
		
		HSH 황석현 = new HSH();
		// heap 영역에 HSH 클래스에 정의된 내용을 이용하여
		// HSH 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : " + 황석현.name);
		System.out.println("나이 : " + 황석현.age);
		System.out.println("생년월일 : " + 황석현.birthday);
		
//		System.out.println("비밀번호 : " + 황석현.password);
		
		황석현.showPassword();
		
		// 기능 수행
		황석현.eat();
		황석현.study();
		황석현.plus(50, 100);
	}
}

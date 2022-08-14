package edu.kh.variable.ex1;

public class VariableExample2 {

	public static void main(String[] args) {
		
		//변수 선언 : 메모리에 값을 저장할 공간을 할당하는 것 (박스를 만드는 것)
		
		boolean booleanData; 
		// 논리값(true/false)를 저장할 공간 1byte를
		// 메모리에 할당하고
		//그 공간을 booleanData로 부르겠다.
		
		int iNum;
		// 정수 값을 저장할 공간(4byte)을 메모리에 할당하고
		// 그 공간을 iNum이라고 부르겠다.
		
		long longNum;
		
		// 정수 값을 저장할 공간(8byte)을 메모리에 할당하고
		// 그 공간을 longNum이라고 부르겠다.
		
		// byte와 short는 쓸 일 없다
		
		byte bNum;
		bNum = 1;
		// bNum = 128; 이건 범위 넘어서서 안됨
		// byte 와 short는 거의 사용되지 않는 자료형임. 
		// 사용을 안 하니까 지원이 적음...(별도의 리터럴 표기법이 없어서 int표기법을 사용한다)
		
		short sNum;
		sNum = 1000;
		
		
		float fNum; // 실수형 변수 4byte 할당
		
		double dNum; // 실수형 변수 8byte 할당
		
		fNum =3.14f;
		// float의 리터럴 표기법은 F 또는 f를 추가
		
		dNum = 1.23;
		// double의 리터럴 표기법은 기본 실수 표기법
		
		char ch1; //문자형 변수 2byte 할당.
		char ch2;
		
		ch1 = 'A';
		// char의 리터럴 표기법은 ''(홑따옴표)
		
		ch2 = 66; //66은 대문자 B를 뜻함
		// char 자료형은 숫자-문자 연결되어있는 문자표에서 일치하는 문자나 
		// 숫자의 문자부분만 출력을 한다.
		
		// 값 대입 : 선언된 변수에 값(리터럴)을 대입하는 것
		
		
		booleanData = false;
		
		//booleanData 자료형 변수는 true / false 만 저장할 수 있다.
		//boolean의 리터럴 표기법은 true / false
		
		iNum = 10000000;
		
		//iNum = 10000000000;
		//The literal 10000000000 of type int is out of range 	
		// -> int의 리터럴 표기법은 기본적인 정수 표기법
		
		longNum = 10000000000l;
		//10000000000은 int표기법이므로 int의 최대 크기를 넘어설 수 없다.
		// ->long자료형의 리터럴 표기법은 정수 뒤에 대문자 L 또는 소문자 l을 작성하는 것.
		
	//syso + ctrl + space 
		System.out.println(booleanData);
		System.out.println(iNum);
		System.out.println(longNum);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch1);
		System.out.println(ch2);
		
		//출력 시 l이나 f같은 리터럴 표기법은 생략된다.
		
		}
	
}

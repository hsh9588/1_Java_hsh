package edu.kh.test.model.vo;

public class Student {
	
	// field
	private int grade;
	private int classRoom;
	private int number;
	private String name;
	
	private int kor;
	private int eng;
	private int math;
	
	// 기본 생성자
	public Student () {}
	
	// 매개변수 생성자 ( 오버로딩 적용 )
	public Student (int grade, int classRoom, int number, String name) {
		
		// this 참조변수
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
		
	}
	
	// 매개변수 생성자 ( 오버로딩 적용 )
	public Student (int grade, int classRoom, int number, String name,
			int kor, int eng, int math) {
		
		// this() 생성자
		this(grade, classRoom, number, name);
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// getter / setter ( alt + shift + s -> r )
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}

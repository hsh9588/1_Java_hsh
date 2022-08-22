package edu.kh.inheritance.model.vo;

public class Student extends Person {
	
	// 자식 Student 클레스에
	// 부모 Person 클래스의 멤버( 필드, 메서드) 를 상속
	
	// extends : 확장하다.
	// -> 자식이 자기의 멤버 + 부모의 멤버를 가지게 되어
	//	  몸집이 커짐( 확장됨 )
	
//	private String name;
//	private int age;
	
	private int graed;
	private int classRoom;
	
	public Student() {}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getGraed() {
		return graed;
	}

	public void setGraed(int graed) {
		this.graed = graed;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	

}

package edu.kh.test.model;

import edu.kh.test.model.vo.Student;

// model : 비지니스 로직
// service : 기능 제공용 클래스
public class StudentManagementService {

	// Studnet 참조변수
	private Student[] stdArr = new Student[5];
	
	// 기본 생성자
	public StudentManagementService() {
		stdArr[0] = new Student(3, 5, 17, "홍일동", 100, 30, 70);
		stdArr[1] = new Student(2, 3, 22, "홍이동", 30, 40, 60);
		stdArr[2] = new Student(1, 13, 31, "홍삼동", 70, 30, 50);
		stdArr[3] = new Student(4, 7, 8, "홍사동", 50, 30, 70);
	}
}

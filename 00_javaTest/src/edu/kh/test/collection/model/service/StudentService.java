package edu.kh.test.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.test.collection.model.vo.Student;

public class StudentService {

	private List<Student> stdList = new ArrayList<>();
	
	public StudentService() {
		stdList.add(new Student("홍길동", 18, "서울시 강남구", 'M', 80));
		stdList.add(new Student("김길순", 17, "서울시 중구", 'F', 90));
		stdList.add(new Student("가나다", 19, "경기도 부천시", 'F', 100));	
	}
	
	public boolean addStudent (String name, int age, String address, char gender, int score) {
		
	Student std = new Student(name, age, address, gender, score);
	
	return stdList.add(std);
		
	}
}

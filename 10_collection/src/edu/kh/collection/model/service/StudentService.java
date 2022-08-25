package edu.kh.collection.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.collection.model.vo.Student;

public class StudentService {

	// 부모 타입 참조 변수 List
	private List<Student> stdList = new ArrayList<Student>();
	//								-> Student 타입으로 제한된 ArrayList객체 생성
		
	public StudentService() {
		stdList.add(new Student("홍일동", 1, "일구", 'm', 3));
		stdList.add(new Student("홍이동", 2, "이구", 'f', 4));
		stdList.add(new Student("홍삼동", 3, "삼구", 'm', 5));
		stdList.add(new Student("홍사동", 4, "사구", 'f', 6));
		stdList.add(new Student("홍오동", 5, "오구", 'm', 7));
		
	}

	/** stdList에 학생 정보 추가 메서드
	 * @param name
	 * @param age
	 * @param address
	 * @param gender
	 * @param score
	 * @return
	 * @true  : 학생 정보 추가 성공
	 * @false : 학생 정보 추가 실패
	 */
	public boolean addStudent(String name, int age, String address, char gender, int score) {
		
		// 제네릭 확인 테스트
//		List test1 = new ArrayList();
//		List<String> test2 = new ArrayList<String>();
//		List<Integer> test3 = new ArrayList<Integer>();
		
		// List.add(E e) -> 제네릭<E>에 작성되는 타입으로 모든 E가 변화함 
//		test1.add(Object e); -> 타입 제한 x, 모든 참조 변수가 Object 타입
//		test2.add(String e); -> 타입 제한 o, 모든 참조 변수가 String 타입 
//		test3.add(Integer e); -> 타입 제한 o, 모든 참조 변수가 Integer 타입
		
		Student std = new Student(name, age, address, gender, score);
		
		// boolean add(Student e) : add() 결과로 boolean 반환
		return stdList.add(std);
	}
	
	/** 학생 전체 조회 시 stdList 반환 메서드
	 * @return stdList
	 */
	public List<Student> getStdList() {
		return stdList;
		
	}

	/** 학생 정보 수정 메서드
	 * @param idx
	 * @param address
	 * @param score
	 * @return
	 * @true : 인덱스가 일치하는 학생 정보 수정 성공
	 * @flase : 인덱스가 일치하는 학생이 없을 경우 
	 */
	public boolean updateStudent(int idx, String address, int score) {
		
		// 입력 받은 idx가 stdList에 실제 존재하는 요소의 인덱스 범위를 넘어선 경우		
		if (idx >= stdList.size() || idx < 0) {
			return false;			
		} else {
			stdList.get(idx).setAddress(address);
			stdList.get(idx).setScore(score);
			return true;
		}
	}

	/** 학생 정보 제거
	 * @param idx
	 */
	public Student removeStudent(int idx) {
		
		// 일치하는 인덱스가 있으면
		// 해당 학생 정보를 stdList에서 제거하고
		// 제거된 학생 정보를 반환
		
		// 일치하는 인덱스가 없다면 null 반환
		
		if (idx < 0 || idx >= stdList.size()) {
			return null;
		} else {
			// 리스트에서 제거된 요소를 반환
			return stdList.remove(idx);
		}
	}
	
}

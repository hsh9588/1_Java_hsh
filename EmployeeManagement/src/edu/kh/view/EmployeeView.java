package edu.kh.view;

import java.util.List;
import java.util.Scanner;

import edu.kh.model.service.EmployeeService;
import edu.kh.model.vo.Employee;

public class EmployeeView {

	private Scanner sc = new Scanner(System.in);
	private EmployeeService service = new EmployeeService();

	public void displayMenu() {

		int input = 0;
		
		do {
			
			System.out.println("------------ [사원 관리 프로그램] ------------");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("-----------------------------------------");			
			
			System.out.print("메뉴 선택 >> ");
			input = sc.nextInt();
			sc.nextLine();
			
			System.out.println();
			
			switch(input) {
			case 1: addEmployee(); break;
			case 2: selectAll(); break;
			case 3: selectEmpid(); break;
			case 4: updateEmployee(); break;
			case 5: removeEmployee(); break;
			case 6: selectDptTitle(); break;
			case 7: selectSalary(); break;
			case 8: departSum(); break;
			case 0: System.out.println("프로그램 종료"); break;
			default: System.out.println("잘못 입력 하셨습니다.");
			}
			
			System.out.println();
			
		} while(input != 0);
		
	}
	
	/**
	 * 새로운 사원 정보 추가
	 */
	public void addEmployee() {
		System.out.println("[사원 추가]");
		
		System.out.print("번호 : ");
		int empId = sc.nextInt();
		
		System.out.print("이름 : ");
		String empName = sc.next();
		
		System.out.print("주민번호 : ");
		String empNo = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();
		
		System.out.print("전화번호 : ");
		String phone = sc.next();
		
		
		if (service.addEmployee(empId, empName, empNo, email, phone)) {
			
			System.out.println("[추가 완료]");
		} else {
			System.out.println("[error] 학생 정보 추가 실패");
		}
	}
	
	/**
	 * 전체 사원 정보 조회
	 */
	public void selectAll() {
		
		List<Employee> empList = service.getEmpList();

		for (Employee e : empList) {
			System.out.println(e);
		}
	}
	
	/**
	 * 사번이 일치하는 사원 정보 조회
	 */
	public void selectEmpid() {
		System.out.println("[사번이 일치하는 사원 정보 조회]");
		
		System.out.print("사원 번호 : ");
		int id = sc.nextInt();
		
		List<Employee> resultList = service.selectEmpid(id);
		
		if (resultList.isEmpty()) {
			System.out.println("일치하는 사원 번호가 없습니다.");
		} else {
			for (Employee e : resultList) {
				System.out.println(e);
			}
		}
	}
	
	/**
	 * 사번이 일치하는 사원 정보 수정
	 */
	public void updateEmployee() {
		System.out.println("[사번이 일치하는 사원 정보 수정]");
		
		System.out.print("사원 번호 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		System.out.print("수정할 부서명 : ");
		String departmentTitle = sc.next();
		
		System.out.print("수정할 직급명 : ");
		String jobName = sc.next();
		
		System.out.print("수정할 급여 : ");
		int salary = sc.nextInt();
		
		if (service.updateEmployee(empId, departmentTitle, jobName, salary)) {
			System.out.println("수정 완료");
		} else {
			System.out.println("실패 ~! 해당 사원 번호와 일치하는 사원이 없습니다");
		}
	}
	
	/**
	 * 사번이 일치하는 사원 정보 삭제
	 */
	public void removeEmployee() {
		System.out.println("[사번이 일치하는 사원 정보 삭제]");
		
		System.out.print("사원 번호 : ");
		int empId = sc.nextInt();
		sc.nextLine();
		
		if (service.removeEmployee(empId)) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("실패 ~! 해당 사원 번호와 일치하는 사원이 없습니다");
		}
	}
	
	/** 입력 받은 부서와 일치 모든 사원 정보 조회
	 * 
	 */
	public void selectDptTitle() {
		System.out.println("[입력 받은 부서와 일치 모든 사원 정보 조회]");
		
		System.out.print("부서 명 : ");
		String dptName = sc.next();
		
		List<Employee> resultList = service.selectDptTitle(dptName);
		
		if (resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Employee e : resultList) {
				System.out.println(e);
			}
		}
	}
	
	/** 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 * 
	 */
	public void selectSalary() {
		System.out.println("[입력 받은 급여 이상을 받는 모든 사원 정보 조회]");
		
		System.out.print("급여 : ");
		int salary = sc.nextInt();
		
		List<Employee> resultList = service.selectSalary(salary);
		
		if (resultList.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (Employee e : resultList) {
				System.out.println(e);
			}
		}
		
	}
	
	//부서별 급여 합 전체 조회
	
	public void departSum() {
		System.out.println("[부서별 급여 합 전체 조회]");
		
		System.out.print("부서 : ");
		String departName = sc.next();
		
		int resultList = service.departSum(departName);
		
		if (resultList < 0) {
			System.out.println("잘못 입력 하셨습니다.");
		} else {
				System.out.println(departName +"부서 총 지급액 : " + resultList + "원 입니다.");
			
		}
				
	}
	

}

package edu.kh.model.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.kh.model.vo.Employee;

public class EmployeeService {

	private List<Employee> empList = new ArrayList<>();

	public EmployeeService() {
		empList.add(new Employee(1, "선동일", "621231-1985634", "sun_di@or.kr", "010-9954-6325", "D9", "J1", 8000000));
		empList.add(new Employee(2, "송종기", "631112-1548654", "song_jk@or.kr", "010-4568-6656", "D9", "J1", 6000000));
		empList.add(new Employee(3, "노흉철", "861015-1356452", "no_hc@or.kr", "010-6665-6263", "D6", "J2", 3700000));
		empList.add(new Employee(4, "송곤희", "631010-2653546", "song_eh@or.kr", "010-77607879", "D6", "J2", 2800000));
	}

	/**
	 * empList에 사원 정보 추가 메서드
	 * 
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @return
	 */
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone) {

		for (Employee e : empList) {

			if (e.getEmpld() == empId) {
				return false;
			}
		}
		Employee emp = new Employee(empId, empName, empNo, email, phone);

		return empList.add(emp);

	}

	/**
	 * 사원 전체 조회 시 empList 반환 메서드
	 * 
	 * @return
	 */
	public List<Employee> getEmpList() {
		return empList;
	}

	/**
	 * 사원 번호로 일치하는 사원 조회하기
	 * 
	 * @param empId
	 * @return resultList
	 */
	public List<Employee> selectEmpid(int empId) {

		List<Employee> resultList = new ArrayList<>();

		for (Employee e : empList) {
			if (e.getEmpld() == empId) {
				resultList.add(e);
			}
		}

		return resultList;
	}

	/**
	 * 사번이 일치하는 사원 정보 수정
	 * 
	 * @param empId
	 * @param departmentTitle
	 * @param jobName
	 * @param salary
	 * @return result
	 */
	public boolean updateEmployee(int empId, String departmentTitle, String jobName, int salary) {

		int count = 0;
		boolean result = false;
		for (Employee e : empList) {
			if (empId == e.getEmpld()) {
				empList.get(count).setDepartmentTitle(departmentTitle);
				empList.get(count).setJobName(jobName);
				empList.get(count).setSalary(salary);
				result = true;
			}
			count++;
		}
		return result;
	}

	/**
	 * 사번이 일치하는 사원 정보 제거
	 * 
	 * @param empId
	 * @return result
	 */
	public boolean removeEmployee(int empId) {

		int count = 0;
		boolean result = false;
		for (Employee e : empList) {
			if (empId == e.getEmpld()) {
				empList.remove(count);
				result = true;
				break;
			}
			count++;
		}
		return result;
	}

	/** 입력 받은 부서와 일치 모든 사원 정보 조회
	 * @param dptName
	 * @return resultList
	 */
	public List<Employee> selectDptTitle(String dptName) {

		List<Employee> resultList = new ArrayList<>();

		for (Employee e : empList) {
			if (e.getDepartmentTitle().equals(dptName)) {
				resultList.add(e);
			}
		}
		return resultList;
	}

	/** 입력 받은 급여 이상을 받는 모든 사원 정보 조회
	 * @param salary
	 * @return resultList
	 */
	public List<Employee> selectSalary(int salary) {

		List<Employee> resultList = new ArrayList<>();

		for (Employee e : empList) {
			if (e.getSalary() >= salary) {
				resultList.add(e);
			}
		}
		return resultList;
	}

	/** 부서별 급여 합 전체 조회
	 * @param departName
	 * @return sum
	 */
	public int departSum(String departName) {

		List<Employee> resultList = new ArrayList<>();

		int sum = 0;
		for (Employee e : empList) {
			if (e.getDepartmentTitle().equals(departName)) {
				sum += e.getSalary();
			}
		}
		return sum;
	}
}

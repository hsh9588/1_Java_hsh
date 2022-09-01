package edu.kh.model.service;

import java.util.ArrayList;
import java.util.List;

import edu.kh.model.vo.Employee;

public class EmployeeService {
	
	private List<Employee> empList = new ArrayList<>();
	
	public EmployeeService() {
//		empList.add(new Employee(0, "Test", "123456-1234567", "test@test.com", "010-1111-1111"));
	}
	
	/** empList에 사원 정보 추가 메서드
	 * @param empId
	 * @param empName
	 * @param empNo
	 * @param email
	 * @param phone
	 * @return
	 * @true  : 사원 정보 추가 성공
	 * @false : 사원 정보 추가 실패 
	 */
	public boolean addEmployee(int empId, String empName, String empNo, String email, String phone) {
		
		Employee emp = new Employee(empId, empName, empNo, email, phone);
		
		return empList.add(emp);
	}
	
	/** 사원 전체 조회 시 empList 반환 메서드 
	 * @return
	 */
	public List<Employee> getEmpList(){
		return empList;
	}
	
	/** 사원 번호로 일치하는 사원 조회하기
	 * @param empId
	 * @return resultList
	 */
	public List<Employee> selectEmpid(int empId){
		
		List<Employee> resultList = new ArrayList<>();
		
		for (Employee e : empList) {
			if (e.getEmpld() == empId) {
				resultList.add(e);
			}
		}
		
		return resultList; 
	}
	
	/** 사번이 일치하는 사원 정보 수정
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
				result =  true;
			}
			count++;
		}
			return result;
	}
	
	/** 사번이 일치하는 사원 정보 제거
	 * @param empId
	 * @return result
	 */
	public boolean removeEmployee(int empId) {
		
		int count = 0;
		boolean result = false;
		for (Employee e : empList) {
			if (empId == e.getEmpld()) {
				empList.remove(count);
				result =  true;
				break;
			}
			count++;
		}
			return result;
	}
	
	/**
	 * @param dptName
	 * @return resultList
	 */
	public List<Employee> selectDptTitle(String dptName){
		
		List<Employee> resultList = new ArrayList<>();
		
		for (Employee e : empList) {
			if (e.getDepartmentTitle().equals(dptName)) {
				resultList.add(e);
			}
		}
		return resultList;
	}
	
	/**
	 * @param salary
	 * @return resultList
	 */
	public List<Employee> selectSalary(int salary){
		
		List<Employee> resultList = new ArrayList<>();
		
		for (Employee e : empList) {
			if (e.getSalary() >= salary) {
				resultList.add(e);
			}
		}
		return resultList;
	}

}

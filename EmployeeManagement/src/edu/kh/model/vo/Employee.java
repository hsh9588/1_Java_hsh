package edu.kh.model.vo;

public class Employee {

	private int empId; // 사원 번호
	private String empName; // 사원 이름
	private String empNo; // 주민등록번호
	private String email; // 이메일
	private String phone; // 전화번호
	private String departmentTitle; // 부서명
	private String jobName; // 직급명
	private int salary; // 급여
	
	public Employee() {}
	
	public Employee (int empId, String empName, String empNo, String email, String phone) {
		
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.email = email;
		this.phone = phone;
	}
	
	public Employee (int empId, String empName, String empNo, String email, String phone, String departmentTitle, String jobName, int salary) {
		
		this(empId, empName, empNo, email, phone);
		
		this.departmentTitle = departmentTitle;
		this.jobName = jobName;
		this.salary = salary;
	}

	public int getEmpld() {
		return empId;
	}

	public void setEmpld(int empld) {
		this.empId = empld;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartmentTitle() {
		return departmentTitle;
	}

	public void setDepartmentTitle(String departmentTitle) {
		this.departmentTitle = departmentTitle;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "사원 정보 [ " + empName + ", " + empNo + ", " + email + ", " + phone + " ]\n[사원 번호 : " + empId + 
				", 부서명 : " + departmentTitle + ", 직급명 : " + jobName + ", 급여 : " + salary;
	}
	
	
}

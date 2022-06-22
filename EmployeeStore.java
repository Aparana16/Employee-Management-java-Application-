package com.employee;


import java.util.List;

public interface EmployeeStore {
	//public List<Employee> employelist = new ArrayList<Employee>();
	public int addEmployee(Employee employee) ;
	public void deleteEmployee(int id);
	public	List<Employee> getsearchEmployee(String employeeName);
	public List<Employee> getEmployeeList();
	public Employee getEmployeeById(int employeeId);
	public Employee getEmployeeByContact_Number(long contact_numberForSearch);
	public List<Employee> getsearchEmployeeCity(String employeeCity);
	public void deleteEmployeeContact_Number(long contact_numberForSearch);
	public List<Employee> getEmployeListBySalary();
	public Employee findEmployeeMinimumSalary();
	
	

}

package com.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmployeFileStore implements EmployeeStore {
	private static List<Employee> employelist = new ArrayList<Employee>();
	

	// private static EmployeeStore employeeStore = new EmployeFileStore();
	public int addEmployee(Employee employee) {
		/*
		 * OutputStream ops = null; ObjectOutputStream objOps = null; try { ops = new
		 * FileOutputStream("E://MyFile//MyEmpFile.txt"); objOps = new
		 * ObjectOutputStream(ops); objOps.writeObject(employee); objOps.flush(); }
		 * catch (Exception ex) {
		 * 
		 * }
		 */
		//boolean flag = false;
		/*
		 * for (Employee emp : employelist) { if (emp.getId()==employee.getId()) { throw
		 * new InvalidInputMisMatchException1("Employee Id already exist"); //flag=true;
		 * //break; } }
		 */
		/*if (flag) {
			throw new InvalidInputMisMatchException1("Employee Id already exist");
			
		}*/
		
		/*if(getEmployeeById(employee.getId()) != null) {
			throw new InvalidInputMisMatchException1("Employee Id already exist");
		}*/
		employelist.add(employee);
		return 0;

	}

	public void deleteEmployee(int id) {
		for (int i = (employelist.size() - 1); i >= 0; i--) {
			Employee employee = employelist.get(i);
			if (id == employee.getId()) {
				employelist.remove(i);
			}
		}

	}

	public List<Employee> getsearchEmployee(String employeeName) {
		List<Employee> searchList = new ArrayList<Employee>();

		for (Employee e : employelist) {
			if (employeeName.equals(e.getName())) {
				searchList.add(e);
			}
		}

		return searchList;
	}

	public List<Employee> getEmployeeList() {
		/*
		 * InputStream fileIs = null; ObjectInputStream objIs = null; try { fileIs = new
		 * FileInputStream("E://MyFile//MyEmpFile.txt"); objIs = new
		 * ObjectInputStream(fileIs); Employee emp = (Employee) objIs.readObject();
		 * 
		 * } catch (Exception e) {
		 * 
		 * }
		 */

		return employelist;

	}

	public Employee getEmployeeById(int employeeId) {

		for (Employee employee : employelist) {
			if (employeeId == employee.getId()) {
				return employee;
			}
		}
		return null;
	}

	public Employee getEmployeeByContact_Number(long contact_numberForSearch) {

		for (Employee employee : employelist) {
			if (contact_numberForSearch == employee.getContact_no()) {
				return employee;
			}
		}
		return null;
	}

	// search employee detail by city
	public List<Employee> getsearchEmployeeCity(String employeeCity) {
		List<Employee> empList = new ArrayList<Employee>();
		for (int i = 0; i < employelist.size(); i++) {

			Employee employee = employelist.get(i);

			if (employeeCity.equals(employee.getCity())) {
				empList.add(employee);
			}
		}
		return empList;
	}
// delete employee detail by contact number

	public void deleteEmployeeContact_Number(long contact_numberForSearch) {
		for (int i = (employelist.size() - 1); i >= 0; i--) {
			Employee employee = employelist.get(i);
			if (contact_numberForSearch == employee.getContact_no()) {
				employelist.remove(i);
			}
		}
	}

	@Override
	public Employee findEmployeeMinimumSalary() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeListBySalary() {
		// TODO Auto-generated method stub
		return null;
	}



	
	

}

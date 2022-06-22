package com.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeMapStore implements EmployeeStore {
	private static Map<Integer, Employee> employeemap = new HashMap<Integer, Employee>();
	private static int curId=0;
	public int addEmployee(Employee employee) {
		int id=getNextId();
		employee.setId(id);
		/*Set<Integer> keys = employeemap.keySet();
		for (Integer key : keys) {
			Employee emp = employeemap.get(key);
			if (emp.getId() == employee.getId()) {
				throw new InvalidInputMisMatchException1();
			}
		}*/
		employeemap.put(employee.getId(), employee);
		return id;
	}

	private int getNextId() {
		curId= curId+1;
		return curId;
	}

	public List<Employee> getEmployeeList() {
		List<Employee> emplyeelist = new ArrayList<Employee>();
		Set<Entry<Integer, Employee>> entries = employeemap.entrySet();
		for (Entry<Integer, Employee> entry : entries) {
			Employee emp1 = entry.getValue();
			emplyeelist.add(emp1);

		}
		return emplyeelist;
	}

	public Employee getEmployeeById(int employeeId) {
		Set<Integer> keys = employeemap.keySet();
		for (Integer key : keys) {
			Employee emp = employeemap.get(key);
			if (employeeId == emp.getId()) {
				return emp;
			}
		}
		return null;
	}

	public void deleteEmployee(int id) {
		employeemap.remove(id);

	}

	public Employee getEmployeeByContact_Number(long contact_numberForSearch) {
		Set<Integer> keys = employeemap.keySet();
		for (Integer key : keys) {
			Employee emp = employeemap.get(key);
			if (contact_numberForSearch == emp.getContact_no()) {
				return emp;
			}
		}
		return null;

	}

	public List<Employee> getsearchEmployeeCity(String employeeCity) {
		List<Employee> searchlist = new ArrayList<Employee>();
		Set<Integer> keys = employeemap.keySet();
		for (Integer key : keys) {
			Employee emp = employeemap.get(key);
			if (employeeCity.equals(emp.getCity())) {
				searchlist.add(emp);
			}
		}
		return searchlist;
	}

	public List<Employee> getsearchEmployee(String employeeName) {
		List<Employee> searchlist = new ArrayList<Employee>();
		Set<Integer> keys = employeemap.keySet();
		for (Integer key : keys) {
			Employee emp = employeemap.get(key);
			if (employeeName.equals(emp.getName())) {
				searchlist.add(emp);
			}
		}
		return searchlist;
	}

	public void deleteEmployeeContact_Number(long contact_numberForSearch) {
		Set<Integer> keys = employeemap.keySet();
		for (Integer key : keys) {
			Employee emp3 = employeemap.get(key);
			if (contact_numberForSearch == emp3.getContact_no()) {
				employeemap.remove(key);
			}
		}

	}

	public Employee findEmployeeMinimumSalary() {
		for (Integer key : employeemap.keySet()) {
			Employee employee = employeemap.get(key);
			Set<Integer> keys = employeemap.keySet();
			for (Integer key1 : keys) {
				Employee tmp = employeemap.get(key1);
				if (tmp.getSalary() < employee.getSalary()) {
					employee = tmp;
					return employee;
				}
			}
		}
		return null;

	}

	@Override
	public List<Employee> getEmployeListBySalary() {
		List<Employee> orderList = new ArrayList<Employee>();
		for (Integer key : employeemap.keySet()) {
			Employee employee = employeemap.get(key);
			Set<Integer> keys = employeemap.keySet();
			for (Integer key1 : keys) {
				Employee tmp = employeemap.get(key1);
				if (employee.getSalary() > tmp.getSalary()) {
					orderList.add(tmp);
					/*Employee temp = employee;
					employeemap.replace(key, tmp); 
					employeemap.replace(key1, temp);*/
					
				}
			}
		}
		return orderList;
	}
}

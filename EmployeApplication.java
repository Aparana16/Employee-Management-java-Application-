package com.employee;

import java.util.Iterator;
//import java.io.IOException;
import java.util.List;

import java.util.Scanner;

public class EmployeApplication {

	public static void main(String args[]) {
		// EmployeeStore employeeMap = new EmployeMapStore();
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n------------------------------------------------------");
			System.out.println("----------Please choose one of below Options----------");
			System.out.println("1. for add employee details ");
			System.out.println("2. for delete employee details by id");
			System.out.println("3. for search employee details by Id");
			System.out.println("4. for search employee details by Name");
			System.out.println("5. for Display details of employees");
			System.out.println("6. for search employee details by Contact-Number");
			System.out.println("7. for Delete employee detail by Contact-Number");
			System.out.println("8. for search employee details by City");
			System.out.println("9. Press 9 for EmployeeMinimum salary");
			System.out.println("10. Press 0 for exit Application");
			System.out.println("11. Press 11 for Orderof salary");

			int ch = scanner.nextInt();
			switch (ch) {

			case 1:
				add();
				break;
			case 2:
				delete();
				break;
			case 3:
				searchbyId();
				break;
			case 4:
				searchbyName();
				break;
			case 5:
				display();
				break;
			case 6:
				searchbyContactNumber();
				break;
			case 7:
				deletebyContactNumber();
				break;
			case 8:
				searchbyCity();
				break;
			case 9:
				findSmallestEmployeeSalary();
				break;

			case 10:
				System.exit(0);
				break;
			case 11:
				orderBySalary();
			}
		} while (true);
	}

	private static void add() {
		EmployeeStore employeeMap = new EmployeInMemoryStore();
		//EmployeeStore employeeMap = new EmployeMapStore();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the following details to ADD list:\n");		
		System.out.println("Enter Employee Name :");
		String name = scanner.next();
		System.out.println("Enter Employee Salary :");
		double salary = scanner.nextDouble();
		System.out.println("Enter Employee Contact No :");
		long contact_no = scanner.nextLong();
		System.out.println("Enter Employee City :");
		String city = scanner.next();
		Employee employee = new Employee( name, salary, contact_no, city);
		
		int	id=employeeMap.addEmployee(employee);
		
		System.out.println("Employee added with id " + id);

	}

	private static void delete() {
		EmployeeStore employeeStore = new EmployeMapStore();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID to DELETE  :");
		int id = scanner.nextInt();
		employeeStore.deleteEmployee(id);
		System.out.print("Employee details is deleted " + id);
	}

	private static void searchbyId() {
		EmployeeStore employeeStore = new EmployeMapStore();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Employee ID to SEARCH  \n:");
		int idForSearch = scanner.nextInt();
		Employee emp1 = employeeStore.getEmployeeById(idForSearch);
		display(emp1);

	}

	private static void searchbyName() {
		EmployeeStore employeeStore = new EmployeMapStore();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Employee name to SEARCH  \n:");
		String nameForSearch = scanner.next();
		List<Employee> searchResultList = employeeStore.getsearchEmployee(nameForSearch);
		for (int i = 0; i < searchResultList.size(); i++) {
			Employee empObj = searchResultList.get(i);
			System.out.println(empObj);
		}
	}

	private static void display() {
		EmployeeStore employeeStore = new EmployeInMemoryStore();
		// Scanner scanner = new Scanner(System.in);
		List<Employee> empList = employeeStore.getEmployeeList();
		for (int i = 0; i < empList.size(); i++) {
			Employee empObj = empList.get(i);
			display(empObj);
		}
	}

	private static void searchbyContactNumber() {
		EmployeeStore employeeStore = new EmployeMapStore();
		System.out.println("\nEnter Employee Contact-Number to SEARCH  \n:");
		@SuppressWarnings("resource")
		long contact_numberForSearch = new Scanner(System.in).nextLong();
		Employee emp1 = employeeStore.getEmployeeByContact_Number(contact_numberForSearch);
		display(emp1);

	}

	private static void deletebyContactNumber() {
		EmployeeStore employeeStore = new EmployeMapStore();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee Contact-Number to DELETE  :");
		long contact_numberForSearch = scanner.nextLong();
		employeeStore.deleteEmployeeContact_Number(contact_numberForSearch);
		System.out.print("Employee details is deleted " + contact_numberForSearch);
	}

	private static void searchbyCity() {
		EmployeeStore employeeStore = new EmployeMapStore();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter Employee city to SEARCH  \n:");
		String cityForSearch = scanner.next();
		List<Employee> searchResultList = employeeStore.getsearchEmployeeCity(cityForSearch);
		for (int i = 0; i < searchResultList.size(); i++) {
			Employee empObj = searchResultList.get(i);
			display(empObj);
		}
	}
	
	private static void findSmallestEmployeeSalary() {
		EmployeeStore employeeStore = new EmployeMapStore();		
		Employee employeemin =employeeStore.findEmployeeMinimumSalary();		
		display(employeemin);			
		
	}
	private static void orderBySalary() {
	//EmployeeStore employeeStore = new EmployeMapStore();
	EmployeeStore employeeStore = new EmployeInMemoryStore();
	List<Employee> emList = employeeStore.getEmployeListBySalary();	
	for(int i=0;i<emList.size();i++) {
		Employee emobj = emList.get(i);
		display(emobj);
	}
	}

	private static void display(Employee employee) {
		if (employee != null) {
			System.out.println("~~~~~~~~~*********~~~~~~~~~~~~~~~$$$$$$$$~~~~ :)");
			System.out.println("Employee Id :  " + employee.getId());
			System.out.println("Employee Name :  " + employee.getName());
			System.out.println("Employee City :  " + employee.getCity());
			System.out.println("Employee Salary  " + employee.getSalary());
			System.out.println("Employee MobileNumber :  " + employee.getContact_no());
			System.out.println("***********************************************");
		} else {
			System.out.println("No data in EmployeeList");
		}
	}
	
	
	

}













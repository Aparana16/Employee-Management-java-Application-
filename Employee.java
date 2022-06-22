package com.employee;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id;
	public String name;
	public double salary;
    public long contact_no;
	public String city;
	
	public Employee( String name, double salary, long contact_no, String city)
	{
		//this.id = id;
		this.name = name;
		this.salary = salary;
		this.contact_no = contact_no;
		this.city = city;
	}
	
	public Employee() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double  getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	

	/*public String toString()
	{
		return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " + 
				this.salary + "\nContact No: " + this.contact_no + "\nCity: " + this.city;
	}*/

	
}
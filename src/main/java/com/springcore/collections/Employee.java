package com.springcore.collections;

import java.util.*;
public class Employee {
	private String EmpName;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empName, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		EmpName = empName;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
}

package com.springcore.constructorI;

public class Employee {
	private int id;
	private String name;
	private Certi certi;
	
	public Employee() {
		super();
		System.out.println("Default Constructors");
	}


	public Employee(int id) {
		super();
		this.id = id;
	}


	public Employee(String name) {
		super();
		this.name = name;
	}

	

	public Employee(int id, String name, Certi certi) {
		super();
		this.id = id;
		this.name = name;
		this.certi = certi;
	}


	@Override
	public String toString() {
		return this.name+" "+this.id+" "+this.certi.name;
	}
	
	
	
	
}

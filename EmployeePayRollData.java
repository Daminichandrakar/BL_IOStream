package com.employeepayroll;

public class EmployeePayRollData {

	public int id;
	public String name;
	public String salary;

	public EmployeePayRollData(int id, String name, String salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayRollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

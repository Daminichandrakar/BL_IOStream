package com.employeepayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeePayRollService {

	public static ArrayList<EmployeePayRollData> employeePayRollDatas;

	public static void main(String[] args) {
		 employeePayRollDatas = new ArrayList<EmployeePayRollData>();
		Scanner scanner = new Scanner(System.in);
          EmployeePayRollService employeePayRollService = new EmployeePayRollService();
          employeePayRollService.readEmployeePayRollData(scanner);
          employeePayRollService.writeEmployeePayRolldata();
	}

	private void readEmployeePayRollData(Scanner scanner) {
		System.out.println("Enter employee id:-");
		int id = scanner.nextInt();
		System.out.println("Enter employee name");
		String name = scanner.next();
		System.out.println("Enter Employee salary");
		String salary = scanner.next();

		employeePayRollDatas.add(new EmployeePayRollData(id, name, salary));

	}

	private void writeEmployeePayRolldata() {
		System.out.println("write employee payroll data" + employeePayRollDatas.toString());
	}

}

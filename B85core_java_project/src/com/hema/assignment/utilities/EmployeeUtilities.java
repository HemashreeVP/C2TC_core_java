package com.hema.assignment.utilities;
import com.hema.assignment.employees.Employee;

public class EmployeeUtilities {
	public void demo() {
		Employee employee=new Employee("abcd",123,50000);
		String name=employee.getName();
		System.out.println(name);
		
		double salary=employee.getsalary();
		System.out.println(salary);
		
		employee.setsalary(600000);
		System.out.println("after modifying"+salary);
	}
}

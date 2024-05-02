package com.clone;

public class EmployeeApp {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Sklm", "Ap");
		Employee employee = new Employee(2000, "Bhargav", 55000.00, address);
		System.out.println("original object: " + employee);
		Employee cloned = (Employee) employee.clone();
		System.out.println("cloned object: " + cloned);
		employee.setEmployeeName("Bagi");
		employee.getAddress().setCity("Sklm");
		System.out.println("original object: " + employee);
		System.out.println("cloned object: " + cloned);

	}
}

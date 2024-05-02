package com.clone;

	public class Employee implements Cloneable {
		private int empoyeeId;
		private String employeeName;
		private double salary;
		private Address address;
		private Department dept;

		public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(int empoyeeId, String employeeName, double salary, Address address) {
			super();
			this.empoyeeId = empoyeeId;
			this.employeeName = employeeName;
			this.salary = salary;
			this.address = address;
		}

		public int getEmpoyeeId() {
			return empoyeeId;
		}

		public void setEmpoyeeId(int empoyeeId) {
			this.empoyeeId = empoyeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Employee [empoyeeId=" + empoyeeId + ", employeeName=" + employeeName + ", salary=" + salary
					+ ", address=" + address + "]";
		}

		public Department getDept() {
			return dept;
		}

		public void setDept(Department dept) {
			this.dept = dept;
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			Employee cloned = (Employee) super.clone();
			cloned.setAddress((Address) cloned.getAddress().clone());
			cloned.setDept((Department) cloned.getDept().clone());
			return cloned;
		}
	}



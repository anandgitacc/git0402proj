package org.employee;

public class EmployeeDetails {

	// private -> access specifier/modifier of the method
	// void -> return type of the method
	// empName -> method name
	// () -> arguments/ input / parameter passing place
	// {} -> block of the method / body of the method

	private void empName() {

		System.out.println("Employee name: Anand");
	}
	
	private void empLocation() {
		System.out.println("Chennai");
	}
	
	public static void main(String[] args) {
		
		EmployeeDetails emp = new EmployeeDetails();
		
		emp.empName();
	}
	

}

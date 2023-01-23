package org.inter;

public class Company implements CompanyData,EmployeeDetails{

	public static void main(String[] args) {
		Company a=new Company();
		a.password();
		a.clientId();
		a.emp();
		a.employeeName();
		a.employeeId();
		a.companyName();
		
		

	}

	@Override
	public void employeeName() {
		System.out.println("employee name is karthi");
		
		
	}

	@Override
	public void employeeId() {
		System.out.println("employee id is 12344565");
		
	}

	@Override
	public void password() {
		System.out.println("employee passwird is 12344444");
		
	}

	@Override
	public void companyName() {
		System.out.println("companyname is hcl");
		
	}

	@Override
	public void clientId() {
		System.out.println("client id is 1324");
		
	}

	@Override
	public void emp() {
		System.out.println("emp is 1111111");

		
	}

}

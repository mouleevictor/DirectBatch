package org.simple;

public class Company extends Employee {
	private void companyName() {
		System.out.println("companyname is wipro");

	}

	public static void main(String[] args) {
		Company a=new Company();
		a.companyName();
		a.employeeName();

	}

}

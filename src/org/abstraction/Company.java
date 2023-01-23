package org.abstraction;

public class Company extends CompanyData {
	

	public static void main(String[] args) {
		Company a= new Company();
		a.pssword();
		a.username();
		a.id();
		

	}

	@Override
	public void pssword() {
		System.out.println("user password is 12334455");

		
	}

	@Override
	void id() {
		System.out.println("user id is 5676789");
		
		
	}

}

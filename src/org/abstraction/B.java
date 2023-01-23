package org.abstraction;

public class B extends A{
	public B() {
		super(56);
		System.out.println("b");	
	}
	public static void main(String[] args) {
		B b=new B();
	}

}

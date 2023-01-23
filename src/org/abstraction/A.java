package org.abstraction;

public class A {
	public A() {
		this(22);
		System.out.println("s");
		
	}
	public A(String name) {
		System.out.println("user name"+name);
	}
	public A(int age) {
		this("simbu");
		System.out.println("user age"+age);
	}
	public static void main(String[] args) {
		A a=new A();
	}
	

}

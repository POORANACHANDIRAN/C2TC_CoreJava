package com.cg.dayfour;

public class child extends SingleInheritance{
	public void display() {
		System.out.println("This is child class");
	}
	
	public static void main(String args[]) {
		child ch=new child();
		ch.print();
		ch.display();

	}
}


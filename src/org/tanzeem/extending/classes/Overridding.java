package org.tanzeem.extending.classes;

class A {

	A() {
		print();
	}

	public void print() {
		System.out.println("a");
	}
}

public class Overridding extends A{

	String s = "hello";

	public void print() {
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		Overridding o = new Overridding();
	}

}

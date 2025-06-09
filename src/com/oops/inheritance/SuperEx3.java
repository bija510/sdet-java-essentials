package com.oops.inheritance;

public class SuperEx3 {

	

	public static void main(String[] args) {
		String a,b,c,d,e;
		a= "apple";
		b= "ball";
		c="cat";
		d="dpg";
		
		System.out.println(a+b+c+d);
		SuperEx2 obj = new SuperEx2(); // SuperEx2() = Special Method called Default Constructor

		// constructor is a special method which is called when the object is created
		// When we create the object than it will call the Super class constructor First
		// and then subclass constructor
		// obj.A1();

	}

	

}

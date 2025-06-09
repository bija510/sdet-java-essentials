package com.intermediate.prog;

public class Variables {

	//Global varbs -- class variable
	String name ="Tom";
	int age=25;
	
	public static void main(String[] args) {
		
		int i =10;//local variable for main method
		System.out.println(i);
		
		 Variables  obj =new  Variables();
		 System.out.println(obj.name);
		 System.out.println(obj.age);
	
		
				
	}
	public void sum() {
		int i= 15;//local variable for sum method
	}
}

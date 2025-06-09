package com.oops.inheritance;

import org.testng.annotations.Test;

public class SuperEx2 extends SuperEx1{
	
	SuperEx2(){
		System.out.println("ConstructorB");
	}
	

	//This is called SUB-CLASS
	String bFor ="Ball";
	String aFor= "Adam-2";
	@Test
	public  void B1() {
		System.out.println("Method Ball");
		System.out.println(cFor);
		
/*===========Just try with control + click to know============*/
		System.out.println(aFor); // represent this class
		System.out.println(super.aFor); // from super or parent class
	}

}

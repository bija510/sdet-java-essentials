package com.sdet.iq;

import java.util.stream.IntStream;

public class Iq19_Print1To100WithoutLoop {

	/**
	 * 1. using java recursion [call it self inside method] with if
	 * 2. using java IntStream.range(1,100).forEach method [from java 8] 
	 */
	public static void main(String[] args) {
		//usingRecursion(1);
		IntStream.range(1, 101).forEach(e-> System.out.println(e));
	}

	public static void usingRecursion(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			usingRecursion(num);
		}
	}
	
	
}

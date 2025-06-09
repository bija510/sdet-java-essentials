package com.intermediate.prog;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<Integer>(3);
		myList.add(2);
		myList.add(5);
		myList.add(4);
		myList.add(6);
		
		for(int arrList : myList)
			System.out.println(arrList);
		
		System.out.println();
		System.out.println(myList.size());
		myList.remove(2);
		
		System.out.println(myList.size());
		myList.clear();
		System.out.println(myList.size());
		
		myList.set(0, 1000);
		
			
		

	}

}

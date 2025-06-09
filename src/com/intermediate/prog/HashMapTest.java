package com.intermediate.prog;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a", "apple");
		hm.put("b", "ball");
		
		hm.remove("a", "apple");
		
		System.out.println(hm);
		
		
		
		
		
	}

}

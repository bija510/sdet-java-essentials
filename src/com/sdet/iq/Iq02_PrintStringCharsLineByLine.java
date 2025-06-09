package com.sdet.iq;

public class Iq02_PrintStringCharsLineByLine {

	public static void main(String[] args) {
		String str = "mango";
		
		char[] cr = str.toCharArray();
		
		for(int i=0; i<cr.length; i++) {
			System.out.println(cr[i]);
		}

	}

}

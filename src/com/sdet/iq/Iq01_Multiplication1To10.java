package com.sdet.iq;

import java.util.Scanner;

public class Iq01_Multiplication1To10{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("input number from 1 to 10");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num+"x"+i + "=" + num*i);
		}

	}

}

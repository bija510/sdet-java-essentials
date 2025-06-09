package com.monthly.bill.app;

import java.util.Scanner;

public class MonthlyBillUsing2dArrayTest {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int yearsCount;

	        // Suggest user to enter number of years (minimum 1)
	        do {
	            System.out.print("Enter desired utility bill tracking period in years (minimum: 1): ");
	            while (!sc.hasNextInt()) {
	                System.out.print("Wrong input. Please enter a number: ");
	                sc.next();
	            }
	            yearsCount = sc.nextInt();
	        } while (yearsCount < 1);

	        // Create object of MonthlyBill for multiple years
	        MonthlyBillUsing2dArray bill = new MonthlyBillUsing2dArray(yearsCount);
	        bill.inputBills();    // Enter all data
	        bill.displayBills();  // Showing the summary table

	        sc.close();
	    }
}

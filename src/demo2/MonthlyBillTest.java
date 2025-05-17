package com.demo2;

import java.util.Scanner;

/**
Java Application to process
your utility bill for at-least 6 months. Use Class-Object methodology and use single dimensional
arrays in your application. Write detailed comments in your program. You should have a two
classes (for example, MontlyBill.java & MontlyBillTest.java).
**/

public class MonthlyBillTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUMOF_MONTHS = 8; // Set the number of months

		// Create object for class MontlhyBill
		MonthlyBill bill = new MonthlyBill(NUMOF_MONTHS);

		// Loop to get bill input from the user
		for (int i = 0; i < NUMOF_MONTHS; i++) {
			System.out.print("Enter utility bill for month " + (i + 1) + ": $");
			double amount = sc.nextDouble();

			// Setting bill amount for that month
			bill.setBill(i, amount);
		}

		System.out.println("\n--- Utility Billing Overview ---");
		bill.displayBills();

		// Display total and average bill
		System.out.printf("Total Bill for %d months: $%.2f\n", NUMOF_MONTHS, bill.getTotalBill());
		System.out.printf("Average Monthly Bill: $%.2f\n", bill.getAverageBill());

		sc.close();
	}
}

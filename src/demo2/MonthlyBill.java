package com.demo2;

/**
Java Application to process
your utility bill for at-least 6 months. Use Class-Object methodology and use single dimensional
arrays in your application. Write detailed comments in your program. You should have a two
classes (for example, MontlyBill.java & MontlyBillTest.java).
**/

//Class for storing and process monthly utility bills

public class MonthlyBill {
	// Array to store utility bill amounts for 8 months
	private double[] monthlyBills;

	// Constructor
	public MonthlyBill(int months) {
		monthlyBills = new double[months];
	}

	// setter method (0-indexed)
	public void setBill(int monthIndex, double amount) {
		if (monthIndex >= 0 && monthIndex < monthlyBills.length) {
			monthlyBills[monthIndex] = amount;
		} else {
			System.out.println("Incorrect month index: " + monthIndex);
		}
	}

	// getter method
	public double getBill(int monthIndex) {
		if (monthIndex >= 0 && monthIndex < monthlyBills.length) {
			return monthlyBills[monthIndex];
		} else {
			System.out.println("Incorrect month index.");
			return 0.0;
		}
	}

	// Method to calculate the total bill
	public double getTotalBill() {
		double total = 0.0;
		for (double bill : monthlyBills) {
			total += bill;
		}
		return total;
	}

	// Method to calculate average bill
	public double getAverageBill() {
		return getTotalBill() / monthlyBills.length;
	}

	// Method to display all monthly bills
	public void displayBills() {
		System.out.println("Monthly Utility Bills:");
		for (int i = 0; i < monthlyBills.length; i++) {
			System.out.printf("Month %d: $%.2f\n", i + 1, monthlyBills[i]);
		}
	}
}

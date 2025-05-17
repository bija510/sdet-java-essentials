package com.demo2;

import java.util.Scanner;

public class MonthlyBillUsing2dArray {
	private String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }; // Month
																														// names

	private double[][] billAmounts; // 2D array: [years][months]
	private int numYears;

	// Constructor
	public MonthlyBillUsing2dArray(int numYears) {
		        this.numYears = numYears;
		        billAmounts = new double[numYears][12]; // 12 months per year
		    }

	// Method to input bills for all years
	public void inputBills() {
		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter utility bills for each month and year.");

		for (int year = 0; year < numYears; year++) {
			System.out.println("\nYear " + (year + 1) + ":");
			for (int month = 0; month < 12; month++) {
				System.out.print("Enter bill for " + months[month] + ": $");
				while (!input.hasNextDouble()) {
					System.out.print("Invalid input. Please enter a number: $");
					input.next();
				}
				billAmounts[year][month] = input.nextDouble();
			}
		}
	}

	// Method to display all bills in tabular format
	public void displayBills() {
		System.out.println("\n----------- Utility Bill Overview -----------");
		System.out.printf("%-6s", "Year");
		for (String month : months) {
			System.out.printf("%8s", month);
		}
		System.out.printf("%12s%12s\n", "Total", "Average");

		for (int year = 0; year < numYears; year++) {
			System.out.printf("Year %-2d", year + 1);
			double yearlyTotal = 0;
			for (int month = 0; month < 12; month++) {
				System.out.printf("%8.2f", billAmounts[year][month]);
				yearlyTotal += billAmounts[year][month];
			}
			double average = yearlyTotal / 12;
			System.out.printf("%12.2f%12.2f\n", yearlyTotal, average);
		}
	}
}
